package javaguru.lv.student_oleg_ivanov.lesson_4.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//Task_12
//Task_13
//Task_14
@CodeReview(approved = true)
public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtraction();
        calculatorTest.division();
        calculatorTest.multiplication();
        calculatorTest.isEven();
        calculatorTest.maxOfTwoNumbersOne();
        calculatorTest.maxOfTwoNumbersTwo();
        calculatorTest.maxOfTwoNumbersThree();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();


    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtraction() {
        int firstNumber = 10;
        int secondNumber = 7;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("subtraction test = OK");
        } else {
            System.out.println("subtraction test = FAIL");
        }
    }

    public void division() {
        int firstNumber = 20;
        int secondNumber = 2;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("division test = OK");
        } else {
            System.out.println("division test = FAIL");
        }
    }

    public void multiplication() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("multiplication test = OK");
        } else {
            System.out.println("multiplication test = FAIL");
        }
    }

    //Task_13
    public void isEven() {
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(12);
        boolean expectedResult = true;
        if (realResult) {
            System.out.println("Is even ");
        } else {
            System.out.println("Not Even ");
        }
    }

    //task_14
    public void maxOfTwoNumbersOne() {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(25,15);
        int expectedResult = 25;
        if (realResult == expectedResult) {
            System.out.println("Has passed...The first number > second number");
        } else {
            System.out.println("Fail...first number is < second number");
        }

    }

    public void maxOfTwoNumbersTwo() {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(21,222);
        int expectedResult = 222;
        if (realResult == expectedResult) {
            System.out.println("Has passed...The second number > first number ");
        } else System.out.println("Fail...The second number < first number ");

    }

    public void maxOfTwoNumbersThree() {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(12, 12);
        int expectedResult=12;
        if (realResult == expectedResult) {
            System.out.println("Has passed...The second number = first number ");
        } else System.out.println("Fail...The second number != first number ");

    }
    //task_15
    public void maxOfThreeNumbersTest1() {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(4, 2, 3);
        int expectedResult = 4;
        if (realResult == expectedResult) {
            System.out.println("True...First number biggest than second and third");
        } else System.out.println("Fail = second or third number are biggest");


    }
    public void maxOfThreeNumbersTest2() {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(10, 88, 15);
        int expectedResult = 88;
        if (realResult == expectedResult) {
            System.out.println("True...Second number biggest than first and third");
        } else System.out.println("Fail = First or third number are biggest");


    }
    public void maxOfThreeNumbersTest3() {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(10, 25, 70);
        int expectedResult = 70;
        if (realResult == expectedResult) {
            System.out.println("True...Third number biggest than first and second");
        } else System.out.println("Fail = First or second number are biggest");


    }
    public void maxOfThreeNumbersTest4() {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(10, 10, 5);
        int expectedResult =10;
        if (realResult == expectedResult) {
            System.out.println("True...First = second and > thirdNumber");
        } else System.out.println("Fail =First and second numbers not Equal or ThirdNumber > firstNumber and Second number");


    }
    public void maxOfThreeNumbersTest5() {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(10, 10, 10);
        int expectedResult = 10;
        if (realResult == expectedResult) {
            System.out.println("True...All Numbers are Equal");
        } else System.out.println("Fail =Numbers are not Equal");


    }
}


