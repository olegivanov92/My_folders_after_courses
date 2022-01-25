package javaguru.lv.student_oleg_ivanov.lesson_7.lvl_5;

import javaguru.lv.teacher.annotations.CodeReview;

//Task_9
@CodeReview(approved = true)
public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest testRunner = new PowerCalculatorTest();
        testRunner.test();
        testRunner.test1();
    }


    void test() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int actualResult = powerCalculator.exponentiation(5, 2);
        int expectedResult = 25;
        if (actualResult == expectedResult)
            System.out.println("Test OK: " + actualResult);
        else System.out.println("Test Fail " + actualResult);
    }

    void test1() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int actualResult = powerCalculator.exponentiation(3, 3);
        int expectedResult = 27;
        if (actualResult == expectedResult)
            System.out.println("Test OK: " + actualResult);
        else System.out.println("Test Fail " + actualResult);
    }
}
