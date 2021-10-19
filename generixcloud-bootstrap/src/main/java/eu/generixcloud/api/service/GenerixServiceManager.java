package eu.generixcloud.api.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GenericDNS on 19.10.2021.
 */
public class GenerixServiceManager {

    private final List<IGenerixService> services = new ArrayList<>();

    public List<IGenerixService> getServices() {
        return services;
    }
}
