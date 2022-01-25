package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_5_6;

//task 42
public class ProductPriceValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            ValidationException validationException = new ValidationException("RULE-5", "It's wasn't be Empty", "price");
            throw validationException;
        }
        if (product.getPrice() <= 0) {
            ValidationException validationException = new ValidationException("RULE-6", "Price can't be 0", "price");
            throw validationException;
        }
    }
}
