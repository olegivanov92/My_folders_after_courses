package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_3;
//task_12
//task_13
//task_14
//task_15
//task_16
//task_17

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest testRunner = new ArrayServiceTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
        testRunner.test4();
        testRunner.test5();
        testRunner.test6();
        testRunner.test7();
        testRunner.test8();
        testRunner.test9();

    }

    public void test1() {
        ArrayService service = new ArrayService();
        boolean contains = service.contains(new int[]{3, 0, 4, 5, 1}, 5);
        checkTestResult(contains, "Find 5");

    }

    public void test2() {
        ArrayService service = new ArrayService();
        boolean contains = service.contains(new int[]{3, 2, 4, 5, 1}, 6);
        checkTestResult(contains, "Find 6");

    }

    public void test3() {
        ArrayService service = new ArrayService();
        int expectedResult = 3;
        int actualResult = service.sameNumbers(new int[]{1, 5, 1, 7, 1}, 1);
        checkTestResult1(expectedResult, actualResult, "Duplicate 1 test");
        System.out.println("Duplicate for number 1 = " + actualResult);


    }

    public void test4() {
        ArrayService service = new ArrayService();
        int expectedResult = 8;
        int actualResult = service.sameNumbers(new int[]{1, 5, 1, 7, 1}, 8);
        checkTestResult1(expectedResult, actualResult, "Duplicate 8 test");
        System.out.println("Duplicate for number 8 = " + actualResult);


    }

    public void test5() {
        ArrayService service = new ArrayService();
        boolean first = service.replaceFirst(new int[]{2, 5, 1, 7, 4}, 1, 9);
        checkTestResult(first, "Test Replace number 1");


    }

    public void test6() {
        ArrayService service = new ArrayService();
        boolean first = service.replaceFirst(new int[]{2, 5, 2, 7, 4}, 1, 9);
        checkTestResult(first, "Test Replace number 1");


    }

    public void test7() {
        ArrayService service = new ArrayService();
        int expectedResult = 8;
        int actualResult = service.replaceAll(new int[]{2, 3, 3, 3, 1}, 3, 8);
        checkTestResult1(expectedResult, actualResult, "All  replaced");


    }

    public void test8() {
        ArrayService service = new ArrayService();
        service.revert(new int[]{1, 2, 3, 4, 5});

    }

    public void test9() {
        ArrayService service = new ArrayService();
        service.sorting(new int[]{1, 7, 3, 101, 2, 7, 58, 10, 15, -5});

    }

    public void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
            System.out.println();
        } else {
            System.out.println(testName + " = FAIL!");
            System.out.println();
        }
    }

    public void checkTestResult1(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " = OK!");
            System.out.println();
        } else {
            System.out.println(testName + " = FAIL!");
            System.out.println();
        }
    }
}
