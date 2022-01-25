package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_3;
//task 8-10
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Optional;

@CodeReview(approved = true)
public interface ProductDatabase {
    void save(Product product);
    Optional<Product> findByTitle(String productTitle);
}
