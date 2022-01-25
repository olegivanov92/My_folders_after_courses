package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task_20
@CodeReview(approved = true)
public class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i==4){
                continue;
            }
            System.out.println(i);
            i++;

        }
    }
}
