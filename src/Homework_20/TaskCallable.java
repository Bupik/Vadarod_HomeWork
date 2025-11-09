package Homework_20;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskCallable implements Callable {
    private int taskNumber;

    public TaskCallable(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String call() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Задача " + taskNumber + " работает в потоке " + threadName);

        String fileName = "file_" + taskNumber + ".txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Задача № " + taskNumber + "\n");
            writer.write("Поток: № " + threadName + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Ошибка при записи файла");
        }

        try {
            int pause = new Random().nextInt(3) + 1;
            Thread.sleep(pause * 1000);
        } catch (Exception e) {
            System.out.println("Ошибка сна");
        }

        return fileName;
    }

    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        List<Future<String>> results = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            TaskCallable task = new TaskCallable(i);
            Future<String> result = pool.submit(task);
            results.add(result);
        }

        for (Future<String> future : results) {
            String file = future.get();
            System.out.println("Создан файл: " + file);
        }

        pool.shutdown();
    }
}