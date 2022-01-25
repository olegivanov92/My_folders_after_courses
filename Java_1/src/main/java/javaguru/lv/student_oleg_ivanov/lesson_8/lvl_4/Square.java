package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task15...19
@CodeReview(approved = true)
public class Square extends Shape {
    int sideA;

    public Square(int sideA) {
        super("Square");
        this.sideA = sideA;

    }

    @Override
    public double calculateArea() {
        double area = sideA * sideA;
        return area;


    }

    @Override
    public double calculatePerimeter() {
        double perimeter = (sideA + sideA) * 2;
        return perimeter;
    }
}
