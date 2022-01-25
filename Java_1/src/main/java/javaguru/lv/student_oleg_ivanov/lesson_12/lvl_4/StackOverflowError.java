package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_4;

//task 26
public class StackOverflowError {
    public static int sumOfNumbers() {
        int number1 = 0;
        int number2 = 1;
        int result = number1 / number2;
        return result + sumOfNumbers();

    }

    public static void main(String[] args) {
        StackOverflowError.sumOfNumbers();
    }


}


