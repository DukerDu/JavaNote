package com.duker.design.principle.dependenceinversion;

import javax.sound.midi.Soundbank;

public class PythonCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学习Python课程...");
    }
}
