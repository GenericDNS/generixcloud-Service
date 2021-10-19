package eu.generixcloud.api.event;

import eu.generixcloud.api.event.component.EventListener;
import eu.generixcloud.api.service.IGenerixService;
import eu.generixcloud.api.utils.GenerixObject;
import eu.generixcloud.api.utils.definer.GenerixManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GenericDNS on 18.10.2021.
 */
public interface IEventManager extends GenerixObject<GenerixManager> {

    public List<Class<? extends EventListener>> registeredListener();

    /**
     *
     * Registers a listener to a service of this manager
     *
     * @param listener which is registered in this manager
     * @param service service from this manager
     */
    public void registerEvents(Class<? extends EventListener> listener, IGenerixService service);

    /**
     *
     * registers this EventManager to the specified service
     *
     * @param generixService specified service
     */
    public void unregisterEventManager(IGenerixService generixService);

    /**
     *
     * removes a listener from the requested service
     *
     * @param listener which should be removed from the list
     * @param service service from this manager
     */
    public void unregisterEvents(Class<? extends EventListener> listener, IGenerixService service);

    /**
     *
     * unregisters this EventManager to the specified service
     *
     * @param generixService specified service
     */
    public void registerEventManager(IGenerixService generixService);

    /**
     *
     * calls all registered cloud events
     * provided way by syntax to call a listener
     *
     * @param listener event which should be called
     */
    public void callEvent(Class<?> listener, Object... args);

}
