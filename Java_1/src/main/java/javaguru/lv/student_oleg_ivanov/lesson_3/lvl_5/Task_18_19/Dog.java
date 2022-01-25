package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_5.Task_18_19;

import javaguru.lv.teacher.annotations.CodeReview;

//task_18
//task_19
@CodeReview(approved = true)
public class Dog {
    private String name;
    private int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void voice() {
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println("The dog name is " + name);
        System.out.println("The dog age is " + age);

    }


}