package org.gl.masera.techcoach.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SmsNotification extends Notification {
    @Override
    void send() {
        log.info("Sending sms notification");
    }
}
