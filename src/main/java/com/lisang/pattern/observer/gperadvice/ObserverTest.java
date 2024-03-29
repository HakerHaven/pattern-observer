package com.lisang.pattern.observer.gperadvice;

/**
 * Create by lisang on 2019/3/18 18 10:08.
 */
public class ObserverTest {
    private static final String CONTEXT = "以购票为核心业务(此模式不限于该业务)，但围绕购票会产生不同的其他逻辑，如：\n" +
            "1、购票后记录文本日志\n" +
            "2、购票后记录数据库日志\n" +
            "3、购票后发送短信\n" +
            "4、购票送抵扣卷、兑换卷、积分\n" +
            "5、其他各类活动等\n" +
            "传统解决方案:\n" +
            "在购票逻辑等类内部增加相关代码，完成各种逻辑。\n" +
            "存在问题：\n" +
            "1、一旦某个业务逻辑发生改变，如购票业务中增加其他业务逻辑，需要修改购票核心文件、甚至购票流程。\n" +
            "2、日积月累后，文件冗长，导致后续维护困难。\n" +
            "存在问题原因主要是程序的\"紧密耦合\"，使用观察模式将目前的业务逻辑优化成\"松耦合\"，达到易维护、易修改的目的，\n" +
            "同时也符合面向接口编程的思想。\n" +
            "观察者模式典型实现方式：\n" +
            "1、定义2个接口：观察者（通知）接口、被观察者（主题）接口\n" +
            "2、定义2个类，观察者对象实现观察者接口、主题类实现被观者接口\n" +
            "3、主题类注册自己需要通知的观察者\n" +
            "4、主题类某个业务逻辑发生时通知观察者对象，每个观察者执行自己的业务逻辑。";

    public static void main(String[] args) {
        try {
            GPer gper = GPer.getInstance();
            Teacher tom = new Teacher("tom");

            Question question = new Question();
            question.setUsername("小明");
            question.setContext("观察者模式适用哪些场景？");
            gper.addObserver(tom);
            gper.publishQuestion(question);

            Response response = new Response();
            response.setUsername("tom");
            response.setContext(CONTEXT);
            Student xiaoming = new Student(question.getUsername());
            gper.addObserver(xiaoming);
            gper.publishResponse(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
