package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;

//task_6
@CodeReview(approved = true)
public class NumberUtilsTest {
    public static void main(String[] args) {


        NumberUtils numberUtils = new NumberUtils();
        boolean actualResult = numberUtils.isEven(10);
        if (actualResult) {
            System.out.println("Test Passed: it's Even");
        } else {
            System.out.println("Test Fail: it's Odd");
        }
        boolean actualResult1 = numberUtils.isEven(11);
        if (actualResult1) {
            System.out.println("Test Passed: it's Even");
        } else {
            System.out.println("Test Fail: it's Odd");
        }

    }
}


