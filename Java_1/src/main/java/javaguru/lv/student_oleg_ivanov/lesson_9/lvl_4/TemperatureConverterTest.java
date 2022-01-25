package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task 12
@CodeReview(approved = true)
public class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest testRunner = new TemperatureConverterTest();
        testRunner.fahrenheitConverter();
        testRunner.kelvinConverter();
    }

    void fahrenheitConverter() {
        TemperatureConverter celToFar = new FahrenheitConverter();
        double expectedResult = 59;
        double actualResult = celToFar.convert(15.0);
        check(expectedResult, actualResult, "Celsius to Fahrenheit");


    }

    void kelvinConverter() {
        TemperatureConverter celToFar = new KelvinConverter();
        double expectedResult = 288.15;
        double actualResult = celToFar.convert(15.0);
        check(expectedResult, actualResult, "Celsius to Kelvin");


    }

    void check(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("Test " + testName + " has passed");
        } else {
            System.out.println("Test " + testName + " failed!!!");
            System.out.println("Expected was: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
