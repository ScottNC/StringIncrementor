import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class KataTest {

    private static void doTest(String str, String expected) {
        String actual = assertDoesNotThrow(() -> Kata.incrementString(str), "Solution thrown an unexpected exception for str=\"" + str + "\"\n\n");
        assertEquals(expected, actual, "Incorrect answer for str=\"" + str + "\"\n\n");
    }

    @Test
    public void incrementString() {
        doTest("foo", "foo1");
        doTest("foo1", "foo2");
    }
}