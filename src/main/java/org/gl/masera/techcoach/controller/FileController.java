package org.gl.masera.techcoach.controller;

import lombok.AllArgsConstructor;
import org.gl.masera.techcoach.service.FileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/files")
public class FileController {

    private final FileService fileService;

    @PostMapping("/content/log")
    public ResponseEntity<Void> logFileContent() {
        fileService.logFileContent();
        return ResponseEntity.noContent().build();
    }

}
