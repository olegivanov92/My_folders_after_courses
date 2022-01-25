package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_5_6;

//task 44
public class ProductDescriptionValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {

        if (product.getDescription().length() >= 2000) {
            ValidationException validationException = new ValidationException("RULE-7", "Description length can't be highest than 2000", "description");
            throw validationException;

        }
        if (!product.getDescription().matches("[A-Za-z0-9]+")) {
            ValidationException validationException = new ValidationException("RULE-8", "Description may contain only English letters and numbers", "description");
            throw validationException;
        }

    }

}
