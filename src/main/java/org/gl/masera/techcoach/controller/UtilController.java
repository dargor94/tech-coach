package org.gl.masera.techcoach.controller;

import lombok.AllArgsConstructor;
import org.gl.masera.techcoach.service.BuilderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/utils")
public class UtilController {

    private final BuilderService builderService;

    @GetMapping("/dtos")
    public ResponseEntity<Object[]> getDtos() {
        return new ResponseEntity<>(builderService.getDtos(), HttpStatus.CREATED);
    }

    @PostMapping("/notificate")
    public ResponseEntity<Void> sendNotification(@RequestParam("type") String notificationType) {
        builderService.sendNotification(notificationType);
        return ResponseEntity.noContent().build();
    }

}
