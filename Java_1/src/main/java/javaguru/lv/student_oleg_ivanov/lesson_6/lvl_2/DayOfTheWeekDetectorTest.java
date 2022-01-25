package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_2;
//task_7
//task_8
//task_9
//task_10
//task_11

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
        test.shouldReturnNotCorrect();
    }

        public void shouldReturnMonday () {
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
            String dayOfTheWeek = detector.findDayOfTheWeek(1);
            checkTestResult("Monday".equals(dayOfTheWeek), "Monday");

        }
        public void shouldReturnTuesday () {
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
            String dayOfTheWeek = detector.findDayOfTheWeek(2);
            checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");

        }
        public void shouldReturnWednesday () {
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
            String dayOfTheWeek = detector.findDayOfTheWeek(3);
            checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");

        }
        public void shouldReturnThursday () {
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
            String dayOfTheWeek = detector.findDayOfTheWeek(4);
            checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday");

        }
        public void shouldReturnFriday () {
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
            String dayOfTheWeek = detector.findDayOfTheWeek(5);
            checkTestResult("Friday".equals(dayOfTheWeek), "Friday");

        }
        public void shouldReturnSaturday () {
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
            String dayOfTheWeek = detector.findDayOfTheWeek(6);
            checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");

        }
        public void shouldReturnSunday () {
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
            String dayOfTheWeek = detector.findDayOfTheWeek(7);
            checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");

        }
        public void shouldReturnNotCorrect () {
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
            String dayOfTheWeek = detector.findDayOfTheWeek(8);
            checkTestResult("Not correct day number".equals(dayOfTheWeek), "Not correct day number");

        }
        public void checkTestResult ( boolean condition, String testName){
            if (condition) {
                System.out.println(testName + " = OK!");
            } else {
                System.out.println(testName + " = FAIL!");
            }
        }


    }