package javaguru.lv.student_oleg_ivanov.lesson_13.lvl_3_4;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Random;

//task 23
@CodeReview(approved = true)
public class GameOfLifeRandomFieldGenerator {
    public boolean[][] generate(int fieldWidth, int fieldHeight) {
        boolean[][] field = new boolean[fieldWidth][fieldHeight];
        Random random = new Random();
        for (int i = 0; i < fieldWidth; i++) {
            for (int j = 0; j < fieldHeight; j++) {
                field[i][j] = random.nextBoolean();
            }
        }
        return field;
    }
}





