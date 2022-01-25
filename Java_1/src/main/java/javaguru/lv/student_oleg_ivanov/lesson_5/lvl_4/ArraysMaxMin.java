package javaguru.lv.student_oleg_ivanov.lesson_5.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task_27
//task_28
@CodeReview(approved = true)
public class ArraysMaxMin {

    public int findMax(int[] numbers) {

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public int findMin(int[] numbers) {

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

}