package org.cochise.Points07_Thread;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全的方法
 * 1，同步代码块：Synchronized(同步锁/对象锁)
 * 2，同步方法：public synchronized void method(){}，它的同步锁是接口实现类
 * 3，静态同步方法：public static synchronized void method(){}，它的同步锁是接口实现类的class属性，也就是Class类的对象
 * 4，Lock锁
 *
 *
 */
public class Synchronized implements Runnable{

    Lock l = new ReentrantLock();

    @Override
    public void run() {
        l.lock();
        //需要实现线程安全的代码块
        l.unlock();
    }


}
