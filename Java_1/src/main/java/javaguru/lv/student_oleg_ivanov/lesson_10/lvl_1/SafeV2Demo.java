package javaguru.lv.student_oleg_ivanov.lesson_10.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;

//task 5
@CodeReview(approved = true)
public class SafeV2Demo {
    public static void main(String[] args) {
        SafeV2 safeV2 = new SafeV2(7777,300);
        safeV2.getMoney(7777,100);
        System.out.println(safeV2.getMoney());
        safeV2.putMoney(7777,200);
        System.out.println(safeV2.getMoney());
        safeV2.getMoney(1234,100);
        System.out.println(safeV2.getMoney());
        safeV2.putMoney(1234,50);
        System.out.println(safeV2.getMoney());
    }




}
