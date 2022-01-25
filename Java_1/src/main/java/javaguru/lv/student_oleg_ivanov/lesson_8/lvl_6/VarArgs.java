package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_6;

import javaguru.lv.teacher.annotations.CodeReview;

//task_30
@CodeReview(approved = true)
public class VarArgs {
    void words(String... words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}


