package javaguru.lv.student_oleg_ivanov.lesson_2.level_3;
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_9_TableMultiplication {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        System.out.println(Number + " x 1 = " + Number);
        System.out.println(Number + " x 2 = " + Number*2);
        System.out.println(Number + " x 3 = " + Number*3);
        System.out.println(Number + " x 4 = " + Number*4);
        System.out.println(Number + " x 5 = " + Number*5);
        System.out.println(Number + " x 6 = " + Number*6);
        System.out.println(Number + " x 7 = " + Number*7);
        System.out.println(Number + " x 8 = " + Number*8);
        System.out.println(Number + " x 9 = " + Number*9);
        System.out.println(Number + " x 10 = " + Number*10);



    }
}
