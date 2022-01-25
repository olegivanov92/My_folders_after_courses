package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_7;

import javaguru.lv.teacher.annotations.CodeReview;

//task 32
@CodeReview(approved = true)
public class MathOperationTest {
    public static void main(String[] args) {
        MathOperationTest testRunner = new MathOperationTest();
        testRunner.division();
        testRunner.divisionFail();
        testRunner.multiplication();
        testRunner.multiplicationFail();
        testRunner.addition();
        testRunner.additionFail();
        testRunner.subtraction();
        testRunner.subtractionFail();


    }

    void division() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(2);
        MathOperation division = new Division(arg1, arg2);
        double expectedResult = 5;
        double actualResult = division.calculate();
        check(expectedResult, actualResult, "Division Test: ");

    }

    void divisionFail() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(2);
        MathOperation division = new Division(arg1, arg2);
        double expectedResult = 4;
        double actualResult = division.calculate();
        check(expectedResult, actualResult, "Division Fail Test: ");

    }

    void multiplication() {
        Argument arg1 = new Argument(5);
        Argument arg2 = new Argument(2);
        MathOperation multiplication = new Multiplication(arg1, arg2);
        double expectedResult = 10;
        double actualResult = multiplication.calculate();
        check(expectedResult, actualResult, "Multiplication Test: ");

    }

    void multiplicationFail() {
        Argument arg1 = new Argument(5);
        Argument arg2 = new Argument(2);
        MathOperation multiplication = new Multiplication(arg1, arg2);
        double expectedResult = 9;
        double actualResult = multiplication.calculate();
        check(expectedResult, actualResult, "Multiplication Fail Test: ");

    }

    void addition() {
        Argument arg1 = new Argument(5);
        Argument arg2 = new Argument(2);
        MathOperation addition = new Addition(arg1, arg2);
        double expectedResult = 7;
        double actualResult = addition.calculate();
        check(expectedResult, actualResult, "Addition Test: ");
    }

    void additionFail() {
        Argument arg1 = new Argument(5);
        Argument arg2 = new Argument(2);
        MathOperation addition = new Addition(arg1, arg2);
        double expectedResult = 6;
        double actualResult = addition.calculate();
        check(expectedResult, actualResult, "Addition Fail Test: ");
    }

    void subtraction() {
        Argument arg1 = new Argument(5);
        Argument arg2 = new Argument(2);
        MathOperation subtraction = new Subtraction(arg1, arg2);
        double expectedResult = 3;
        double actualResult = subtraction.calculate();
        check(expectedResult, actualResult, "Subtraction Test: ");

    }

    void subtractionFail() {
        Argument arg1 = new Argument(5);
        Argument arg2 = new Argument(2);
        MathOperation subtraction = new Subtraction(arg1, arg2);
        double expectedResult = 2;
        double actualResult = subtraction.calculate();
        check(expectedResult, actualResult, "Subtraction FAil Test: ");

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
