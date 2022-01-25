package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_5.Task_22;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Black");
        myDog.voice();
        myDog.changeColor("Brown");


    }
}
