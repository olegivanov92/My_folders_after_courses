package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_3;
//task 8-10

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Optional;
@CodeReview(approved = true)
public class InMemoryDatabase implements ProductDatabase {

    Product[] products = {};

    public Product[] newArray() {
        return Arrays.copyOf(products, products.length + 1);

    }


    @Override
    public void save(Product product) {
        products = newArray();
        products[products.length - 1] = product;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : products) {
            if (product != null && product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}

