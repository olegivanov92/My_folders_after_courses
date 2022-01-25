package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;

//task 2
@CodeReview(approved = true)
public interface ArrayUtil {
    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);

    void printArrayToConsole(int[] array);
}
