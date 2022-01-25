package javaguru.lv.student_oleg_ivanov.lesson_2.level_3;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_11_Average {
    public static void main(String[] args) {
        System.out.println("Enter Three numbers");
        Scanner scanner = new Scanner(System.in);
        int NumberOne = scanner.nextInt();
        int NumberTwo = scanner.nextInt();
        int NumberThree = scanner.nextInt();
        int MidSum = NumberOne + NumberTwo + NumberThree;


        System.out.println("Your answer is" + MidSum / 3.d);

    }
}