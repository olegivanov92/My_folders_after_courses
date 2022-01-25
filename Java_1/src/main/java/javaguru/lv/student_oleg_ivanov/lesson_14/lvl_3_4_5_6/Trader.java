package javaguru.lv.student_oleg_ivanov.lesson_14.lvl_3_4_5_6;

import javaguru.lv.teacher.annotations.CodeReview;

//task 18
@CodeReview(approved = true)
public class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String toString() {
        return "Trader:" + this.name + " in " + this.city;
    }
}

