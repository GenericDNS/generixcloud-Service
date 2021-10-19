package eu.generixcloud.api.utils.threading.scheduler;

import eu.generixcloud.api.utils.definer.GenerixManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GenericDNS on 19.10.2021.
 */
public class SimpleSchedulerManager implements GenerixManager {

    private static final List<IGenerixScheduler> schedulers = new ArrayList<IGenerixScheduler>();

}
