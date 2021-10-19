package eu.generixcloud.api.event;

import eu.generixcloud.api.GenerixCloudAPI;
import eu.generixcloud.api.event.component.EventListener;
import eu.generixcloud.api.event.component.GenerixEvent;
import eu.generixcloud.api.event.component.GenerixListener;
import eu.generixcloud.api.service.IGenerixService;
import eu.generixcloud.api.utils.GenerixObject;
import eu.generixcloud.api.utils.definer.GenerixManager;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GenericDNS on 18.10.2021.
 */
public class SimpleEventManager implements GenerixObject<GenerixManager>, IEventManager {

    final private List<Class<? extends EventListener>> registeredListener = new ArrayList<>();

    @Override
    public List<Class<? extends EventListener>> registeredListener() {
        return registeredListener;
    }

    public void registerEvents(Class<? extends EventListener> listener, IGenerixService service) {
        service.listeners().get(this).add(listener);
    }

    public void unregisterEventManager(IGenerixService generixService) {
        generixService.listeners().remove(this);
    }

    public void unregisterEvents(Class<? extends EventListener> listener, IGenerixService service) {
        service.listeners().get(this).remove(listener);
    }

    public void registerEventManager(IGenerixService generixService) {
        generixService.listeners().put(this, new ArrayList<Class<? extends EventListener>>());
    }

    public void callEvent(Class<?> listener, Object... args) {
        for (Class< ? extends EventListener > listeners : registeredListener) {
            for (Method method : listeners.getMethods()) {
                if (method.isAnnotationPresent(GenerixListener.class)) {
                    for (Parameter parameters : method.getParameters()) {
                        if (parameters.getType().equals(listener)) {
                            try {
                                Constructor<GenerixEvent> remoteEvent = GenerixEvent.class.getDeclaredConstructor();
                                GenerixEvent instanz = remoteEvent.newInstance(args);
                            } catch (Exception exception) {
                                exception.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }

    public static void callEvents(Class<?> listener, Object... args) {
        for (IGenerixService generixService : GenerixCloudAPI.getInstance().getGenerixServiceManager().getServices()) {
            for (IEventManager eventManager : generixService.eventManagers()) {
                for (Class< ? extends EventListener > listeners : eventManager.registeredListener()) {
                    for (Method method : listeners.getMethods()) {
                        if (method.isAnnotationPresent(GenerixListener.class)) {
                            for (Parameter parameters : method.getParameters()) {
                                if (parameters.getType().equals(listener)) {
                                    try {
                                        Constructor<GenerixEvent> remoteEvent = GenerixEvent.class.getDeclaredConstructor();
                                        GenerixEvent instanz = remoteEvent.newInstance(args);
                                    } catch (Exception exception) {
                                        exception.printStackTrace();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
