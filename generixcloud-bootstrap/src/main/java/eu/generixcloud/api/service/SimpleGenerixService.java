package eu.generixcloud.api.service;

import eu.generixcloud.api.event.IEventManager;
import eu.generixcloud.api.event.component.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by GenericDNS on 19.10.2021.
 */
public class SimpleGenerixService implements IGenerixService {

    private static final List<IEventManager> eventManagers = new ArrayList<IEventManager>();

    private static final Map<IEventManager, List<Class<? extends EventListener>>> listeners = new HashMap<IEventManager, List<Class<? extends EventListener>>>();

    public List<IEventManager> eventManagers() {
        return eventManagers;
    }

    public Map<IEventManager, List<Class<? extends EventListener>>> listeners() {
        return listeners;
    }

}
