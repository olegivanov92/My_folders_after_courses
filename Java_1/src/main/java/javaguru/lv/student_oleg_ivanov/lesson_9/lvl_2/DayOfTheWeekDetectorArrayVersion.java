package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_2;

import javaguru.lv.teacher.annotations.CodeReview;

//task4-5
@CodeReview(approved = true)
public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[]daysOfWeek = {"Monday","Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number >= 1 && number <= 7)
            return daysOfWeek[number - 1];
        return "Please only enter number 1-7";


    }
}
