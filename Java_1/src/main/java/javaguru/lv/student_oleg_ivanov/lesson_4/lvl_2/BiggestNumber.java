package javaguru.lv.student_oleg_ivanov.lesson_4.lvl_2;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int userInputOne = scanner.nextInt();
        int userInputTwo = scanner.nextInt();

        if (userInputOne < userInputTwo) {
            System.out.println("Bigger number is " + userInputTwo);
        } else System.out.println("Bigger number is: " + userInputOne);
    }
}


