package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_5;
//task 20-28

import javaguru.lv.student_oleg_ivanov.lesson_8.lvl_4.*;
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
public class ShapeUtil {


    public Circle createRandomCircle() {
        Random random = new Random();
        Circle circle = new Circle(random.nextInt(10), 3.14);
        return circle;
    }

    public Square createRandomSquare() {
        Random random = new Random();
        Square square = new Square(random.nextInt(10));
        return square;

    }

    public Rectangle createRandomRectangle() {
        Random random = new Random();
        Rectangle rectangle = new Rectangle(random.nextInt(10), random.nextInt(10));
        return rectangle;
    }

    public Triangle createRandomTriangle() {
        Random random = new Random();
        Triangle triangle = new Triangle(random.nextInt(10), 0);
        return triangle;


    }


    public Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }


    public double calculateArea(Shape[] shapes) {
        double result = 0;
        for (Shape shape : shapes) {
            result += shape.calculateArea();
        }
        return result;
    }

    public double calculatePerimeter(Shape[] shapes) {
        double result = 0;
        for (Shape shape : shapes) {
            result += shape.calculatePerimeter();
        }
        return result;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}


