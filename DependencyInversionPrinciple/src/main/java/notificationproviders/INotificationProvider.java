package notificationproviders;

/**
 * Abstraction for all notification providers.
 * <p>
 * This interface defines the contract that all concrete
 * notification providers (e.g., Email, SMS, Push) must implement.
 * It enforces the Dependency Inversion Principle by ensuring that
 * client code depends on this abstraction rather than directly
 * on specific implementations.
 * </p>
 *
 * <p>Expected functionality:</p>
 * <ul>
 *   <li>{@link #sendMessage(String)} — send a notification message
 *       using the provider's channel.</li>
 *   <li>{@link #getName()} — return the provider's identifying name.</li>
 * </ul>
 *
 * @author Nikhil S Thomas
 * @version 1.0.0
 * @since 1.0.0
 */
public interface INotificationProvider {
    String sendMessage(String message);

    String getName();
}
