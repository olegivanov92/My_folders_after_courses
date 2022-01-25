package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task_21
@CodeReview(approved = true)
public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] myArray = twoDimensionalArray.createArray(3,3);
        twoDimensionalArray.fillArrayWithRandomNumbers(myArray);
        twoDimensionalArray.sumResult(myArray);



    }
}
