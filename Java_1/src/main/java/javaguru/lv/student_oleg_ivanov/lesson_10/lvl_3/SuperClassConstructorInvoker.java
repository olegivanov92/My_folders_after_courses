package javaguru.lv.student_oleg_ivanov.lesson_10.lvl_3;

import javaguru.lv.teacher.annotations.CodeReview;

//task 16
//ключевое слово supper(); должно находится первым в теле конструктора.
@CodeReview(approved = true)
public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        super();
        System.out.println(1);
        System.out.println(2);
    }
}
