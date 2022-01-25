package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_7.Task_30;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    void calculateArea(double radius) {
        this.radius = radius;
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("Area is: " + area);

    }
}

    


