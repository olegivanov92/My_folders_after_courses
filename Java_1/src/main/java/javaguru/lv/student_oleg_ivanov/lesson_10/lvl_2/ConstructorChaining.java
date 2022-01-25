package javaguru.lv.student_oleg_ivanov.lesson_10.lvl_2;

import javaguru.lv.teacher.annotations.CodeReview;
import javaguru.lv.teacher.annotations.CodeReviewComment;

//task 10
@CodeReview(approved = false)
@CodeReviewComment(comment = "При вызове конструктора, у вас потерялис параметры, которые вы подаете в этот конструктор." +
        "Один параметр надо передать в приватный конструктор, а другой записать в состояние parameterCount" +
        "Все еще false. Мы должны не вызывать конструктор Object-a, а вызывать внутренний (приватный) конструктор этого" +
        "же класса. Присмотритесь, у вас тут два конструктора. Приватный надо вызвать из публичного")
public class ConstructorChaining {
    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        super();
        this.parameterCount = parameterCount;


    }

}
