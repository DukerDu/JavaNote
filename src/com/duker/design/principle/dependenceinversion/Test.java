package com.duker.design.principle.dependenceinversion;

/**
 * 依赖倒置原则
 * 针对接口编程，不针对实现编程
 * 减少类间的耦合性
 */
public class Test {
    public static void main(String[] args) {

//        Duker duker = new Duker();
//        duker.studyLanguageCourse(new JavaCourse());
//        duker.studyLanguageCourse(new PythonCourse());


        Duker duker = new Duker();
        duker.setiCourse(new JavaCourse());
        duker.studyLanguageCourse();

        duker.setiCourse(new PythonCourse());
        duker.studyLanguageCourse();

    }
}
