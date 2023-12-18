package org.gl.masera.techcoach.service;

import org.gl.masera.techcoach.util.file.FileReaderTask;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;


@Service
public class FileServiceImpl implements FileService {

    private final List<Runnable> tasks = new ArrayList<>();
    private final CountDownLatch latch = new CountDownLatch(1);


    @Override
    public void logFileContent() {
        setTasks();
        tasks.forEach(Runnable::run);
        latch.countDown();
        tasks.clear();
    }

    private void setTasks() {
        IntStream.range(1, 3).forEach((i) -> tasks.add(() -> {
            var task = new FileReaderTask(latch);
            task.setFileName("file.txt");
        }));
    }

}
