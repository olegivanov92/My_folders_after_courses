package javaguru.lv.student_oleg_ivanov.lesson_7.lvl_6;
//task_12
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
public class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest testRunner = new ArrayCopyTest();
        testRunner.test1();
        testRunner.test2();
    }
        void test1(){
            ArrayCopy arrayCopy = new ArrayCopy();
            int[] result = arrayCopy.copyInRange(new int[]{1, 2, 3, 4, 5, 6, 7}, 3, 6);
            System.out.println("Printing new array:" + Arrays.toString(result));

        }
    void test2(){
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] result = arrayCopy.copyInRange(new int[]{2, 4, 6, 8, 10, 12, 14}, 1, 20);
        System.out.println("Printing new array:" + Arrays.toString(result));

    }


    }


