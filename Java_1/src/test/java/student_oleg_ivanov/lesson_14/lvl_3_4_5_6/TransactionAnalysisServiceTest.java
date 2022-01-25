package student_oleg_ivanov.lesson_14.lvl_3_4_5_6;

import javaguru.lv.student_oleg_ivanov.lesson_14.lvl_3_4_5_6.Trader;
import javaguru.lv.student_oleg_ivanov.lesson_14.lvl_3_4_5_6.Transaction;
import javaguru.lv.student_oleg_ivanov.lesson_14.lvl_3_4_5_6.TransactionAnalysisService;
import javaguru.lv.student_oleg_ivanov.lesson_14.lvl_3_4_5_6.TransactionTestData;
import javaguru.lv.teacher.annotations.CodeReview;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class TransactionAnalysisServiceTest {
    TransactionAnalysisService service = new TransactionAnalysisService();

    @Override
    public String toString() {
        return "TransactionAnalysisServiceTest{" +
                "service=" + service +
                '}';
    }

    @Test
    public void findTransactionsIn2011() {
        TransactionTestData data = new TransactionTestData();
        List<Transaction> result = service.findTransactionsIn2011(data.getTransactions());
        assertEquals(2, result.size());
    }


    @Test
    public void findTransactionsByYear() {
        TransactionTestData data = new TransactionTestData();
        List<Transaction> result = service.findTransactionsByYear(data.getTransactions(), 2011);
        assertEquals(2, result.size());
    }

    @Test
    public void findTransactionsByYear_v2() {
        TransactionTestData data = new TransactionTestData();
        List<Transaction> result = service.findTransactionsByYear(data.getTransactions(), 2012);
        assertEquals(4, result.size());

    }

    @Test
    public void findTransactionsByYear_v3() {
        TransactionTestData data = new TransactionTestData();
        List<Transaction> result = service.findTransactionsByYear(data.getTransactions(), 2013);
        assertEquals(0, result.size());

    }


    @Test
    public void sortMinToMaxTransactionsByValue() {
        TransactionTestData data = new TransactionTestData();
        List<Transaction> result = service.sortMinToMaxTransactionsByValue(data.getTransactions());
        assertEquals(6, result.size());
        System.out.println(result);

    }

    @Test
    public void sortMaxToMinTransactionsByValue() {
        TransactionTestData data = new TransactionTestData();
        List<Transaction> result = service.sortMaxToMinTransactionsByValue(data.getTransactions());
        assertEquals(6, result.size());
        System.out.println(result);
    }

    @Test
    public void find2011AndSortByValueMinToMax() {
        TransactionTestData data = new TransactionTestData();
        List<Transaction> result = service.find2011AndSortByValueMinToMax(data.getTransactions());
        assertEquals(2, result.size());
        System.out.println(result);


    }

    @Test
    public void allTransactionsByYear() {
        TransactionTestData data = new TransactionTestData();
        List<Transaction> result = service.allTransactionsByYear(data.getTransactions());
        assertEquals(6, result.size());

    }

    @Test
    public void allUniqueTransactionsByYear() {
        TransactionTestData data = new TransactionTestData();
        List<Integer> result = service.allUniqueTransactionsByYear(data.getTransactions());
        assertEquals(2, result.size());

    }

    @Test
    public void allUniqueTransactionsByTraders() {
        TransactionTestData data = new TransactionTestData();
        List<String> result = service.allUniqueTransactionsByTraders(data.getTransactions());
        assertEquals(4, result.size());

    }

    @Test
    public void allUniqueTransactionsByCity() {
        TransactionTestData data = new TransactionTestData();
        List<String> result = service.allUniqueTransactionsByCity(data.getTransactions());
        assertEquals(2, result.size());

    }

    @Test
    public void findTraderNamesFromCambridge() {
        TransactionTestData data = new TransactionTestData();
        List<Trader> result = service.findTraderNamesFromCambridge(data.getTransactions());
        assertEquals(3, result.size());

    }

    @Test
    public void findTraderNamesFromCityCambridge() {
        TransactionTestData data = new TransactionTestData();
        List<Trader> result = service.findTraderNamesFromCity(data.getTransactions(), "Cambridge");
        assertEquals(3, result.size());

    }

    @Test
    public void findTraderNamesFromCityLondon() {
        TransactionTestData data = new TransactionTestData();
        List<Trader> result = service.findTraderNamesFromCity(data.getTransactions(), "London");
        assertEquals(0, result.size());

    }

    @Test
    public void findTraderNamesFromCityMilan() {
        TransactionTestData data = new TransactionTestData();
        List<Trader> result = service.findTraderNamesFromCity(data.getTransactions(), "Milan");
        assertEquals(1, result.size());

    }

    @Test
    public void findAnyInMilan() {
        TransactionTestData data = new TransactionTestData();
        boolean result = service.findAnyInMilan(data.getTransactions());
        assertEquals(true, result);

    }

    @Test
    public void isAnyTraderBasedOnCity() {
        TransactionTestData data = new TransactionTestData();
        boolean result = service.isAnyTraderBasedOnCity(data.getTransactions(), "Cambridge");
        assertTrue(result);

    }

    @Test
    public void isAnyTraderBasedOnCity_v2() {
        TransactionTestData data = new TransactionTestData();
        boolean result = service.isAnyTraderBasedOnCity(data.getTransactions(), "London");
        assertFalse(result);

    }

    @Test
    public void isAnyTraderBasedOnCity_v3() {
        TransactionTestData data = new TransactionTestData();
        boolean result = service.isAnyTraderBasedOnCity(data.getTransactions(), "Milan");
        assertTrue(result);

    }

    @Test
    public void maxValueOfTransaction() {
        TransactionTestData data = new TransactionTestData();
        Optional<Integer> result = service.maxValueOfTransaction(data.getTransactions());
        if (result.isPresent())
            System.out.println("Test OK" + result);
        else System.out.println("Test Fail");

    }

    @Test
    public void minValueOfTransaction() {
        TransactionTestData data = new TransactionTestData();
        Optional<Integer> result = service.minValueOfTransaction(data.getTransactions());
        if (result.isPresent())
            System.out.println("Test OK" + result);
        else System.out.println("Test Fail");

    }

    @Test
    public void allTradersSorted() {
        TransactionTestData data = new TransactionTestData();
        String result = service.allTradersSorted(data.getTransactions());
        assertEquals("Alan,Brian,Mario,Raoul", result);

    }

    @Test
    public void allCitySorted() {
        TransactionTestData data = new TransactionTestData();
        String result = service.allCitySorted(data.getTransactions());
        assertEquals("Cambridge,Milan", result);

    }
}
