package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_1;
//task 2

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;
@CodeReview(approved = true)
public class ArrayUtilImpl implements ArrayUtil {
    @Override
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    @Override
    public void fillArrayWithRandomNumbers(int[] array) {
        for (int count = 0; count < array.length; count++) {
            int rndValue = new Random().nextInt(11);
            array[count] = rndValue;
        }
    }

    @Override
    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    @Override
    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


    @Override
    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));

    }
}
