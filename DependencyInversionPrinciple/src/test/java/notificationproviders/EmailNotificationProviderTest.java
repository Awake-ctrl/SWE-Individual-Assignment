package notificationproviders;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmailNotificationProviderTest {

    @Test
    void sendMessageTest() {
        INotificationProvider tester = new EmailNotificationProvider();
        assertEquals("Email Notification: Test Message", tester.sendMessage("Test Message"));
    }

    @Test
    void getNameTest() {
        INotificationProvider tester = new EmailNotificationProvider();
        assertEquals("Email Notification Provider", tester.getName());
    }
}
