package javaguru.lv.student_oleg_ivanov.lesson_10.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;

//task 4
@CodeReview(approved = true)
public class Safe {
    public int pinCode = 8844;
    public int money = 1000;

    public void withdraw(int pinCode, int amount) {
        if (this.pinCode == pinCode) {
            money = money - amount;
        }
    }

    public int getMoney() {
        return money;
    }
}
