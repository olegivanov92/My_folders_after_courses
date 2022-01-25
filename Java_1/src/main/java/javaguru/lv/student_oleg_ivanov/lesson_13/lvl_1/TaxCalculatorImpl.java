package javaguru.lv.student_oleg_ivanov.lesson_13.lvl_1;
//task 2, 4, 5, 7, 8

import javaguru.lv.teacher.annotations.CodeReview;

import java.math.BigDecimal;

@CodeReview(approved = true)
public class TaxCalculatorImpl implements TaxCalculator{
    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal("20000")) <= 0) {
            return income.multiply(new BigDecimal("0.25"));
        } else {
            var incomeBiggerThen20000 = income.subtract(new BigDecimal("20000"));
            var taxAfter20000 = incomeBiggerThen20000.multiply(new BigDecimal("0.40"));
            var taxBefore20000 = new BigDecimal("20000").multiply(new BigDecimal("0.25"));
            return taxBefore20000.add(taxAfter20000);
        }
    }
}

