package org.gl.masera.techcoach.util;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.Instant;
import java.util.concurrent.CountDownLatch;

@Slf4j
@Setter
public class FileReaderTask implements Runnable {

    private final CountDownLatch latch;
    private String fileName;
    private Thread t = new Thread(this);

    public FileReaderTask(CountDownLatch latch) {
        this.latch = latch;
        t.start();
    }

    @Override
    public void run() {
        try {
            log.info(String.format("[ %s ] created, blocked by the latch...", Thread.currentThread().getId()));
            latch.await();
            log.info(String.format("[ %s ] starts at: %s", Thread.currentThread().getId(), Instant.now()));
            FileReader fileReader = null;
            while (fileReader == null) {
                fileReader = FileReader.getInstance();
                if (fileReader == null) {
                    log.info(String.format("Couldn't access singleton on thread %s", Thread.currentThread().getId()));
                    Thread.sleep(1000);
                }
            }
            fileReader.logFileContent(fileName);
            log.info(String.format("Singleton is: %s", fileReader.hashCode()));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
