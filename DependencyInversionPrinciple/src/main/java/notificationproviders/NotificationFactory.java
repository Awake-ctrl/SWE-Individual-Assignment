package notificationproviders;

/**
 * Factory class for creating instances of {@link INotificationProvider}.
 * <p>
 * This class centralizes the creation of different notification provider
 * implementations (e.g., SMS, Email, Push). By returning objects of the
 * {@link INotificationProvider} interface, it enforces the Dependency
 * Inversion Principle: client code depends on the abstraction rather
 * than concrete implementations.
 * </p>
 *
 * <p>Program flow:</p>
 * <ul>
 *   <li>Receives a provider type as a string input (e.g., "sms", "email", "push").</li>
 *   <li>Uses a {@code switch} expression to instantiate the appropriate
 *       notification provider.</li>
 *   <li>If the type does not match a known provider, returns {@code null}.</li>
 * </ul>
 * @author Nikhil S Thomas
 * @version 1.0.0
 * @since 1.0.0
 */
public class NotificationFactory {
    /**
     * Returns a notification provider instance for the given type.
     *
     * @param type provider type ("sms", "email", "push")
     * @return matching {@link INotificationProvider}, or {@code null} if unsupported
     */
    public static INotificationProvider getNotificationProvider(final String type) {
        return switch (type) {
            case "sms" -> new SMSNotificationProvider();
            case "email" -> new EmailNotificationProvider();
            case "push" -> new PushNotificationProvider();
            default -> null;
        };
    }
}
