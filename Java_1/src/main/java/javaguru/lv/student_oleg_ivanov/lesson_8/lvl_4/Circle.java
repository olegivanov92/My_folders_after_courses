package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;
import javaguru.lv.teacher.annotations.CodeReviewComment;

//task15...19
@CodeReview(approved = true)
@CodeReviewComment(comment = "sideA? А где у круга такая сторона? =)))")
public class Circle extends Shape {
    private double radius;
    double valuePi;



    public Circle(double radius, double valuePi) {
        super("Circle");
        this.radius = radius;
        this.valuePi = valuePi;

    }


    @Override
   public  double calculateArea() {
        double area = valuePi * radius * radius;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * valuePi * radius;
        return perimeter;
    }
}
