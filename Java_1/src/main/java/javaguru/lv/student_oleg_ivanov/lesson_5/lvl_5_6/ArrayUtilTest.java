package javaguru.lv.student_oleg_ivanov.lesson_5.lvl_5_6;

import javaguru.lv.teacher.annotations.CodeReview;
import javaguru.lv.teacher.annotations.CodeReviewComment;

import java.util.Arrays;

//task_31
//task_32
//task_33
//task_34
//task_35
//task_36
//task_37
//task_38
@CodeReview(approved = true)
@CodeReviewComment(comment = "Это не тесты =) Давайте не ленитесь. Пару тестовых сценариев можно написать на ArrayUtils." +
        "findMin/Max так точно =)")
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest tester = new ArrayUtilTest();
        tester.shouldCreateArray();
        tester.shouldFindMaxNumber();
        tester.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(myArray);
        arrayUtil.printArrayToConsole(myArray);
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = {1, 6, 15, 4, 3, 89};
        arrayUtil.findMaxNumber(myArray);
        int max = arrayUtil.findMaxNumber(myArray);
        int expectedResult = 89;
        if (expectedResult == max) {
            System.out.println("Test max: " + Arrays.toString(myArray) + " Max number is: " + max);
        } else System.out.println("Test max fail");
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = {1, 6, 15, 4, 3, 89};
        arrayUtil.findMinNumber(myArray);
        int min = arrayUtil.findMinNumber(myArray);
        int expectedResult = 1;
        if (expectedResult == min) {
            System.out.println("Test min: " + Arrays.toString(myArray) + " Min number is: " + min);
        } else System.out.println("Test min fail");
    }

}


