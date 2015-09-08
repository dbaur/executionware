package de.uniulm.omi.cloudiator.sword.api.remote;

/**
 * Created by Daniel Seybold on 04.05.2015.
 */
public interface RemoteConnection {

    /**
     * @param command the command to be executed by the RemoteConnection
     * @return the exit value of the executed command
     */
    int executeCommand(String command);

    /**
     * Writes content to the specified file, creates the file if it doesn't exist
     *
     * @param pathAndFilename to the file
     * @param content         of the file to write
     * @param setExecutable   if the file is executable
     * @return the exit value when the file is written
     */
    int writeFile(String pathAndFilename, String content, boolean setExecutable);

    void close();
}
