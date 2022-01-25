package student_oleg_ivanov.lesson_13.lvl_1;

import javaguru.lv.student_oleg_ivanov.lesson_13.lvl_1.TaxCalculator;
import javaguru.lv.student_oleg_ivanov.lesson_13.lvl_1.TaxCalculatorImpl;
import javaguru.lv.teacher.annotations.CodeReview;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

@CodeReview(approved = true)
public class TaxCalculatorImplTest {
//task 3
    //task 4

    private TaxCalculator taxCalculator = new TaxCalculatorImpl();

    @Test
    public void shouldPayZeroTaxWhenIncomeIsZero() {
        var income = BigDecimal.ZERO;
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("0.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThen20000() {
        var income = new BigDecimal(10000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("2500.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
        var income = new BigDecimal(20000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("5000.00"));
    }
//task 6
    @Test
    public void shouldPay40PercentTaxWhenIncomeBiggerThen20000() {
        var income = new BigDecimal(30000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("9000.00"));
    }


}