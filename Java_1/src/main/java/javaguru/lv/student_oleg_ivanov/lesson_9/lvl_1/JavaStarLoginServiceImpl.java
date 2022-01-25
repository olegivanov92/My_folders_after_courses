package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;

//task 1
@CodeReview(approved = true)
public class JavaStarLoginServiceImpl implements JavaStarLoginService {

    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

}

