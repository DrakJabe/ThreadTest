package com.myly.java;

import java.util.concurrent.*;

public class TestLamabda3 implements Runnable{
    public static void main(String[] args) {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(1,2,
                0L, TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>(3),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        tpe.execute(new TestLamabda3("线程1"));
        tpe.execute(new TestLamabda3("线程2"));
        tpe.execute(new TestLamabda3("线程3"));
        tpe.execute(new TestLamabda3("线程4"));
        tpe.execute(new TestLamabda3("线程5"));
        tpe.execute(new TestLamabda3("线程6"));


    }

    private String taskName;
    public TestLamabda3(String taskName){
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("线程名："+Thread.currentThread().getName()+"  执行："+taskName);
    }
}
