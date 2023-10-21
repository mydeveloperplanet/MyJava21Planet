package com.mydeveloperplanet.myjava21planet;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreads {

    public static void main(String[] args) {
        testVirtualThreads(1000);
        testVirtualThreads(10_000);
        testVirtualThreads(100_000);
        testVirtualThreads(1_000_000);
        testVirtualThreads(10_000_000);
    }

    private static void testVirtualThreads(int maximum) {
        long time = System.currentTimeMillis();

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, maximum).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(1));
                    return i;
                });
            });
        }

        time = System.currentTimeMillis() - time;
        System.out.println("Number of threads = " + maximum + ", Duration(ms) = " + time);
    }

}
