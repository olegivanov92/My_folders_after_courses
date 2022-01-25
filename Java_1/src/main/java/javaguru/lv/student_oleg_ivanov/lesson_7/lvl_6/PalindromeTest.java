package javaguru.lv.student_oleg_ivanov.lesson_7.lvl_6;
//Task_11

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest testRunner = new PalindromeTest();
        testRunner.test1();
        testRunner.test2();
    }

    public void test1() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("LeVEl");
        System.out.println("Is palindrome?: " + result);

    }

    public void test2() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("llevel");
        System.out.println("Is palindrome?: " + result);

    }
}
