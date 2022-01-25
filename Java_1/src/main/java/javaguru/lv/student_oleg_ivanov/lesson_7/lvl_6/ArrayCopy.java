package javaguru.lv.student_oleg_ivanov.lesson_7.lvl_6;
//task_12

import javaguru.lv.teacher.annotations.CodeReview;
import javaguru.lv.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "in[i] > numberFrom - 1 && in[i] < numberTo + 1 - А зачем так сложно то? =) Есть же знак >=")
public class ArrayCopy {
    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int count = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] > numberFrom - 1 && in[i] < numberTo + 1) {
                count++;
            }
        }
        int arrayTwo[] = new int[count];
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] > numberFrom - 1 && in[i] < numberTo + 1) {
                arrayTwo[index] = in[i];
                index++;
            }
        }
        return arrayTwo;
    }
}
