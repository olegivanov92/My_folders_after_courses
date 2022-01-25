package javaguru.lv.student_oleg_ivanov.lesson_5.lvl_4;
//task_27
//task_28

import javaguru.lv.teacher.annotations.CodeReview;
import javaguru.lv.teacher.annotations.CodeReviewComment;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Вижу ошибочку маленькую. Вы создаете два объекта ArraysMaxMin. Можно создать только один" +
        "Объекты у нас не одноразовые (в большенстве своем), так что можно обойтись одним.")
public class ArraysMaxMinDemo {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        numbers[0] = random.nextInt(10);
        numbers[1] = random.nextInt(10);
        numbers[2] = random.nextInt(10);
        System.out.println("Cell_one = " + numbers[0]);
        System.out.println("Cell_two= " + numbers[1]);
        System.out.println("Cell_three = " + numbers[2]);
        ArraysMaxMin arraysMinMax = new ArraysMaxMin();
        int maxResult = arraysMinMax.findMax(numbers);
        int minResult = arraysMinMax.findMin(numbers);


        System.out.println("Max number for array: " + Arrays.toString(numbers) + " is = " + maxResult);
        System.out.println("Min number for array: " + Arrays.toString(numbers) + " is = " + minResult);

    }
}

