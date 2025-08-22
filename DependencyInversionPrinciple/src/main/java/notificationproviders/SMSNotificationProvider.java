package notificationproviders;

/**
 * SMS-based implementation of the {@link INotificationProvider} interface.
 * <p>
 * This class demonstrates how a concrete notification provider can implement
 * the abstraction defined by {@link INotificationProvider}. It simulates sending
 * notifications through an SMS channel.
 * </p>
 *
 * <p>Program flow for this provider:</p>
 * <ul>
 *   <li>Provides a constructor (currently no initialization logic).</li>
 *   <li>Implements {@link #sendMessage(String)} to simulate sending a message via SMS.</li>
 *   <li>Implements {@link #getName()} to return the name of this provider.</li>
 * </ul>
 *
 * @author Nikhil S Thomas
 * @version 1.0.0
 * @since 1.0.0
 */
public class SMSNotificationProvider implements INotificationProvider {
    public SMSNotificationProvider() {
        // Constructor logic if needed
    }

    @Override
    public void sendMessage(final String message) {
        // Actual implementation of sending message

        // Simulating sending a message
        System.out.println("SMS Notification: " + message);
    }

    @Override
    public String getName() {
        return "SMS Notification Provider";
    }
}
