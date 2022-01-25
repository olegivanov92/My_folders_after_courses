package javaguru.lv.student_oleg_ivanov.lesson_4.lvl_1;
//task_3

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: 1-7");
        int userInput = scanner.nextInt();

        if (userInput == 1) {
            System.out.println("It's Monday");
        } else if (userInput == 2) {
            System.out.println("It's Tuesday");

        } else if (userInput == 3) {
            System.out.println("It's Wednesday");

        } else if (userInput == 4) {
            System.out.println("It's  Thursday");

        } else if (userInput == 5) {
            System.out.println("It's Friday");

        } else if (userInput == 6) {
            System.out.println("It's Saturday");

        } else if (userInput == 7) {
            System.out.println("It's Sunday");

        } else {
            System.out.println("Error 404");
        }


    }
}
