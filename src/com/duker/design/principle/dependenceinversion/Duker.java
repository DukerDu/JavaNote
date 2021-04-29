package com.duker.design.principle.dependenceinversion;

public class Duker {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyLanguageCourse(){
        iCourse.studyCourse();
    }
}
