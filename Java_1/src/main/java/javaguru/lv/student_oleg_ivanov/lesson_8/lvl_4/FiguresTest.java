package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task15...19
@CodeReview(approved = true)
public class FiguresTest {
    public static void main(String[] args) {
        FiguresTest testRunner = new FiguresTest();
        testRunner.testCirclePerimeter();
        testRunner.testCircleArea();
        testRunner.testSquarePerimeter();
        testRunner.testSquareArea();
        testRunner.testRectanglePerimeter();
        testRunner.testRectangleArea();
        testRunner.testTrianglePerimeter();
        testRunner.testTriangleArea();

    }

    void testCirclePerimeter() {
        Circle circle = new Circle(15.0, 3.14);
        double expectedResult = 94.2;
        double actualResult = circle.calculatePerimeter();
        check(expectedResult, actualResult, "Circle Perimeter");

    }

    void testCircleArea() {
        Circle circle = new Circle(5.0, 3.14);
        double expectedResult = 78.5;
        double actualResult = circle.calculateArea();
        check(expectedResult, actualResult, "Circle Area");

    }

    void testSquarePerimeter() {
        Square square = new Square(3);
        double expectedResult = 12;
        double actualResult = square.calculatePerimeter();
        check(expectedResult, actualResult, "Square Perimeter");

    }

    void testSquareArea() {
        Square square = new Square(3);
        double expectedResult = 9;
        double actualResult = square.calculateArea();
        check(expectedResult, actualResult, "Square Area");

    }

    void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(2, 6);
        double expectedResult = 16;
        double actualResult = rectangle.calculatePerimeter();
        check(expectedResult, actualResult, "Rectangle Perimeter");

    }

    void testRectangleArea() {
        Rectangle rectangle = new Rectangle(2, 6);
        double expectedResult = 12;
        double actualResult = rectangle.calculateArea();
        check(expectedResult, actualResult, "Rectangle Area");

    }

    void testTrianglePerimeter() {
        Triangle triangle = new Triangle(3, 1);
        double expectedResult = 9;
        double actualResult = triangle.calculatePerimeter();
        check(expectedResult, actualResult, "Triangle Perimeter");

    }

    void testTriangleArea() {
        Triangle triangle = new Triangle(6, 5);
        double expectedResult = 15;
        double actualResult = triangle.calculateArea();
        check(expectedResult, actualResult, "Triangle Area");

    }


    public static void check(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected result: " + expectedResult + " but actual is: " + actualResult);
        }
    }
}