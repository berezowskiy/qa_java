import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.Cat;

public class CatGetSoundTest {

    @Test
    public void shouldMeow() {
        Cat cat = new Cat(new Feline());
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }
}
