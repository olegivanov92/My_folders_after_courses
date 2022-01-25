package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_5;
//task 20-28

import javaguru.lv.student_oleg_ivanov.lesson_8.lvl_4.Shape;
import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ShapeUtilDemo {


    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle area is: " + circleArea);
        System.out.println("Circle perimeter is: " + circlePerimeter);
        System.out.println();

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Square area is: " + squareArea);
        System.out.println("Square perimeter is: " + squarePerimeter);
        System.out.println();

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Rectangle area is: " + rectangleArea);
        System.out.println("Rectangle perimeter is: " + rectanglePerimeter);
        System.out.println();

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println("Triangle area is: " + triangleArea);
        System.out.println("Triangle perimeter is: " + trianglePerimeter);

    }
}
