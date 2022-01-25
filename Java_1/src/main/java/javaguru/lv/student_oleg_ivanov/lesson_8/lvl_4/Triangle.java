package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task15...19
@CodeReview(approved = true)
public class Triangle extends Shape {
    int sideA;
    int height;

    public Triangle(int sideA, int height) {
        super("Triangle");
        this.sideA = sideA;
        this.height = height;

    }

    @Override
    public double calculateArea() {
        int height = 5;
        double area = (sideA * height) / 2;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = sideA * 3;
        return perimeter;
    }
}
