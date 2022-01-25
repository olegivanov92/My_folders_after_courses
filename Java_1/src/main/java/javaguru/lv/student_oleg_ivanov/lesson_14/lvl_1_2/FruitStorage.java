package javaguru.lv.student_oleg_ivanov.lesson_14.lvl_1_2;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
public class FruitStorage {
    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    //task 1
    public List<Apple> findGreenApples() {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : getAllApples()) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);


            }
        }
        return result;
    }

    //task 2
    public List<Apple> findRedApples() {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : getAllApples()) {
            if ("red".equals(apple.getColor())) {
                result.add(apple);


            }
        }
        return result;
    }

    //task 4
    public List<Apple> findApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    //task 5
    public List<Apple> findApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    //task 10
    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }


}