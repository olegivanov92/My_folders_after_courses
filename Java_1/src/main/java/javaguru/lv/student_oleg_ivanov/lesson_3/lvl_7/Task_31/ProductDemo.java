package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_7.Task_31;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ProductDemo {
    public static void main(String[] args) {
        Product myProduct = new Product("Apple", 10.99, 5.5);
        myProduct.printInformation();

    }
}
