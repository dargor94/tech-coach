package org.gl.masera.techcoach.service;

import lombok.RequiredArgsConstructor;
import org.gl.masera.techcoach.util.building.BuildingMapper;
import org.gl.masera.techcoach.util.data.log.DataLoggerUtil;
import org.gl.masera.techcoach.util.notification.EmailNotification;
import org.gl.masera.techcoach.util.notification.Notification;
import org.gl.masera.techcoach.util.notification.NotificationUtil;
import org.gl.masera.techcoach.util.notification.SmsNotification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UtilService {

    private static final String EMAIL = "EMAIL";
    private static final String SMS = "SMS";

    private final NotificationUtil notificationUtil;
    private final DataLoggerUtil dataLoggerUtil;

    public Object[] getDtos() {
        var house = BuildingMapper.toHouseDto();
        var castle = BuildingMapper.toCastleDto();
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

    public void logData(String type, String xml) {
        if (type.equalsIgnoreCase("YAML")) {
            dataLoggerUtil.convertXmlToYaml(xml);
        } else if (type.equalsIgnoreCase("JSON")) {
            dataLoggerUtil.convertXmlToJson(xml);
        } else {
            throw new RuntimeException("Notification type no valid");
        }
    }

}

