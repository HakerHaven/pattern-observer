package com.lisang.pattern.observer.guava.gperadvice;

import com.google.common.eventbus.Subscribe;
import com.lisang.pattern.observer.gperadvice.Question;

/**
 * Create by lisang on 2019/3/18 18 21:06.
 */
public class TeacherEvent {
    private String name;

    public TeacherEvent(String name) {
        this.name = name;
    }

    @Subscribe
    public void subscribe(Object object){
        Question question = (Question) object;
        System.out.println("=========================");
        System.out.println(name + "老师，你好！\n您收到了一个来自“"  + "”的问题希望您解答，内容如下：\n" +
                question.getContext() + "\n提问者：" + question.getUsername());
    }
}
