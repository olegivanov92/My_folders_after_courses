package javaguru.lv.student_oleg_ivanov.lesson_10.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;

//task 5
@CodeReview(approved = true)
public class SafeV2 {
    private int password;
    private int money;

    public SafeV2(int password, int money) {
        this.password = password;
        this.money = money;

    }

    public void getMoney(int password, int take) {
        if (this.password == password) {
            money = money - take;
        } else {
            System.out.println("Incorrect password");
        }

    }


    public void putMoney(int password, int put) {
        if (this.password == password) {
            money = money + put;
        } else {
            System.out.println("Incorrect password");
        }
    }


    public int getMoney() {
        return money;
    }

}