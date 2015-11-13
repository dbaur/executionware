package de.uniulm.omi.cloudiator.sword.remote.overthere;

import com.xebialabs.overthere.CmdLine;
import de.uniulm.omi.cloudiator.sword.api.remote.RemoteConnection;
import de.uniulm.omi.cloudiator.sword.api.remote.RemoteConnectionResponse;
import de.uniulm.omi.cloudiator.sword.api.remote.RemoteException;

/**
 * Created by daniel on 19.08.15.
 */
//todo remove duplicated code
public class OverthereWinRMConnection implements RemoteConnection {

    private final SwordOverthereConnection delegate;

    OverthereWinRMConnection(SwordOverthereConnection delegate) {
        this.delegate = delegate;
    }

    @Override public RemoteConnectionResponse executeCommand(String command)
        throws RemoteException {
        //TODO: check why the Overthere encoding doesn't work for Windows and Linux!
        //split the command into separate commands otherwise Windows commands can't be recognized

        String[] splittedCommands = command.split("\\s+");

        OverthereRemoteConnectionResponse response = new OverthereRemoteConnectionResponse();
        response.setExitStatus(delegate.execute(response.getStdOutExecutionOutputHandler(),
            response.getStdErrExecutionOutputHandler(), CmdLine.build(splittedCommands)));
        return response;

    }

    @Override public int writeFile(String pathAndFilename, String content, boolean setExecutable)
        throws RemoteException {

        //todo: ignores setExecutable?

        //spilt at newline
        String[] splittedContent = content.split("\\r?\\n");

        //use powershell Add-Content to avoid line break issues with windows in config file
        for (String line : splittedContent) {
            this.executeCommand(
                "powershell -command  Add-Content " + pathAndFilename + " '" + line + "'");
        }

        //todo check this return value
        return 0;
    }

    @Override public void close() {
        delegate.close();
    }
}