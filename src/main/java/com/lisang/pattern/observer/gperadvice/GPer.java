package com.lisang.pattern.observer.gperadvice;

import java.util.Observable;

/**
 * JDK提供的一种观察者实现方式，被观察者
 * Create by lisang on 2019/3/17 17 21:10.
 */
public class GPer extends Observable {
    private String name = "GPer生态圈";
    private static GPer gPer = null;

    private GPer() {
    }

    public static GPer getInstance() {
        if (null == gPer) {
            gPer = new GPer();
        }
        return gPer;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUsername() + "在" + this.name + "提出了一个问题");
        setChanged();
        notifyObservers(question);
    }

    public void publishResponse(Response response) {
        System.out.println(response.getUsername() + "老师，在" + this.name + "已经回答了问题");
        setChanged();
        notifyObservers(response);
    }
}
