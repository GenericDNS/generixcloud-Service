package eu.generixcloud.api.commands;

import eu.generixcloud.api.utils.GenerixObject;
import eu.generixcloud.api.utils.ObjectDefiner;

/**
 * Created by GenericDNS on 19.10.2021.
 */
public interface CommandExecutor extends GenerixObject<ObjectDefiner> {

    public void execute(String[] args);

}
