package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_2;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_9_UserName {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your user name please");
        String userName = myScanner.nextLine();
        System.out.println("Hello " + userName + "!");
    }

}
