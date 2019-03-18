package com.lisang.pattern.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * Create by lisang on 2019/3/17 17 21:15.
 */
public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        GPer gPer = (GPer) o;
        Question question = (Question) arg;
        System.out.println("=========================");
        System.out.println(name + "老师，你好！\n您收到了一个来自“" + gPer.getName() + "”的问题希望您解答，内容如下：\n" +
                question.getContext() + "\n提问者：" + question.getUsername());
    }
}
