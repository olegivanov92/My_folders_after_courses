package javaguru.lv.student_oleg_ivanov.lesson_14.lvl_1_2;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Apple {
    private String color;
    private int weight;

    public Apple (String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
