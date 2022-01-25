package student_oleg_ivanov.lesson_13.lvl_3_4;

import javaguru.lv.student_oleg_ivanov.lesson_13.lvl_3_4.GameOfLifeNextGenerationCalculator;
import javaguru.lv.teacher.annotations.CodeReview;
import org.junit.Test;

import static org.junit.Assert.*;

@CodeReview(approved = true)
public class GameOfLifeNextGenerationCalculatorTest {

    //task 11
    @Test
    public void numberOfNeighbors() {
        GameOfLifeNextGenerationCalculator game = new GameOfLifeNextGenerationCalculator();
        int result = game.numberOfNeighbors(new boolean[][]{{false, true, false},
                                                            {true, true, false},
                                                            {false, true, false}}, 1, 1);
        assertEquals(3, result);
    }

    //Правило 1:
//Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.

    @Test
    public void rule1() {
        GameOfLifeNextGenerationCalculator game = new GameOfLifeNextGenerationCalculator();
        boolean result = game.rules(1, true);
        assertFalse(result);

    }

    //    Правило 2:
//    Любая живая клетка с больше чем тремя живыми соседями умирает в следующем поколении.

    @Test
    public void rule2() {
        GameOfLifeNextGenerationCalculator game = new GameOfLifeNextGenerationCalculator();
        boolean result = game.rules(4, true);
        assertFalse(result);
    }

    //    Правило 3:
//    Любая живая клетка с двумя или тремя живыми соседями остаётся живой в следующем поколении.

    @Test
    public void rule3() {
        GameOfLifeNextGenerationCalculator game = new GameOfLifeNextGenerationCalculator();
        boolean result = game.rules(2, true);
        assertTrue(result);

    }

    //        Правило 3:
//        Любая живая клетка с двумя или тремя живыми соседями остаётся живой в следующем поколении.

    @Test
    public void rule3_v2() {
        GameOfLifeNextGenerationCalculator game = new GameOfLifeNextGenerationCalculator();
        boolean result = game.rules(3, true);
        assertTrue(result);

    }

    //Правило 4:
    //Любая мёртвая клетка с тремя живыми соседями становится живой в следующем поколении.

    @Test
    public void rule4() {
        GameOfLifeNextGenerationCalculator game = new GameOfLifeNextGenerationCalculator();
        boolean result = game.rules(3, false);
        assertTrue(result);

    }
}