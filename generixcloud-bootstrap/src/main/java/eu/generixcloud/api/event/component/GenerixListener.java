package eu.generixcloud.api.event.component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by GenericDNS on 18.10.2021.
 * An annotation to mark methods as being syntax event methods
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GenerixListener {

    /**
     * Define if the handler ignores a cancelled event.
     * <p>
     * If ignoreCancelled is true and the event is cancelled, the method is
     * not called. Otherwise, the method is always called.
     */
    boolean ignoreCancelled() default false;

}
