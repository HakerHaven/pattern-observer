package com.lisang.pattern.observer.guava.gperadvice;

import com.google.common.eventbus.EventBus;
import com.lisang.pattern.observer.gperadvice.Question;

/**
 * Create by lisang on 2019/3/18 18 21:01.
 */
public class GPerEventTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GPerEvent gPerEvent = GPerEvent.getInstance();
        eventBus.register(gPerEvent);
        eventBus.post("小明");
        eventBus.unregister(gPerEvent);

        TeacherEvent teacherEvent = new TeacherEvent("tom");
        eventBus.register(teacherEvent);

        Question question = new Question();
        question.setUsername("小明");
        question.setContext("观察者模式适用哪些场景？");
        eventBus.post(question);
    }
}
