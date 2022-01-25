package javaguru.lv.student_oleg_ivanov.lesson_7.lvl_6;

import javaguru.lv.teacher.annotations.CodeReview;
import javaguru.lv.teacher.annotations.CodeReviewComment;

//task_10
@CodeReview(approved = true)
@CodeReviewComment(comment = "Есть некоторые промохи в проверках, но вцелом хорошо.")
public class CreditCard {
    private long cardNumber;
    private int pinCode;
    int balance;
    int creditLimit;
    int creditDept;

    public CreditCard() {

    }

    public void deposit(int pinCode, int amount, int creditLimit, int creditDept) {
        if (this.pinCode == pinCode && creditDept <= 0) {
            balance = balance + amount;
        } else if (this.pinCode == pinCode && creditDept > 0) {
            balance = balance + amount - creditDept;
        } else if (this.pinCode != pinCode) {
            System.out.println("Incorrect password operation declined");
        }

    }


    public void withdraw(int pinCode, int amount, int balance, int creditDept, int creditLimit) {
        if (this.pinCode == pinCode && balance >= amount) {
            this.balance = balance - amount;
            this.creditDept = creditDept;
        } else if (this.pinCode != pinCode) {
            System.out.println("Incorrect password operation declined ");
        } else if (amount > balance && creditDept > creditLimit) {
            System.out.println("Operation Declined, credit dept higher than credit limit ");
        } else if (this.pinCode == pinCode && balance < amount && creditDept < creditLimit) {
            int result = balance - amount;
            this.creditDept = creditDept - result;
            this.balance = amount;


        }
    }


    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCreditDept() {
        return creditDept;
    }

    public void setCreditDept(int creditDept) {
        this.creditDept = creditDept;
    }
}