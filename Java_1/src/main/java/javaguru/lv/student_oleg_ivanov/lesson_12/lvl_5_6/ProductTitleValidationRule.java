package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_5_6;

//task 40
public class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {

        if (product.getTitle() == null || product.getTitle().isEmpty()) {
            ValidationException validationException = new ValidationException("RULE-1", "Title can not be empty", "title");
            throw validationException;
        }
        if (product.getTitle().length() < 3) {
            ValidationException validationException = new ValidationException("RULE-2", "Title length can't be lower than 3", "title");
            throw validationException;
        }
        if (product.getTitle().length() > 100) {
            ValidationException validationException = new ValidationException("RULE-3", "Title length can't be highest than 100", "title");
            throw validationException;
        }
        if (!product.getTitle().matches("[A-Za-z0-9]+")) {
            ValidationException validationException = new ValidationException("RULE-4", "Title may contain only English letters and numbers", "title");
            throw validationException;
        }


    }
}