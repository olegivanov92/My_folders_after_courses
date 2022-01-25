package javaguru.lv.student_oleg_ivanov.lesson_13.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;

import java.math.BigDecimal;

//task 1
@CodeReview(approved = true)
public interface TaxCalculator {
    BigDecimal calculateTax(BigDecimal income);
}
