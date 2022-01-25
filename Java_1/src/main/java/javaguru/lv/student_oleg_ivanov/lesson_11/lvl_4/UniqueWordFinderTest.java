package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_4;
//task 27

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Set;
@CodeReview(approved = true)
public class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinderTest testRunner = new UniqueWordFinderTest();
        testRunner.uniqueWordTest();
        testRunner.uniqueWordTestFAil();
    }

    void uniqueWordTest() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        Set<String> find = uniqueWordFinder.find("Something cat dog worm water cat sun dog cat");
        int expectedResult = 5;
        int actualResult = find.size();
        if (expectedResult == actualResult)
            System.out.println("Test OK " + find);
        else
            System.out.println("Test Fail");

    }

    void uniqueWordTestFAil() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        Set<String> find = uniqueWordFinder.find("Java Something cat dog worm water cat sun dog cat");
        int expectedResult = 5;
        int actualResult = find.size();
        if (expectedResult == actualResult)
            System.out.println("Test OK " + find);
        else
            System.out.println("Test Fail");

    }
}
