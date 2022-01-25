package javaguru.lv.student_oleg_ivanov.lesson_13.lvl_3_4;


import javaguru.lv.teacher.annotations.CodeReview;

//task 20
@CodeReview(approved = true)
public class GameOfLifeConsoleUI {
    public void show(boolean[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (!field[i][j])
                    System.out.print(".");

                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}

