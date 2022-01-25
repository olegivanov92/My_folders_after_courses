package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_5.Task_20;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog(6);
        myDog.setAge(6);
        myDog.voice();
        myDog.happyBirthday();

    }


}
