package org.cochise.Points07_Thread;

/**
 * 方式二：实现runnable接口
 */
public class RunnableImpl implements Runnable{



    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName() + "--------" + i);
        }
    }

    public static void main(String[] args) {

        new Thread(new RunnableImpl()).start();

        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName() + "--------" + i);
        }
    }
}
