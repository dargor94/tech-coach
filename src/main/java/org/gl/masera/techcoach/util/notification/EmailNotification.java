package org.gl.masera.techcoach.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailNotification extends Notification {
    @Override
    public void send() {
        log.info("Sending email notification");
    }
}
