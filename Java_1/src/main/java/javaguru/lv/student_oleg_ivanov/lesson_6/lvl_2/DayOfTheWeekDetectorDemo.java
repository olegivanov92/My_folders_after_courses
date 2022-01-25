package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_2;
//task_7
//task_8
//task_9
//task_10
//task_11
import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);
    }

}
