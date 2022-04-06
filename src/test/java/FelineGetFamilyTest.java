import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class FelineGetFamilyTest {

    @Test
    public void shouldBeFeline() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }

}
