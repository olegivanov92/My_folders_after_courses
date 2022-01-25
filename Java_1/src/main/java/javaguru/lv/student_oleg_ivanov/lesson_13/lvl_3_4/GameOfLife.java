package javaguru.lv.student_oleg_ivanov.lesson_13.lvl_3_4;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.concurrent.TimeUnit;

@CodeReview(approved = true)
public class GameOfLife {

    private GameOfLifeConsoleUI ui = new GameOfLifeConsoleUI();
    private GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();
    private GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    public static void main(String[] args) {
        GameOfLife game = new GameOfLife();
        game.run();
    }

    public void run() {
        boolean[][] field = generator.generate(10, 10);
        while (true) {
            ui.show(field);
            sleepForSeconds(5);
            field = calculator.calculate(field);
        }
    }

    private void sleepForSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }


}
