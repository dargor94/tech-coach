package org.gl.masera.techcoach.util;

import org.springframework.stereotype.Component;

@Component
public class NotificationUtil {

    public void sendNotification(Notification notification) {
        notification.send();
    }

}
