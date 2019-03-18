package com.lisang.pattern.observer.guava.gperadvice;

import com.google.common.eventbus.Subscribe;

/**
 * Create by lisang on 2019/3/18 18 20:57.
 */
public class GPerEvent {
    private String name = "GPer生态圈";
    private static GPerEvent gPerEvent = null;

    private GPerEvent() {
    }

    public static GPerEvent getInstance() {
        if (null == gPerEvent) {
            gPerEvent = new GPerEvent();
        }
        return gPerEvent;
    }

    public String getName() {
        return name;
    }

    @Subscribe
    public void subscribe(String str) {
        System.out.println(str + "在" + this.name + "提出了一个问题");
    }
}
