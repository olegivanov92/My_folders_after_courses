package javaguru.lv.student_oleg_ivanov.lesson_14.lvl_3_4_5_6;


import javaguru.lv.teacher.annotations.CodeReview;
import javaguru.lv.teacher.annotations.CodeReviewComment;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


//task 19
@CodeReview(approved = true)
@CodeReviewComment(comment = "Супер =)")
public class TransactionAnalysisService {
    public List<Transaction> findTransactionsIn2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .collect(Collectors.toList());
    }

    //task 21
    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(Collectors.toList());
    }

    //task 22
    public List<Transaction> sortMinToMaxTransactionsByValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());

    }

    //task 23
    public List<Transaction> sortMaxToMinTransactionsByValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(Collectors.toList());

    }

    //task 24
    public List<Transaction> find2011AndSortByValueMinToMax(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    //task 25
    public List<Transaction> allTransactionsByYear(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getYear))
                .collect(Collectors.toList());

    }


    //task 26
    public List<Integer> allUniqueTransactionsByYear(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(Collectors.toList());
    }

    //task 27
    public List<String> allUniqueTransactionsByTraders(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());

    }

    //task 28
    public List<String> allUniqueTransactionsByCity(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
    }


    //task 29
    public List<Trader> findTraderNamesFromCambridge(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

    }

    //task 31
    public List<Trader> findTraderNamesFromCity(List<Transaction> transactions, String cityToFind) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(cityToFind))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
    }


    //task 32
    public boolean findAnyInMilan(List<Transaction> transactions) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));


    }

    //task 33-34
    public boolean isAnyTraderBasedOnCity(List<Transaction> transactions, String cityToCheck) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(cityToCheck));
    }

    //task 35
    public Optional<Integer> maxValueOfTransaction(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
    }

    //task 36
    public Optional<Integer> minValueOfTransaction(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);

    }

    //task 37
    public String allTradersSorted(List<Transaction> transactions) {
        return transactions.stream()
                .map((Transaction transaction) -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }

    //task 38
    public String allCitySorted(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }
}