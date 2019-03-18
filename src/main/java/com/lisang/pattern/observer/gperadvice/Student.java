package com.lisang.pattern.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * Create by lisang on 2019/3/18 18 20:35.
 */
public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        GPer gPer = (GPer) o;
        Response response = (Response) arg;
        System.out.println("=========================");
        System.out.println(name + "同学，你好！\n您收到了一个来自“" + gPer.getName() + "”的内容回复，内容如下：\n" +
                response.getContext() + "\n回复老师：" + response.getUsername());
    }
}
