package eu.generixcloud.api.utils.threading.scheduler;

import eu.generixcloud.api.utils.GenerixObject;
import eu.generixcloud.api.utils.ObjectDefiner;

import java.util.Timer;

/**
 * Created by GenericDNS on 19.10.2021.
 */
public class SimpleGenerixScheduler implements ObjectDefiner, IGenerixScheduler {

    final Timer timer = new Timer();

}
