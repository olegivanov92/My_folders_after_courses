package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_5_6;
//task_22
//task_23
//task_24
//task_25
//task_26
//task_27

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.chekHorizontal();
        test.chekVertical();
        test.chekDiagonals();
        test.chekWinPosition();
        test.chekIsDrawPosition();
        test.chekCreateAndFill();

    }

    public void chekHorizontal() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] myArray = {{0, 0, 1},
                {1, 0, 0},
                {1, 1, 1}};
        boolean result = ticTacToe.isWinPositionForHorizontals(myArray, 1);
        if (result)
            System.out.println("Win position Horizontal = true" + Arrays.deepToString(myArray));
        else
            System.out.println("Position Horizontal Fail");

    }

    public void chekVertical() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] myArray = {{1, -1, 1},
                {1, 0, 0},
                {1, -1, 1}};
        boolean result = ticTacToe.isWinPositionForVerticals(myArray, 1);
        if (result)
            System.out.println("Win position vertical = true" + Arrays.deepToString(myArray));
        else
            System.out.println("Position Vertical = Fail");
    }

    public void chekDiagonals() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] myArray = {{1, -1, 1},
                {0, 1, 1},
                {0, -1, 1}};
        boolean result = ticTacToe.isWinPositionForDiagonals(myArray, 1);
        if (result)
            System.out.println("Win position Diagonals = true" + Arrays.deepToString(myArray));
        else
            System.out.println("Position Diagonals = Fail");
    }

    public void chekWinPosition() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] myArray = {{0, -1, 1},
                {1, 1, 0},
                {1, -1, 1}};
        boolean result = ticTacToe.isWinPosition(myArray, 1);
        if (result)
            System.out.println("Win position = true" + Arrays.deepToString(myArray));
        else
            System.out.println("Win position = Fail");
    }

    public void chekIsDrawPosition() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] myArray = {{0, 1, 1},
                {1, 1, 0},
                {0, 1, 0}};
        boolean result = ticTacToe.isDrawPosition(myArray);
        if (result)
            System.out.println("ChekIsDrawPosition = true" + Arrays.deepToString(myArray));
        else
            System.out.println("ChekIsDrawPosition = Fail");

    }



    public void chekCreateAndFill() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] result = ticTacToe.createField();
        System.out.println("Creating Arrays = " + Arrays.deepToString(result));
    }
}
