package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_5_6;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Move {

    private int x;
    private int y;


    public Move(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }
}
