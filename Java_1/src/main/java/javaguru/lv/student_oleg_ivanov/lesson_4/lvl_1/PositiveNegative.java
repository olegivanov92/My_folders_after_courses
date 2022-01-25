package javaguru.lv.student_oleg_ivanov.lesson_4.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;

//task_1
//task_2
@CodeReview(approved = true)
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int userInput = scanner.nextInt();

        if (userInput > 0) {
            System.out.println(userInput + " is Positive");
        } else if (userInput < 0) {
            System.out.println(userInput + " is Negative");

        }

    }

}
