package javaguru.lv.student_oleg_ivanov.lesson_7.lvl_6;

import javaguru.lv.teacher.annotations.CodeReview;

//task_10
@CodeReview(approved = true)
public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest testRunner = new CreditCardTest();
        testRunner.deposit();
        System.out.println();
        testRunner.withdraw();
        System.out.println();
        testRunner.withdrawFail();
        System.out.println();

    }


    public void deposit() {
        CreditCard myCard = new CreditCard();
        myCard.setPinCode(5544);
        myCard.setCardNumber(1111 - 2222 - 3333 - 4444);
        myCard.setCreditDept(0);
        myCard.setBalance(0);
        myCard.deposit(5544, 50, 30, 10);
        System.out.println("Deposit + credit Pay");
        System.out.println("Balance = " + myCard.getBalance());
        System.out.println("Credit Dept = " + myCard.getCreditDept());

    }

    public void withdraw() {
        CreditCard myCard = new CreditCard();
        myCard.setPinCode(5544);
        myCard.setCardNumber(1111 - 2222 - 3333 - 4444);
        myCard.setCreditDept(0);
        myCard.setBalance(0);
        myCard.withdraw(5544, 60, 50, 0, 30);
        System.out.println("Withdraw + credit");
        System.out.println("Balance = " + myCard.getBalance());
        System.out.println("Credit Dept = " + myCard.getCreditDept());
    }

    public void withdrawFail() {
        CreditCard myCard = new CreditCard();
        myCard.setPinCode(5544);
        myCard.setCardNumber(1111 - 2222 - 3333 - 4444);
        myCard.setCreditDept(0);
        myCard.setBalance(0);
        myCard.withdraw(5544, 60, 50, 31, 30);
        System.out.println("Withdraw Fail");
        System.out.println("Balance = " + myCard.getBalance());
        System.out.println("Credit Dept = " + myCard.getCreditDept());
    }

}







