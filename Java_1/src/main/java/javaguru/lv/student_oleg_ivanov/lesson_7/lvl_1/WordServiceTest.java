package javaguru.lv.student_oleg_ivanov.lesson_7.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;

//task_1
@CodeReview(approved = true)
public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest testRunner = new WordServiceTest();
        testRunner.chekMostFrequent();
        testRunner.chekFirstMostFrequent();

    }

    void chekMostFrequent() {
        WordService wordService = new WordService();
        String actualResult = wordService.findMostFrequentWord("text friend phone dog phone phone dog text phone");
        String expectedResult = "phone";
        if (actualResult.equals(expectedResult)) {
            System.out.println("Test MostFrequent...OK...  is: " + actualResult);
        } else System.out.println("Test fail: Expected result = " + expectedResult + ". But Actual Result = " + actualResult );

    }

    void chekFirstMostFrequent() {
        WordService wordService = new WordService();
        String actualResult = wordService.findMostFrequentWord("dog friend text dog phone phone dog text text");
        String expectedResult = "dog";
        if (actualResult.equals(expectedResult)) {
            System.out.println("Test FirstMostFrequent...OK...  is: " + actualResult);
        } else System.out.println("Test fail: ");

    }


}



