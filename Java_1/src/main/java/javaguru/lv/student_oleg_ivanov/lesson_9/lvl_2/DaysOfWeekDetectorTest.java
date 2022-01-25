package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_2;

import javaguru.lv.teacher.annotations.CodeReview;

//task4-5
@CodeReview(approved = true)
public class DaysOfWeekDetectorTest {
    public static void main(String[] args) {
        DaysOfWeekDetectorTest testRunner = new DaysOfWeekDetectorTest();
        testRunner.ifTest();
        testRunner.ifTestFail();
        testRunner.SwitchTest();
        testRunner.SwitchTestFail();
        testRunner.ArrayTest();
        testRunner.ArrayTestFail();
        testRunner.otherNumber();
    }


    void ifTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Saturday";
        String actualResult = dayOfTheWeekDetector.detectDayName(6);
        check(expectedResult, actualResult, "If Test: ");
    }

    void ifTestFail() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Saturday";
        String actualResult = dayOfTheWeekDetector.detectDayName(7);
        check(expectedResult, actualResult, "If Test: ");
    }

    void SwitchTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Tuesday";
        String actualResult = dayOfTheWeekDetector.detectDayName(2);
        check(expectedResult, actualResult, "Switch test: ");
    }

    void SwitchTestFail() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Tuesday";
        String actualResult = dayOfTheWeekDetector.detectDayName(1);
        check(expectedResult, actualResult, "Switch test: ");
    }

    void ArrayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Friday";
        String actualResult = dayOfTheWeekDetector.detectDayName(5);
        check(expectedResult, actualResult, "Array test: ");
    }

    void ArrayTestFail() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Friday";
        String actualResult = dayOfTheWeekDetector.detectDayName(4);
        check(expectedResult, actualResult, "Array test: ");
    }

    void otherNumber() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Tuesday";
        String actualResult = dayOfTheWeekDetector.detectDayName(8);
        check(expectedResult, actualResult, "test other Number: ");

    }

    void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test " + testName + " has passed");
        } else {
            System.out.println("Test " + testName + " failed!!!");
            System.out.println("Expected was: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
