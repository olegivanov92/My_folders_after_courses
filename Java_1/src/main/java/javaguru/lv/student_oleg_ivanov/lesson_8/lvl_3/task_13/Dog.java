package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_3.task_13;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog extends Animal {

    Dog(String name,int age){
        super(name,age);
    }

    @Override
    public void voice() {
        System.out.println("Gav..Gav");
    }


}
