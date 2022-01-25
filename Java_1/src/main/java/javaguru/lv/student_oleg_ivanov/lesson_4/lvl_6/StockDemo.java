package javaguru.lv.student_oleg_ivanov.lesson_4.lvl_6;


import javaguru.lv.teacher.annotations.CodeReview;

//task_17
@CodeReview(approved = true)
public class StockDemo {
    public static void main(String[] args) {
        Stock myStock = new Stock("Tesla", 10);
        myStock.getPriceInformation();
        System.out.println();

        myStock.updatePrice(999);
        myStock.getPriceInformation();
        System.out.println();

        myStock.updatePrice(2);
        myStock.getPriceInformation();
        System.out.println();

        myStock.updatePrice(1000);
        myStock.getPriceInformation();
        System.out.println();

        myStock.updatePrice(8);
        myStock.getPriceInformation();


    }
}