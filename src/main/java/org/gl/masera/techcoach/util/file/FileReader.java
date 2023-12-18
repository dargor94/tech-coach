package org.gl.masera.techcoach.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Slf4j
public class FileReader {

    private static final Lock lock = new ReentrantLock(true);
    private static FileReader INSTANCE;

    private FileReader() {

    }

    public static FileReader getInstance() {
        if (ObjectUtils.isEmpty(INSTANCE) && lock.tryLock()) {
            log.info(String.format("Lock acquired on thread %s", Thread.currentThread().getId()));
            INSTANCE = new FileReader();
            lock.unlock();
        }
        return INSTANCE;
    }

    public void logFileContent(String pathToFile) {
        try {
            var path = Paths.get(pathToFile);
            var file = path.toFile();
            if (file.canRead())
                Files.readAllLines(path).forEach(log::info);
        } catch (IOException e) {
            log.error(e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
