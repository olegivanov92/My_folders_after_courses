package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_5_6;

import java.util.List;


public class ProductValidatorImplTest {
    private ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());

    //task 38
    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2();
        test.rule3();
        test.rule4();
        test.rule5();
        test.rule6();
        test.rule7();
        test.rule8();
        test.rule1_5();
        test.rule1_8();
        test.rule5_8();
        test.rule1_5_8();

    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule2() {
        Product product = new Product("Ap", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title length can't be lower than 3"), "rule2");
    }

    public void rule3() {
        String str = "manymanywords";
        String repeated = str.repeat(10);
        Product product = new Product(repeated, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Title length can't be highest than 100"), "rule3");
    }

    public void rule4() {
        Product product = new Product("Яблоко", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title may contain only English letters and numbers"), "rule4");
    }

    public void rule5() {
        Product product = new Product("Apple", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResult(exceptions.get(0).getDescription().equals("It's wasn't be Empty"), "rule5");
    }


    public void rule6() {
        Product product = new Product("Apple", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price can't be 0"), "rule6");
    }

    public void rule7() {
        String str = "manymanywords";
        String repeated = str.repeat(155);
        Product product = new Product("Apple", 1, repeated);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7");
        checkResult(exceptions.get(0).getDescription().equals("Description length can't be highest than 2000"), "rule7");
    }

    public void rule8() {
        Product product = new Product("Apple", 1, "Описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description may contain only English letters and numbers"), "rule8");
    }

    //task 46
    //не правильно указано название продукта и его цена
    public void rule1_5() {

        Product product = new Product("Яблоко", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule1-5");

    }

    //task 46
    //не правильно указано название продукта и его описание
    public void rule1_8() {
        Product product = new Product("Яблоко", 1, "Описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule1-8");

    }

    //task 46
    //не правильно указано цена продукта и его описание
    public void rule5_8() {
        Product product = new Product("Apple", 0, "Описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule5-8");
    }

    //task 46
    //не правильно указаны все три свойства!
    public void rule1_5_8() {
        Product product = new Product("Яблоко", 0, "Описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 3, "rule5-8");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
