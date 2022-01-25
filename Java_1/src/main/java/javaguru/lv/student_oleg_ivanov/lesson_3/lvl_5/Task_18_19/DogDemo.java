package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_5.Task_18_19;

import javaguru.lv.teacher.annotations.CodeReview;

//task_18
//task_19
@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Tuzik", 6);
        myDog.setName("Tuzik");
        myDog.setAge(6);
        String myDogName = myDog.getName();
        int myDogAge = myDog.getAge();
        myDog.voice();


    }

}
