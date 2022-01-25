package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_5;
//task 20-28

import javaguru.lv.student_oleg_ivanov.lesson_8.lvl_4.Shape;
import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest testRunner = new ShapeUtilTest();
        testRunner.calculateArea();
        testRunner.calculatePerimeter();

    }

    void calculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double expectedResult = 0;
        double actualResult = shapeUtil.calculateArea(shapes);
        check(expectedResult < actualResult, "CalculateArea Test: ");
    }

    void calculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double expectedResult = 10;
        double actualResult = shapeUtil.calculateArea(shapes);
        check(expectedResult < actualResult, "CalculatePerimeter Test: ");

    }


    public static void check(boolean value, String testName) {
        if (value) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected result: " + true + " but actual is: " + false);
        }
    }

}





