package org.gl.masera.techcoach.util.notification;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SmsNotification extends Notification {
    @Override
    void sendNotification() {
        log.info("Sending sms notification");
    }
}
