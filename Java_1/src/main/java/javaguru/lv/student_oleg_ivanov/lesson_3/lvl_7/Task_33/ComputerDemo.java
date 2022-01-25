package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_7.Task_33;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ComputerDemo {
    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }
}
