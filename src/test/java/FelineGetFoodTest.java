import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class FelineGetFoodTest {

    @Test
    public void shouldBePredatorMeal() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }
}
