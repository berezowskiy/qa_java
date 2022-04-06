import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensTest {

    private final int kittenCount;
    private final int expected;

    public FelineGetKittensTest(int kittenCount, int expected) {
        this.kittenCount = kittenCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {1, 1},
                {3, 3},
                {-1, -1},
        };
    }

    @Test
    public void shouldReturnKitten() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittenCount);
        assertEquals(expected, actual);
    }
}
