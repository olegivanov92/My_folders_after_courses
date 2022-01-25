package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_6;

import javaguru.lv.teacher.annotations.CodeReview;

//task_30
@CodeReview(approved = true)
public class VarArgsDemo {
    public static void main(String[] args) {
        VarArgs varArgs = new VarArgs();
        varArgs.words("Some text", "Hello World", "Hello people", "cat", "dog");


    }


}
