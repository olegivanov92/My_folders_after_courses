package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_1;
//task 4
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
@CodeReview(approved = true)
public class Task_4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(5);
        list.add(5);
        for (Integer integer : list) {
            System.out.println(integer);

        }
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(1);
        list1.add(5);
        list1.add(5);
        for (Integer integer : list) {
            System.out.println(integer);


        }
    }
}
