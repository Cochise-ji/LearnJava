package org.cochise.Points07_Thread;


/**
 * 方式一：创建java.Lang.Thread的子类
 */
public class Threads extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(getName() + "--------" + i);
        }
    }

    public static void main(String[] args) {
        new Threads().start();

        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName() + "--------"  + i);
        }
    }
}
