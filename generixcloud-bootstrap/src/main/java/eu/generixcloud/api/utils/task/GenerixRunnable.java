package eu.generixcloud.api.utils.task;

import eu.generixcloud.api.utils.GenerixObject;
import eu.generixcloud.api.utils.ObjectDefiner;

/**
 * Created by GenericDNS on 19.10.2021.
 */
public interface GenerixRunnable extends Runnable, ObjectDefiner, GenerixObject<ObjectDefiner> {

    public void run();

}
