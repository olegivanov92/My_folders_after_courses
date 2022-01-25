package javaguru.lv.student_oleg_ivanov.lesson_4.lvl_3;
//task_8
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class EqualDifferentNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int userInputOne = scanner.nextInt();
        int userInputTwo = scanner.nextInt();
        int userInputThree = scanner.nextInt();
        if ((userInputOne == userInputTwo) && (userInputThree == userInputOne)) {
            System.out.println("All numbers are equal");
        } else if ((userInputOne != userInputTwo) && (userInputOne != userInputThree) && (userInputTwo != userInputThree)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");

        }
    }
}