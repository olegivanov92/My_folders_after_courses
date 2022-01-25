package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_5.Task_21;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog {
    private String name;
    private String color;
    private int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }

    public void voice() {
        System.out.println("My name is: " + getName());
        System.out.println("My color is: " + getColor());
        System.out.println("My age is: " + getAge());
    }

    public String getName() {
        return name;
    }


    public String getColor() {
        return color;
    }


    public int getAge() {
        return age;
    }


}
