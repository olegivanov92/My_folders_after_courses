package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_5.Task_20;

import javaguru.lv.teacher.annotations.CodeReview;
import javaguru.lv.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Ваша собака не становиться на год старше, когда празднует День Рождения =)." +
        "Нужно поменять значение в состоянии age, чтобы это работало правильно." +
        "Я бы сказал, что проблема в том, что вы зачем-то newAge придумали." +
        "Просто age = age + 1 или можно age++.")
//я так понимаю, что ошибка была в (getAge() + 1) в методе happybirthday?
public class Dog {
    private int age;
    private String color;

    public Dog(int age) {
        this.age = age;

    }

    void happyBirthday() {
        System.out.println("Happy Birthday...Gav! Gav! Gav!");
        int newAge=(age=age + 1);
        System.out.println("my new age is: " + newAge);


    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void voice() {
        System.out.println("Gav! Gav!");
    }
}
