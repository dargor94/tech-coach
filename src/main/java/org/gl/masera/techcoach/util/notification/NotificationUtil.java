package org.gl.masera.techcoach.util.notification;

import org.springframework.stereotype.Component;

@Component
public class NotificationUtil {

    public void sendNotification(Notification notification) {
        notification.send();
    }

}
