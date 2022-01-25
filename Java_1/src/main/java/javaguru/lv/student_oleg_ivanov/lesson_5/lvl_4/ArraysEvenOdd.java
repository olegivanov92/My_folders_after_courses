package javaguru.lv.student_oleg_ivanov.lesson_5.lvl_4;
//task_29
//task_30

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
public class ArraysEvenOdd {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(100);
            numbers[i] = randomNumber;
        }

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) == 0) {
                System.out.println("Even number for array: " + Arrays.toString(numbers) + " is = " + (numbers[i]));
            } else {
                System.out.println("Odd number for array: " + Arrays.toString(numbers) + " is = " + (numbers[i]));
            }

        }
    }

}




