package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;

//task_1
@CodeReview(approved = true)
public class WhileDefinition1 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}
