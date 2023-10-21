package com.mydeveloperplanet.myjava21planet;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class PlatformThreads {

    public static void main(String[] args) {
        testPlatformThreads(1000);
        testPlatformThreads(10_000);
        testPlatformThreads(100_000);
        testPlatformThreads(1_000_000);
    }

    private static void testPlatformThreads(int maximum) {
        long time = System.currentTimeMillis();

        try (var executor = Executors.newCachedThreadPool()) {
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
