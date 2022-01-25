package student_oleg_ivanov.lesson_11.lvl_2_6.UiAction;

import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.UiAction.SaveBookUIAction;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class SaveBookUIActionTest {

    SaveBookUIAction action;
    BookDatabaseMock mock = new BookDatabaseMock();

    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Before
    public void setUp() {
        action = new SaveBookUIAction(mock);
    }

    @Test
    public void execute() throws IOException {
        systemInMock.provideLines("ABC", "CBD");
        action.execute();
        assertTrue(mock.isSaveTriggered());
    }
}