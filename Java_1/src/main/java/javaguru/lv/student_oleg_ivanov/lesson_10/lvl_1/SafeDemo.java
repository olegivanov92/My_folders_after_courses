package javaguru.lv.student_oleg_ivanov.lesson_10.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;

//task 4
@CodeReview(approved = true)
public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.pinCode=1234;
        safe.withdraw(1234,1000);
        System.out.println(safe.getMoney());
    }
}
