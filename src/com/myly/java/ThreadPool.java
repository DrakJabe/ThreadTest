package com.myly.java;

import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String[] args) {

        Executors.newCachedThreadPool();

        Executors.newFixedThreadPool(3);

        Executors.newScheduledThreadPool(3);

        Executors.newSingleThreadExecutor();

    }

}
