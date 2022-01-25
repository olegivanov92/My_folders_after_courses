package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task_19
@CodeReview(approved = true)
public class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            break;
        }
    }

}
