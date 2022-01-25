package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_7.Task_32;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BankAccount {
    public String owner;
    public int moneyAmount;

    public BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.moneyAmount = moneyAmount;

    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.moneyAmount;
    }

}
