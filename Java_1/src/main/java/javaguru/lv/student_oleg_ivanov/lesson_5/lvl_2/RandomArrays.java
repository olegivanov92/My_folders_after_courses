package javaguru.lv.student_oleg_ivanov.lesson_5.lvl_2;
//task_12
//task_13
//task_14
//task_15

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class RandomArrays {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        numbers[0] = random.nextInt(10);
        numbers[1] = random.nextInt(10);
        numbers[2] = random.nextInt(10);
        int sum = numbers[0] + numbers[1] + numbers[2];
        int middle = sum / 3;
        System.out.println("Cell_one = " + numbers[0]);
        System.out.println("Cell_two= " + numbers[1]);
        System.out.println("Cell_three = " + numbers[2]);
        System.out.println("Sum = " + sum);
        System.out.println("Middle = " + middle);
        System.out.println("Cell_one + 2 = " +  (numbers[0] + 2));
        System.out.println("Cell_two + 2 = " +  (numbers[1] + 2));
        System.out.println("Cell_three + 2 = " +  (numbers[2] + 2));



    }

}
