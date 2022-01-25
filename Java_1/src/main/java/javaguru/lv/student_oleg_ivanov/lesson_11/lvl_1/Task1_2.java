package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_1;
//Task 1-2
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@CodeReview(approved = true)
public class Task1_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
//ArrayList реализован внутри в виде обычного массива.В нем быстро реализованы взятие и изменение элемента.

        List<String> words = new LinkedList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");

        //LinkedList реализован в виде связного списка: набора отдельных элементов, каждый из которых хранит ссылку на следующий и предыдущий элементы.
        //Если много записывать или удалять то лучше использовать его.
    }

}
