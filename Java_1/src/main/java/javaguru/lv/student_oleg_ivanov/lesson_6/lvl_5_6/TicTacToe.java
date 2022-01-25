package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_5_6;
//task_22-30


import javaguru.lv.teacher.annotations.CodeReview;
import javaguru.lv.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Код не похож на Java код =) Пропишите фигурные скобки везде, где нужно")
public class TicTacToe {


    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++)
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) &&
                    (field[i][2] == playerToCheck))
                return true;

        return false;

    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++)
            if ((field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) &&
                    (field[2][i] == playerToCheck))
                return true;

        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++)
            if ((field[0][0] == playerToCheck) && (field[1][1] == playerToCheck) &&
                    (field[2][2] == playerToCheck) || (field[2][0] == playerToCheck) && (field[1][1] == playerToCheck) &&
                    (field[0][2] == playerToCheck))
                return true;

        return false;
    }


    public boolean isWinPosition(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (isWinPositionForDiagonals(field, playerToCheck) ||
                    isWinPositionForVerticals(field, playerToCheck) ||
                    isWinPositionForHorizontals(field, playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                    return false;
                }
            }
        }
        return true;

    }


    public int[][] createField() {
        int[][] arr = new int[3][3];
        int empty = -1;

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = empty;

            }
        return arr;
    }


    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Coordinates: ");
        int rowOne = scanner.nextInt();
        int columnTwo = scanner.nextInt();
        Move move = new Move(rowOne, columnTwo);
        return move;

    }

    public void printFieldToConsole(int[][] field) {
        System.out.println("Let's Play:");
        for (int i = 0; i < field.length; i++) {
            System.out.println();
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " | ");

            }
        }
        System.out.println();
    }


    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;

            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}





