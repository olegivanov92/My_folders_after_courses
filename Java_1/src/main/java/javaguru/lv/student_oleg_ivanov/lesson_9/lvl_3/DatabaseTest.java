package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_3;
//task 8-10
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Optional;

@CodeReview(approved = true)
public class DatabaseTest {
    public static void main(String[] args) {
        DatabaseTest test = new DatabaseTest();
        test.saveTest();
        test.findTest();
        test.saveTestFail();
        test.findTestFail();

    }

    public void saveTest() {
        InMemoryDatabase db = new InMemoryDatabase();
        Product sugar = new Product("sugar");
        Product milk = new Product("milk");
        Product water = new Product("water");
        db.save(sugar);
        db.save(milk);
        db.save(water);
        Product actualResult = db.newArray()[2];
        check((water), actualResult, "Save Product Test: ");


    }

    public void saveTestFail() {
        InMemoryDatabase db = new InMemoryDatabase();
        Product sugar = new Product("sugar");
        Product milk = new Product("milk");
        Product water = new Product(null);
        db.save(sugar);
        db.save(milk);
        db.save(water);
        Product actualResult = db.newArray()[2];
        check(new Product("water"), actualResult, "Save Product Fail Test: ");

    }

    public void findTest() {
        InMemoryDatabase db = new InMemoryDatabase();
        Product sugar = new Product("sugar");
        Product milk = new Product("milk");
        Product water = new Product("water");
        db.save(sugar);
        db.save(milk);
        db.save(water);
        Optional<Product> actualResult = db.findByTitle("sugar");
        check(Optional.of(sugar), actualResult, "Find Product Test: ");
    }

    public void findTestFail() {
        InMemoryDatabase db = new InMemoryDatabase();
        Product sugar = new Product("sugar");
        Product milk = new Product("milk");
        Product water = new Product("water");
        db.save(sugar);
        db.save(milk);
        db.save(water);
        Optional<Product> actualResult = db.findByTitle("banana");
        check(Optional.of(sugar), actualResult, "Find Product Fail Test: ");
    }

    public void check(Product expectedResult, Product actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!!!");
            System.out.println("Expected was: " + expectedResult + " but actual: " + actualResult);
        }
    }

    public void check(Optional<Product> expectedResult, Optional<Product> actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!!!");
            System.out.println("Expected was: " + expectedResult + " but actual: " + actualResult);
        }
    }
}



