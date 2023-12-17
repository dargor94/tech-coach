package org.gl.masera.techcoach.service;

import lombok.RequiredArgsConstructor;
import org.gl.masera.techcoach.util.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BuilderService {

    private static final String EMAIL = "EMAIL";
    private static final String SMS = "SMS";
    private final NotificationUtil notificationUtil;

    public Object[] getDtos() {
        var house = Mapper.toHouseDto();
        var castle = Mapper.toCastleDto();
        return new Object[]{house, castle};
    }

    public void sendNotification(String notificationType) {
        Notification notification;
        if (notificationType.equalsIgnoreCase(EMAIL)) {
            notification = new EmailNotification();

        } else if (notificationType.equalsIgnoreCase(SMS)) {
            notification = new SmsNotification();
        } else {
            throw new RuntimeException("Notification type no valid");
        }
        notificationUtil.sendNotification(notification);
    }


}

