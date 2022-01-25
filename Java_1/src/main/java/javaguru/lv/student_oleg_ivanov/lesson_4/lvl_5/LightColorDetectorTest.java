package javaguru.lv.student_oleg_ivanov.lesson_4.lvl_5;

import javaguru.lv.teacher.annotations.CodeReview;
import javaguru.lv.teacher.annotations.CodeReviewComment;

//task_16
@CodeReview(approved = true)
@CodeReviewComment(comment = "Тесты написаны плохо. Во время лекции, я говорил, что есть смыл проверять именно граничные значения." +
        "Т.к. я могу просто перепутать знак у всловии и тогда ваши тесты не покажут ошибки. Надо бы переделать." +
        "" +
        "Круто =) На много красивее стало.")
public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest testRunner = new LightColorDetectorTest();
        testRunner.ColorTestViolet();
        testRunner.ColorTestBlue();
        testRunner.ColorTestGreen();
        testRunner.ColorTestYellow();
        testRunner.ColorTestOrange();
        testRunner.ColorTestRed();
        testRunner.ColorTestInvisibleLight();
    }

    public void ColorTestViolet() {
        LightColorDetector colorDetector = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = colorDetector.detect(380);
        check(expectedResult, actualResult, "Test Violet");

    }
    public void ColorTestBlue() {
        LightColorDetector colorDetector = new LightColorDetector();
        String expectedResult = "Blue";
        String actualResult = colorDetector.detect(450);
        check(expectedResult, actualResult, "Test Blue");

    }
    public void ColorTestGreen() {
        LightColorDetector colorDetector = new LightColorDetector();
        String expectedResult = "Green";
        String actualResult = colorDetector.detect(569);
        check(expectedResult, actualResult, "Test Green");

    }
    public void ColorTestYellow() {
        LightColorDetector colorDetector = new LightColorDetector();
        String expectedResult = "Yellow";
        String actualResult = colorDetector.detect(570);
        check(expectedResult, actualResult, "Test Yellow");

    }
    public void ColorTestOrange() {
        LightColorDetector colorDetector = new LightColorDetector();
        String expectedResult = "Orange";
        String actualResult = colorDetector.detect(590);
        check(expectedResult, actualResult, "Test orange");

        }


    public void ColorTestRed() {
        LightColorDetector colorDetector = new LightColorDetector();
        String expectedResult = "Red";
        String actualResult = colorDetector.detect(620);
        check(expectedResult, actualResult, "Test Red");

    }
    public void ColorTestInvisibleLight() {
        LightColorDetector colorDetector = new LightColorDetector();
        String expectedResult = "Invisible Light";
        String actualResult = colorDetector.detect(9999);
        check(expectedResult, actualResult, "Test Invisible Light");

        }

        public void check(String expectedResult, String actualResult, String testName) {
            if (expectedResult.equals(actualResult)) {
                System.out.println(testName + " has passed!");
            } else {
                System.out.println(testName + " Failed");
                System.out.println("Expected result: " + expectedResult + " but actual is: " + actualResult);
        }
    }

    }


