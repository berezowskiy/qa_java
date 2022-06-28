import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.Cat;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void shouldMeow() {
        Cat cat = new Cat(new Feline());
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetFelineFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> felineMeals = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(felineMeals);
        List<String> expected = felineMeals;
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }
}
