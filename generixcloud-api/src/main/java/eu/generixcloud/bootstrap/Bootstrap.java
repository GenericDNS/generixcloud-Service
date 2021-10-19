package eu.generixcloud.bootstrap;

/**
 * Created by GenericDNS on 18.10.2021.
 */
public final class Bootstrap extends BootstrapModule {

    /**
     * Creates a new Cloud instance
     * @param args the program arguments
     */
    public static void main(String[] args) {
        BootstrapModule bootstrapModule = new Bootstrap();
        bootstrapModule.enable(args);
    }

    /**
     * Launches the cloud with different arguments
     * @param args program arguments [Master, Wrapper...]
     */
    public void enable(String[] args) {
        cloudInit.init(args);
    }

    private static interface cloudInit {

        /**
         * Launches the cloud with different arguments
         * @param args program arguments [Master, Wrapper...]
         */
        public static void init(String[] args) {

        }

    }

}
