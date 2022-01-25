package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_5_6;
//task 32,33

import java.util.List;

public interface ProductValidator {
    List<ValidationException> validate(Product product);
}
