package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_7;

import javaguru.lv.teacher.annotations.CodeReview;

//task_32
@CodeReview(approved = true)
public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest testRunner = new FizzBuzzTest();
        testRunner.fizzBuzzTest();
        testRunner.fizzTest();
        testRunner.buzzTest();
        testRunner.notFizzBuzzTest();
    }

    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(30).equals("FizzBuzz"), "Test fizzbuzz");


    }

    public void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(3).equals("Fizz"), "Test Fizz");
    }

    public void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(50).equals("Buzz"), "Test Buzz");
    }

    public void notFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(8).equals("8"), "Test NotFizzBuzz");
    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
