package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_3;

import javaguru.lv.teacher.annotations.CodeReview;

//Task_11
//Task_12
//Task_13
@CodeReview(approved = true)
public class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();


    }
}
