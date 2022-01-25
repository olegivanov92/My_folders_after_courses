package javaguru.lv.student_oleg_ivanov.lesson_2.level_2;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_8_NameAlert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String Name = scanner.nextLine();
        char a = '!';
        System.out.println("Hello " + Name + (a));
    }
}


