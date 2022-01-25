package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task_16
@CodeReview(approved = true)
public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
