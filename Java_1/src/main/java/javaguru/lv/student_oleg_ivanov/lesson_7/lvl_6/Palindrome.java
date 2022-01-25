package javaguru.lv.student_oleg_ivanov.lesson_7.lvl_6;
//Task_11
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
public class Palindrome {
    boolean isPalindrome(String text) {
        String lowerCase = text.toLowerCase();
        String[] words = text.split(", ");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Element [" + i + "]: " + Arrays.toString(words));
        }
        char[] array = lowerCase.toCharArray();
        for (int i = 0; i < (array.length) / 2; i++) {
            if (array[i] != array[array.length - i - 1])
                return false;
        }
        System.out.println(Arrays.toString(new String[]{lowerCase}));
        return true;

    }


}
