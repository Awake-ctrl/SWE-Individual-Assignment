package notificationproviders;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PushNotificationProviderTest {

    @Test
    void sendMessageTest() {
        INotificationProvider tester = new PushNotificationProvider();
        assertEquals("Push Notification: Test Message", tester.sendMessage("Test Message"));
    }

    @Test
    void getNameTest() {
        INotificationProvider tester = new PushNotificationProvider();
        assertEquals("Push Notification Provider", tester.getName());
    }
}
