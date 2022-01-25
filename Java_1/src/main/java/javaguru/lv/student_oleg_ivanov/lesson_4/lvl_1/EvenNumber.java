package javaguru.lv.student_oleg_ivanov.lesson_4.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;

//task 4
@CodeReview(approved = true)
public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int userInput = scanner.nextInt();
        int even = userInput % 2;

        if (even == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Not even number");
        }
    }
}
