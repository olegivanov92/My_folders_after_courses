package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_7.Task_31;

import javaguru.lv.teacher.annotations.CodeReview;
import javaguru.lv.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "В методе actualPrice() не обятательно использовать getters для получения значения." +
        "Они будут вам напрямую доступны внутри класса.")
public class Product {
    public String name;
    public double regularPrice;
    public double discount;

    public Product(String name,double regularPrice, double discount) {
        this.name=name;
        this.regularPrice=regularPrice;
        this.discount=discount;
    }
    public double actualPrice(){
        double sum = getRegularPrice()*getDiscount()/100;
        return getRegularPrice()-sum;

    }
    void printInformation(){
        System.out.println(getName() + " Actual price is: " + actualPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}