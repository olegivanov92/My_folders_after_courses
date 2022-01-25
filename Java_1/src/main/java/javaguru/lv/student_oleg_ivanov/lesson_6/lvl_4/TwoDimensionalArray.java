package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_4;
//task_21

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
public class TwoDimensionalArray {
    public int[][] createArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        return array;
    }

    public void fillArrayWithRandomNumbers(int[][] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(10);

                System.out.print(array[i][j] + " | ");

            }
            System.out.println();

        }

    }

    public void sumResult(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                sum = sum + ints[j];
            }

        }
        System.out.println("Sum of arrays = " + sum);
    }
}