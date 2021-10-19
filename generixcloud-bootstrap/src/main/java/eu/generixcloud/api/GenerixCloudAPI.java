package eu.generixcloud.api;

import eu.generixcloud.api.service.GenerixServiceManager;
import eu.generixcloud.api.utils.GenerixObject;
import eu.generixcloud.api.utils.ObjectDefiner;

/**
 * Created by GenericDNS on 18.10.2021.
 */
public abstract class GenerixCloudAPI implements GenerixObject<ObjectDefiner> {

    private static GenerixCloudAPI instance;

    final GenerixServiceManager generixServiceManager;

    public GenerixCloudAPI() {

        instance = this;

        this.generixServiceManager = new GenerixServiceManager();

    }

    public GenerixServiceManager getGenerixServiceManager() {
        return generixServiceManager;
    }

    public static GenerixCloudAPI getInstance() {
        return instance;
    }
}
