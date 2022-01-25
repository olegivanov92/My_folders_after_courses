package javaguru.lv.student_oleg_ivanov.lesson_5.lvl_4;
//task_25

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class UserArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of arrays");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Array numbers: " + array[i]);
        }

    }


}


