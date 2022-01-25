package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_2;
//task4-5

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please only enter number 1-7";
        }
    }
}


