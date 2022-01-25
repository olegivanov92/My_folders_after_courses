package javaguru.lv.student_oleg_ivanov.lesson_2.level_1;
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_2_ScanDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the first number:");
        System.out.println("Please type the second number:");

        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();
        System.out.println("Your answer is" +  (firstDoubleNumber + secondDoubleNumber));
        System.out.println("Your answer is" + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("Your answer is" + (firstDoubleNumber * secondDoubleNumber));
        System.out.println("Your answer is" + (firstDoubleNumber / secondDoubleNumber));
    }
}
