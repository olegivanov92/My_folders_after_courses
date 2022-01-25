package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;

//task_3
@CodeReview(approved = true)
public class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 myConstructorV3 = new DefaultConstructorV3();
        System.out.println(myConstructorV3.getFullName());
        System.out.println(myConstructorV3.getAge());
        System.out.println(myConstructorV3.isMale());
        System.out.println(myConstructorV3.getFemale());


    }


}
