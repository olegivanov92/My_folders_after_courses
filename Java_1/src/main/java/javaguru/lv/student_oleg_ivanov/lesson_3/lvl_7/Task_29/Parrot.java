package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_7.Task_29;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Parrot {
    private String name;
    private int age;
    private String color;
    boolean canSpeak;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanSpeak() {
        return canSpeak;
    }

    public void setCanSpeak(boolean canSpeak) {
        this.canSpeak = canSpeak;
    }

    public Parrot(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;


    }
}