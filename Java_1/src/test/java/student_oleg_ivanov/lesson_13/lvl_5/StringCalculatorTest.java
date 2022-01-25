package student_oleg_ivanov.lesson_13.lvl_5;
//task 26-32

import javaguru.lv.student_oleg_ivanov.lesson_13.lvl_5.StringCalculator;
import javaguru.lv.teacher.annotations.CodeReview;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@CodeReview(approved = true)
public class StringCalculatorTest {

    @Test
    public void add() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("");
        assertEquals(0, result);
    }

    @Test
    public void add_v1() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("5");
        assertEquals(5, result);
    }

    @Test
    public void add_v2() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("5,5");
        assertEquals(10, result);
    }

    @Test
    public void add_v3() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1\n23,4");
        assertEquals(10, result);
    }

    @Test
    public void add_v4() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add(" //[;]\n1;2");
        assertEquals(3, result);
    }

    @Test
    public void add_v5() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("//[;][&]\n1;2&3");
        assertEquals(6, result);
    }

}