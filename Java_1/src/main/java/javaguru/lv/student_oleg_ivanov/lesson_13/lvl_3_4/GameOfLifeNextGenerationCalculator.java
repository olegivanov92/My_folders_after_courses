package javaguru.lv.student_oleg_ivanov.lesson_13.lvl_3_4;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Arrays;

//task
@CodeReview(approved = true)
public class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] nextGeneration = copyGeneration(currentGeneration);

        for (int row = 0; row < currentGeneration.length; ++row) {
            for (int col = 0; col < currentGeneration.length; ++col) {
                int numNeighbors = numberOfNeighbors(currentGeneration, row, col);
                if (currentGeneration[row][col] && (numNeighbors < 2) || numNeighbors > 3) {
                    nextGeneration[row][col] = false;
                }
                if (currentGeneration[row][col] && numNeighbors == 2 || numNeighbors == 3) {
                    nextGeneration[row][col] = true;
                }
                if (!currentGeneration[row][col] && numNeighbors == 3) {
                    nextGeneration[row][col] = true;
                }
            }
        }

        return nextGeneration;
    }

    //for test
   public boolean rules(int numberOfNeighbors, boolean alive) {
        alive = true;
        if (numberOfNeighbors < 2 || numberOfNeighbors > 3) {
            return false;
        }
        if (numberOfNeighbors == 2) {
            return true;
        } else if (numberOfNeighbors == 3) {
            return true;
        }
        if (!alive && numberOfNeighbors == 3) {
            return true;
        }
        return false;
    }


    //task 12
    public int numberOfNeighbors(boolean[][] generation, int row, int col) {

        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            if (i >= 0 && i < generation.length)
                for (int j = col - 1; j <= col + 1; j++)
                    if (j >= 0 && j < generation[i].length)
                        if (i != row || j != col)
                            if (generation[i][j])
                                count++;
        }

        return count;
    }


    private boolean[][] copyGeneration(boolean[][] currentGeneration) {
        boolean[][] newGeneration = new boolean[currentGeneration.length][];
        for (int row = 0; row < currentGeneration.length; ++row) {
            newGeneration[row] = Arrays.copyOf(currentGeneration[row], currentGeneration[row].length);
        }
        return newGeneration;
    }
}
