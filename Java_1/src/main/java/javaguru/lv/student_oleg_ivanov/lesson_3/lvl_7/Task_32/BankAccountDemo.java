package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_7.Task_32;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}
