package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_1;
//task 3
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = true)
public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0,1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(10);
        System.out.println("List Size: " + integerList.size());
        System.out.println("List: " + integerList);
        integerList.remove(0);
        integerList.remove((Object)3);
        System.out.println("List After delete two elements: " + integerList);
        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }
}
