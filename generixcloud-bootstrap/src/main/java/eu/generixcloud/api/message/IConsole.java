package eu.generixcloud.api.message;

/**
 * Created by GenericDNS on 19.10.2021.
 */
public interface IConsole {

    public String prefix();

    public void sendMessage(String message);

    public void sendMessage(String message, MessageType type);

}
