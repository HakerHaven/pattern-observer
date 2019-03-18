package com.lisang.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * Create by lisang on 2019/3/18 18 10:12.
 */
public class GuavaEvent {
    @Subscribe
    public void subscribe(String str) {
        System.out.println("执行subscribe方法，传入的参数是"+str);
    }
}
