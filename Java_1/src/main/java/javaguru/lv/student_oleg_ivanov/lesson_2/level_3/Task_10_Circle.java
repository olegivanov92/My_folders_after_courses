package javaguru.lv.student_oleg_ivanov.lesson_2.level_3;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_10_Circle {
    public static void main(String[] args) {
        System.out.println("Enter Radius");
        Scanner scanner = new Scanner(System.in);
        double Number = scanner.nextDouble();
        double pi = 3.1415;
        double perimeter = 2 * pi * Number;
        double area = Number * Number * pi;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);


    }

}
