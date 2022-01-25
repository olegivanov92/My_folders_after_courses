package student_oleg_ivanov.lesson_14.lvl_1_2;

import javaguru.lv.student_oleg_ivanov.lesson_14.lvl_1_2.*;
import javaguru.lv.teacher.annotations.CodeReview;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

@CodeReview(approved = true)
public class FruitStorageTest {
    FruitStorage storage = new FruitStorage();


    //task 1
    @Test
    public void getGreenApples() {
        List<Apple> allApples = storage.findGreenApples();
        assertEquals(3, allApples.size());

    }

    //task 2
    @Test
    public void getRedApples() {
        List<Apple> allApples = storage.findRedApples();
        assertEquals(3, allApples.size());

    }

    //task 4
    @Test
    public void getGreenApples_v2() {
        List<Apple> allApples = storage.findApplesByColor(storage.getAllApples(), "green");
        assertEquals(3, allApples.size());

    }

    //task 4
    @Test
    public void getRedApples_v3() {
        List<Apple> allApples = storage.findApplesByColor(storage.getAllApples(), "red");
        assertEquals(3, allApples.size());

    }

    //task 5
    @Test
    public void getApplesByWeight() {
        List<Apple> allApples = storage.findApplesByWeight(storage.getAllApples(), 150);
        assertEquals(4, allApples.size());

    }

    //task 10
    @Test
    public void findApplesByPredicate() {
        List<Apple> allApples = storage.findApples(storage.getAllApples(), new AppleGreenColorPredicate());
        assertEquals(3, allApples.size());

    }

    //task 10
    @Test
    public void findApplesByPredicate_v1() {
        List<Apple> allApples = storage.findApples(storage.getAllApples(), new AppleRedColorPredicate());
        assertEquals(3, allApples.size());

    }

    //task 10
    @Test
    public void findApplesByPredicate_v2() {
        List<Apple> allApples = storage.findApples(storage.getAllApples(), new AppleLightWeightPredicate());
        assertEquals(4, allApples.size());

    }

    //task 10
    @Test
    public void findApplesByPredicate_v3() {
        List<Apple> allApples = storage.findApples(storage.getAllApples(), new AppleHeavyWeightPredicate());
        assertEquals(4, allApples.size());

    }

    //task 11
    @Test
    public void AppleGreenAndHeavyWeightPredicate() {
        List<Apple> allApples = storage.findApples(storage.getAllApples(), new AppleGreenAndHeavyWeightPredicate());
        assertEquals(1, allApples.size());
    }

    //task 14-17
    @Test
    public void findRedApples() {
        List<Apple> redApples = storage.findApples(storage.getAllApples(), apple -> "red".equals(apple.getColor()));
        assertEquals(3, redApples.size());
    }

    //task 14-17
    @Test
    public void findGreenApples() {
        List<Apple> redApples = storage.findApples(storage.getAllApples(), apple -> "green".equals(apple.getColor()));
        assertEquals(3, redApples.size());
    }

    //task 14-17
    @Test
    public void findHeavyApples() {
        List<Apple> redApples = storage.findApples(storage.getAllApples(), apple -> apple.getWeight() > 150);
        assertEquals(4, redApples.size());
    }

    //task 14-17
    @Test
    public void findLightApples() {
        List<Apple> redApples = storage.findApples(storage.getAllApples(), apple -> apple.getWeight() < 150);
        assertEquals(4, redApples.size());
    }

}