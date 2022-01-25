package javaguru.lv.student_oleg_ivanov.lesson_13.lvl_5;

import javaguru.lv.teacher.annotations.CodeReview;

//task 26-32
@CodeReview(approved = true)
public class StringCalculator {
    public int add(String numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if (Character.isDigit(numbers.charAt(i))) {
                sum = sum + Integer.parseInt(String.valueOf(numbers.charAt(i)));
            }

        }
        return sum;
    }
}