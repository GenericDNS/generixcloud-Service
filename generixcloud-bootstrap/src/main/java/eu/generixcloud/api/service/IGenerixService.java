package eu.generixcloud.api.service;

import eu.generixcloud.api.event.IEventManager;
import eu.generixcloud.api.event.component.EventListener;
import eu.generixcloud.api.event.component.GenerixListener;
import eu.generixcloud.api.utils.GenerixObject;
import eu.generixcloud.api.utils.ObjectDefiner;

import java.util.List;
import java.util.Map;

/**
 * Created by GenericDNS on 19.10.2021.
 */
public interface IGenerixService extends GenerixObject<ObjectDefiner> {

    public List<IEventManager> eventManagers();

    public Map<IEventManager, List<Class<? extends EventListener>> > listeners();

}
