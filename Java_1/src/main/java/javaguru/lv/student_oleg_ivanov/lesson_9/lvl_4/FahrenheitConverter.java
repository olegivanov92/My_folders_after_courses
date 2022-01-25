package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task 12
@CodeReview(approved = true)
public class FahrenheitConverter implements TemperatureConverter{
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
