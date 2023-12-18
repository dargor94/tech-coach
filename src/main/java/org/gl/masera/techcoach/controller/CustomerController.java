package org.gl.masera.techcoach.controller;

import lombok.AllArgsConstructor;
import org.gl.masera.techcoach.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/{customerId}/update-by-status")
    public ResponseEntity<Void> logFileContent(@PathVariable String customerId) {
        customerService.getCustomerByNameThenUpdateByStatus(customerId);
        return ResponseEntity.noContent().build();
    }

}
