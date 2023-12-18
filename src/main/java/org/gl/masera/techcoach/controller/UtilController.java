package org.gl.masera.techcoach.controller;

import lombok.AllArgsConstructor;
import org.gl.masera.techcoach.service.UtilService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/utils")
public class UtilController {

    private final UtilService utilService;

    @GetMapping("/dtos")
    public ResponseEntity<Object[]> getDtos() {
        return new ResponseEntity<>(utilService.getDtos(), HttpStatus.CREATED);
    }

    @PostMapping("/notificate")
    public ResponseEntity<Void> sendNotification(@RequestParam("type") String notificationType) {
        utilService.sendNotification(notificationType);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/data/log")
    public ResponseEntity<Void> logData(@RequestParam("type") String dataType, @RequestBody String xml) {
        utilService.logData(dataType, xml);
        return ResponseEntity.noContent().build();
    }

}
