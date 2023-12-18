package org.gl.masera.techcoach.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class CustomerSpClient {


    //private final CustomerDbComponent customerDb;

    public UUID getCustomerByNameThenUpdateByStatusSp(UUID customerId) {
        log.info(customerId.toString());
        //customerDb.getCustomerByNameThenUpdateByStatusSp(customerId, A_STATUS);
        return UUID.randomUUID();
    }

}
