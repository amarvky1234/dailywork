package com.singleton.test;

import com.singleton.runnable.NavigatorRunnable;

public class MultiThreadedTest {
    public static void main(String[] args) {
        NavigatorRunnable navigatorRunnable = new NavigatorRunnable();
        Thread t1 = new Thread(navigatorRunnable);
        Thread t2 = new Thread(navigatorRunnable);

        t1.start();
        t2.start();
    }
}
