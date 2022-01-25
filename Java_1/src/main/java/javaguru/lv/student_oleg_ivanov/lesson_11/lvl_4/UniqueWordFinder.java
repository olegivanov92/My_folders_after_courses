package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_4;
//task 27

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.HashSet;
import java.util.Set;

@CodeReview(approved = true)
public class UniqueWordFinder {

    Set<String> find(String text) {
        Set<String> find = new HashSet<>();
        String[] list = text.split(" ");

        for (int i = 0; i < list.length; i++) {

            find.add(list[i]);
        }
        return find;

        /*
        1 - list[0]
        2 - list[1]
        3 - list[2]
        4 - list[3]
         */

    }
}

