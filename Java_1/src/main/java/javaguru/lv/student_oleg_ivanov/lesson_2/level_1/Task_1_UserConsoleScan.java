package javaguru.lv.student_oleg_ivanov.lesson_2.level_1;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_1_UserConsoleScan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type the first number:");
        System.out.println("Please type the second number:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("Your answer is:" + (firstNumber + secondNumber));
        System.out.println("Your answer is:" + (firstNumber - secondNumber));
        System.out.println("Your answer is:" + (firstNumber * secondNumber));
        System.out.println("Your answer is:" + (firstNumber / (double) secondNumber));
    }
}

