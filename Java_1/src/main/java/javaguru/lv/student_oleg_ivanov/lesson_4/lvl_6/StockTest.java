package javaguru.lv.student_oleg_ivanov.lesson_4.lvl_6;

import javaguru.lv.teacher.annotations.CodeReview;

//task_17
@CodeReview(approved = true)
public class StockTest {

    public static void main(String[] args) {
        StockTest testRunner = new StockTest();

        testRunner.testNumber_1();
        testRunner.testNumber_2();
        testRunner.testNumber_3();
        testRunner.testNumber_4();
        testRunner.testNumber_5();
    }

    public void testNumber_1() {
        Stock myStock = new Stock("Tesla", 10);
        myStock.updatePrice(999);


        int expectedMaxPrice = 999;
        int actualResult = myStock.getMaxValue();
        check(expectedMaxPrice, actualResult, "Test Max Prise is 999");
    }

    public void testNumber_2() {
        Stock myStock = new Stock("Tesla", 10);
        myStock.updatePrice(999);
        myStock.updatePrice(1);

        int expectedMaxPrice = 999;
        int actualResult = myStock.getMaxValue();
        check(expectedMaxPrice, actualResult, "Test Max Prise is 999");
    }

    public void testNumber_3() {
        Stock myStock = new Stock("Tesla", 10);
        myStock.updatePrice(999);
        myStock.updatePrice(2);
        myStock.updatePrice(1000);


        int expectedMaxPrice = 1000;
        int actualResult = myStock.getMaxValue();
        check(expectedMaxPrice, actualResult, "Test Max Prise is 1000");
    }

    public void testNumber_4() {
        Stock myStock = new Stock("Tesla", 10);
        myStock.updatePrice(999);
        myStock.updatePrice(2);
        myStock.updatePrice(1000);
        myStock.updatePrice(8);


        int expectedMaxPrice = 1000;
        int actualResult = myStock.getMaxValue();
        check(expectedMaxPrice, actualResult, "Test Max Prise is 1000");
    }

    public void testNumber_5() {
        Stock myStock = new Stock("Tesla", 10);
        myStock.updatePrice(9);
        myStock.updatePrice(27);


        int expectedMaxPrice = 27;
        int actualResult = myStock.getMaxValue();
        check(expectedMaxPrice, actualResult, "Test Max Prise is 27");
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected result: " + expectedResult + " but actual is: " + actualResult);
        }
    }
}

