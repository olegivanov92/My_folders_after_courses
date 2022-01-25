package javaguru.lv.student_oleg_ivanov.lesson_4.lvl_3;
//task_10

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class BiggestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int userInputOne = scanner.nextInt();
        int userInputTwo = scanner.nextInt();
        int userInputThree = scanner.nextInt();
        if ((userInputOne >= userInputTwo) && (userInputOne >= userInputThree)) {
            System.out.println("The biggest number is: " + userInputOne);
        } else if ((userInputTwo >= userInputOne) && (userInputTwo >= userInputThree)) {
            System.out.println("The biggest number is: " + userInputTwo);
        } else {
            System.out.println("The biggest number is: " + userInputThree);

        }


    }
}