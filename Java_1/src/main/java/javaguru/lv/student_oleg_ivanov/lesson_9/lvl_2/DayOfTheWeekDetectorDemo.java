package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_2;
//task4-5

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorDemo {
    DayOfTheWeekDetector dayOfTheWeekDetector;


    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }


    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo ifVer = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        ifVer.run();
        DayOfTheWeekDetectorDemo arrVer = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        arrVer.run();
        DayOfTheWeekDetectorDemo switchVer = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        switchVer.run();
    }


    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please only enter number 1-7: ");
        int userInput = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(userInput));


    }
}
