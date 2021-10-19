package eu.generixcloud.api.commands;

import eu.generixcloud.api.utils.GenerixObject;
import eu.generixcloud.api.utils.definer.GenerixManager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by GenericDNS on 19.10.2021.
 */
public class SimpleCommandManager implements ICommandManager, GenerixObject<GenerixManager> {

    /**
     * all registered commands with strings
     */
    private static final HashMap<String, CommandExecutor> commandExecutors = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    /**
     * Waits for registered commands specified by a user
     * the first arg is the actual command then come the subcommands
     * only as many args are instantiated as if they were entered
     */
    public void listenCommands(boolean b) {
        if (b) {
            this.scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            for (String commands : commandExecutors.keySet()) {
                if (commands.equalsIgnoreCase(command.split(" ")[0])) {
                    String[] args = command.split(" ");
                    try {
                        commandExecutors.get(commands).execute(command.split(" "));
                    } catch (Exception ignored) {
                    }
                    listenCommands(true);
                }
            }
            listenCommands(true);
        } else {
            scanner.close();
        }
    }

    /**
     *
     * removes a registered command
     * removes the executor as well as the command string
     *
     * @param command command which is to be removed from the registered commands
     */
    public static void unRegister(String command) {
        commandExecutors.remove(command);
    }

    public void register(String command, CommandExecutor executor) {
        command = command.replace(" ", "");
        if (executor != null) {
            commandExecutors.put(command, executor);
        }
    }

}
