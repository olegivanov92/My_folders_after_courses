package javaguru.lv.student_oleg_ivanov.lesson_5.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Random;
import java.util.Scanner;

//task_26
@CodeReview(approved = true)
public class UserArraysRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of arrays");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        System.out.println("Insert random ints:");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20);
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Array numbers: " + array[i]);
        }

    }
}
