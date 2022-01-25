package javaguru.lv.student_oleg_ivanov.lesson_5.lvl_5_6;
//task_31
//task_32
//task_33
//task_34
//task_35
//task_36
//task_37
//task_38

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;
@CodeReview(approved = true)
public class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }


    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(100);
            array[i] = randomNumber;
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println("Test created Array with random numbers " + Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}







