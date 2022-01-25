package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_4;

import java.util.ArrayList;
import java.util.List;

//task 25
public class OutOfMemoryError {
    public static void main(String[] args) {
        List<Integer> error = new ArrayList<>();
        for (int i = 1; i <= 1000000000; i++) {
            error.add(i);
        }
        System.out.println(error.size());
    }
}

