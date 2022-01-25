package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_7.Task_29;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ParrotDemo {
    public static void main(String[] args) {
        Parrot myParrot = new Parrot("Gosha", 2, "Green");
        myParrot.canSpeak = false;
        System.out.println("My name is " + myParrot.getName());
        System.out.println("My age is " + myParrot.getAge());
        System.out.println("My color is " + myParrot.getColor());
        System.out.println("Can I'm speak: " + myParrot.isCanSpeak());


    }
}
