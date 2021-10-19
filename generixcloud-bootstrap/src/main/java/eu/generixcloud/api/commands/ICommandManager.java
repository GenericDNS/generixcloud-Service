package eu.generixcloud.api.commands;

import eu.generixcloud.api.utils.GenerixObject;
import eu.generixcloud.api.utils.definer.GenerixManager;

/**
 * Created by GenericDNS on 19.10.2021.
 */
public interface ICommandManager extends GenerixObject<GenerixManager> {

    public void register(String command, CommandExecutor executor);

    public void listenCommands(boolean b);

}
