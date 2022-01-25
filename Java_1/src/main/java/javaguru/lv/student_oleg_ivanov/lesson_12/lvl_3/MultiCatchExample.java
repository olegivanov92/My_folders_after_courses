package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_3;

//task 20
public class MultiCatchExample {
    public static void main(String[] args) {
        int number1;
        int number2;
        try {
            number1 = 0;
            number2 = 41 / number1;
            System.out.println(number2);
        } catch (ArithmeticException a) {
            System.out.println("You should not divide a number by zero");
            /* Этот блок будет выполняться только в случае любого арифметического исключения
            встречающиеся в блоке try*/
        } catch (Exception e) {
            System.out.println("Exception happened");
           /* Это общий обработчик исключений, что означает, что он может обрабатывать
            все исключения. Это будет выполнено, если исключение не
            обрабатывается предыдущими блоками catch.*/
        }
    }
}
