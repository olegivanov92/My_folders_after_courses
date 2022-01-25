package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_3.task_13;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public abstract class Animal {
    String name;
    int age;

    public Animal(String name,int age){this.name = name; this.age=age; }

    abstract public void voice();
}
