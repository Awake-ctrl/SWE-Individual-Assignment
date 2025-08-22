package controller;

import notificationproviders.INotificationProvider;
import notificationproviders.NotificationFactory;

/**
 * Main demonstration class for Dependency Inversion Principle.
 * <p>
 * This class provides executable examples of how Dependency Inversion Principle works
 * using the NofiticationFactory and INotificationProvider implementations.
 * </p>
 *
 * @author Nikhil S Thomas
 * @version 1.0.0
 * @since 1.0.0
 */
public class Program {
    /**
     * Main entry point for demonstrating the Dependency Inversion Principle.
     * <p>
     * This example shows how client code depends on the abstraction
     * {@link notificationproviders.INotificationProvider} rather than
     * concrete implementations (e.g., SMS, Email, Push).
     * </p>
     * <p>The program flow is:</p>
     * <ul>
     *   <li>Obtain a notification provider instance from the {@link notificationproviders.NotificationFactory}
     *       based on a given type ("sms" in this case).</li>
     *   <li>If a valid provider is returned, display its name and send a test message.</li>
     *   <li>If no valid provider matches the type, display an error message.</li>
     * </ul>
     *
     * @param args command line arguments (not used)
     */
    public static void main(final String[] args) {
        // Create the various notification provider instances.
        final INotificationProvider notificationProvider = NotificationFactory.getNotificationProvider("sms");

        if (notificationProvider != null) {
            System.out.println("Sending notification via " + notificationProvider.getName());
            notificationProvider.sendMessage("Test message for notification service");
        } else {
            System.out.println("Not a valid Notification Provider");
        }
    }
}
