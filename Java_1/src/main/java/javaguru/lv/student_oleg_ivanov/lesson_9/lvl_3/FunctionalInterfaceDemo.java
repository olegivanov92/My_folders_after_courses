package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_3;

import javaguru.lv.teacher.annotations.CodeReview;

//task 6
@CodeReview(approved = true)
public class FunctionalInterfaceDemo implements FunctionalInterface {


    @Override
    public String words(String data, String month, String year) {

        return data + "." + month + "." + year;
    }


    public static void main(String[] args) {
        FunctionalInterface demo = new FunctionalInterfaceDemo();
        String result = demo.words("22", "September", "2021");
        System.out.println(result);

    }


}