package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_3;
//task 19

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer:");
        try {
            int i = scanner.nextInt();
            System.out.println(i);
        } catch (InputMismatchException e) {
            System.out.println("It's not a Integer: Try Again ");
        }
    }
}



