package javaguru.lv.student_oleg_ivanov.lesson_4.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task_11
//task_13
//task_14
//task_15
@CodeReview(approved = true)
public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;


    }

    //task_14
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        } else return secondNumber;
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) {
            return firstNumber;

        } else if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber)) {
            return secondNumber;
        } else {
            return thirdNumber;


        }


    }


}







