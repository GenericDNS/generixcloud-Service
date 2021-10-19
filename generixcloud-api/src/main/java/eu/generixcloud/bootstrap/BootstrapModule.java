package eu.generixcloud.bootstrap;

/**
 * Created by GenericDNS on 18.10.2021.
 */
public abstract class BootstrapModule {

    /**
     * Launches the cloud with different arguments
     * @param args program arguments [Master, Wrapper...]
     */
    public abstract void enable(String[] args);

}
