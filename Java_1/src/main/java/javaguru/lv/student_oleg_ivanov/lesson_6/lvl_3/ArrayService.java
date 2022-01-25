package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_3;
//task_12
//task_13
//task_14
//task_15
//task_16
//task_17


import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
public class ArrayService {
    boolean contains(int[] arrays, int findNumber) {

        for (int i : arrays) {
            if (findNumber == i) {
                return true;
            }
        }
        return false;

    }


    int sameNumbers(int[] arrays, int findNumber) {
        int dup = 0;
        for (int i : arrays)
            if (i == findNumber) dup++;
        return dup;
    }

    boolean replaceFirst(int[] myArray, int numberToReplace, int newNumber) {
        System.out.println();
        System.out.println("Before " + Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == numberToReplace) {
                myArray[i] = newNumber;
                System.out.println("After " + Arrays.toString(myArray));
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] myArray, int numberToReplace, int newNumber) {
        System.out.println("Before " + Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == numberToReplace) {
                myArray[i] = newNumber;
                System.out.println("After " + Arrays.toString(myArray));


            }

        }
        return newNumber;
    }

    void revert(int[] array) {
        System.out.println("Before Revert " + Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int rev = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = rev;
        }
        System.out.println("After Revert " + Arrays.toString(array));
    }

    void sorting(int[] arrays) {
        System.out.println("Before Sorting " + Arrays.toString(arrays));
        Arrays.sort(arrays);
        System.out.println("After Sorting " + Arrays.toString(arrays));
    }
}