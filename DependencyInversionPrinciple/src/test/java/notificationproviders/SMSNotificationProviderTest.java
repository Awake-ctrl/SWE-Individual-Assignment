package notificationproviders;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SMSNotificationProviderTest {

    @Test
    void sendMessageTest() {
        INotificationProvider tester = new SMSNotificationProvider();
        assertEquals("SMS Notification: Test Message", tester.sendMessage("Test Message"));
    }

    @Test
    void getNameTest() {
        INotificationProvider tester = new SMSNotificationProvider();
        assertEquals("SMS Notification Provider", tester.getName());
    }
}
