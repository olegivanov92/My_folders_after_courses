package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_3.task_13;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", 5);
        Dog dog = new Dog("Tuzik", 10);

        cat.voice();
        dog.voice();

    }
}
