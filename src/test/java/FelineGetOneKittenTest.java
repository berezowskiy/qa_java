import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineGetOneKittenTest {

    @Test
    public void shouldBeOneKitten() throws Exception {
        Feline feline = new Feline();
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }
}
