package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_3;

import javaguru.lv.teacher.annotations.CodeReview;

//task 8-10
@CodeReview(approved = true)
public class Product {
    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                '}';
    }
}

