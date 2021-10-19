package eu.generixcloud.api.message;

/**
 * Created by GenericDNS on 19.10.2021.
 */
public enum MessageType {

    /**
     * Is a text output that is handled as an error
     * Is the normal template type to send errors to the server
     * Errors can occur if something went wrong in the code or was configured incorrectly
     */
    ERROR("[ERROR]"),
    /**
     * Is a text output, which is handled as a message
     * Is the normal template way to send messages to the server
     */
    MESSAGE("[INFO]"),
    /**
     * Is a text output, which is handled as a permission error
     * this error specifies the default error
     * Permission errors can occur if something went wrong in the code of the permission or has been configured incorrectly
     */
    PERMISSION("[PERMS]"),
    /**
     * Is a text output available, which is handled as a user error
     * this error specifies the default error
     * User errors can occur if the user's code has gone wrong or has been configured incorrectly
     */
    USER("[USER]"),
    /**
     * Is a text output, which is handled as a waring
     * A warning occurs as soon as properties happen that are not regular and could harm the server
     */
    WARNING("[WARNING]");

    /**
     * message which is output when the message is sent
     */
    String message;

    /**
     *
     * initializes the message that is output when the message is sent to the console
     *
     * @param message initializes the message that is output when the message is sent to the console
     */
    MessageType(String message) {
        this.message = message;
    }

}
