package org.gl.masera.techcoach.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.gl.masera.techcoach.client.CustomerSpClient;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerSpClient customerSpClient;

    public void getCustomerByNameThenUpdateByStatus(String customerId) {
        var uuid = customerSpClient.getCustomerByNameThenUpdateByStatusSp(UUID.fromString(customerId));
        log.info(uuid.toString());
    }

}
