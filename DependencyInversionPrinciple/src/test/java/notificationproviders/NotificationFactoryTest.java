package notificationproviders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationFactoryTest {

    @Test
    void getEmailNotificationProviderTest() {
        assertInstanceOf(EmailNotificationProvider.class, NotificationFactory.getNotificationProvider("email"));
    }

    @Test
    void getSMSNotificationProviderTest() {
        assertInstanceOf(SMSNotificationProvider.class, NotificationFactory.getNotificationProvider("sms"));
    }

    @Test
    void getPushNotificationProviderTest() {
        assertInstanceOf(PushNotificationProvider.class, NotificationFactory.getNotificationProvider("push"));
    }

    @Test
    void getNullProviderTest() {
        assertNull(NotificationFactory.getNotificationProvider("test"));
    }
}