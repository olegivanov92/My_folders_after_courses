package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task_19
@CodeReview(approved = true)
public class ForInfiniteLoopBreak {
    public static void main(String[] args) {

        for (int i = 0; i <10; ) {
            System.out.println("i = " + i + ";");
            break;
        }

    }
}
