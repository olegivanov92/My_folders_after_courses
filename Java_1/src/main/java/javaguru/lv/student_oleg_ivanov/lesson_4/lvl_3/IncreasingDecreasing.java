package javaguru.lv.student_oleg_ivanov.lesson_4.lvl_3;
//Task_9
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int userInputOne = scanner.nextInt();
        int userInputTwo = scanner.nextInt();
        int userInputThree = scanner.nextInt();
        if ((userInputOne < userInputTwo) && (userInputTwo < userInputThree)) {
            System.out.println("increasing");
        } else if ((userInputOne > userInputTwo) && (userInputTwo > userInputThree)) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");

        }
    }
}
