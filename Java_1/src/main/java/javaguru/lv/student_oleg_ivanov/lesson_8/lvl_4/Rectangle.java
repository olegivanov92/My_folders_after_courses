package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task15...19
@CodeReview(approved = true)
public class Rectangle extends Shape {
    int sideA;
    int sideB;

    public Rectangle(int sideB, int sideA) {
        super("Rectangle");
        this.sideB = sideB;
        this.sideA = sideA;

    }

    @Override
    public double calculateArea() {
        double area = sideA * sideB;
        return area;

    }

    @Override
   public double calculatePerimeter() {
        double perimeter = (sideA + sideB) * 2;
        return perimeter;

    }
}
