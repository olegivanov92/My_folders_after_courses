package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_2;

import javaguru.lv.teacher.annotations.CodeReview;

//task4-5
@CodeReview(approved = true)
public class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        switch (number) {
            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";

            case 5:
                return "Friday";

            case 6:
                return "Saturday";

            case 7:
                return "Sunday";
            default:
                return "Please only enter number 1-7";
        }
    }
}
