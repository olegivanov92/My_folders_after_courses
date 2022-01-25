package javaguru.lv.student_oleg_ivanov.lesson_4.lvl_7;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzBuzzTest();
        test.fizzTest();
        test.buzzTest();
        test.notFizzBuzzTest();
    }

    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(30).equals("FizzBuzz"), "Test fizzbuzz");


    }
    public void fizzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(3).equals("Fizz"), "Test Fizz");
    }

    public void buzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(50).equals("Buzz"), "Test Buzz");
    }

    public void notFizzBuzzTest(){
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
