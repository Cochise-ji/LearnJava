package org.cochise.Points07_Thread;

import java.util.Arrays;
import java.util.List;

/**
 * 匿名内部类实现多线程
 */
public class Main {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    System.out.println(Thread.currentThread().getName() + "--------" + i);
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    System.out.println(Thread.currentThread().getName() + "--------" + i);
                }
            }
        }).start();

        // lambda表达式写法
        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.println(Thread.currentThread().getName() + "--------" + i);
            }
        }).start();

        List<Double> cost = Arrays.asList(10.0, 20.0,30.0);

        double allCost = cost.stream().map(x -> x+x*0.05).reduce((sum,x) -> sum + x).get();
        System.out.println(allCost);


    }
}
