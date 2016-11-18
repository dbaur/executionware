import de.uniulm.omi.cloudiator.sword.api.domain.HardwareFlavor;
import de.uniulm.omi.cloudiator.sword.api.domain.Image;
import de.uniulm.omi.cloudiator.sword.api.domain.Location;
import de.uniulm.omi.cloudiator.sword.api.domain.VirtualMachine;
import de.uniulm.omi.cloudiator.sword.api.service.ComputeService;
import de.uniulm.omi.cloudiator.sword.service.ServiceBuilder;

/**
 * Example depicting the information needed
 * to build a compute service for the Flexiant Cloud Orchestrator.
 */
public class FlexiantExample {

    public static void main(String[] args) {

        /**
         * The login name used for FCO.
         */
        final String mail = "me@example.com";
        /**
         * The uuid of your user, can be retrieved via
         * user details.
         */
        final String uuid = "07a77df9-04f9-49ba-9112-c903f1661c50";

        /**
         * The api username. Concatenation of mail and uuid. Can
         * also be retrieved via user details.
         */
        final String apiUsername = mail + "/" + uuid;

        /**
         * Your FCO login password.
         */
        final String password = "MySecretPassword";
        /**
         * The api endpoint of your FCO installation.
         */
        final String endpoint = "https://endpoint.flexiant.net";
        /**
         * A string depicting your node group. Used to identify the machines
         * management by sword.
         */
        final String nodeGroup = "nodeGroup";

        /**
         * Builds the compute service
         */
        ComputeService<HardwareFlavor, Image, Location, VirtualMachine> flexiant =
            ServiceBuilder.newServiceBuilder("flexiant").credentials(apiUsername, password)
                .endpoint(endpoint).nodeGroup(nodeGroup).build();
    }

}