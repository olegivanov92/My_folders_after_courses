package javaguru.lv.student_oleg_ivanov.lesson_5.lvl_2;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_11 {
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        int []number = new int[3];

        System.out.println("Enter some numbers..");
        number[0] = scanInput.nextInt();
        number[1] = scanInput.nextInt();
        number[2] = scanInput.nextInt();


        System.out.println("You entered: " + number[0]);
        System.out.println("You entered: " + number[1]);
        System.out.println("You entered: " + number[2]);
    }
}
