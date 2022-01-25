package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;

//task 1
@CodeReview(approved = true)
public interface JavaStarLoginService {
    boolean canLogin(String login, String password);

}
