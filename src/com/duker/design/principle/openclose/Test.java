package com.duker.design.principle.openclose;

/**
 * Created by duker
 * 开闭原则
 * 用抽象构建框架，用实现扩展细节
 * 提高软件系统的可复用性，可维护性
 */
public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaDiscountCourse(01,"java从入门到精通",96d);

        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) javaCourse;

        System.out.println("课程ID："+javaCourse.getId()+" 课程名称："+javaCourse.getName()+" 课程打折价格："+javaCourse.getPrice()+" 课程原价: "+javaDiscountCourse.getOriginPrice());

    }
}
