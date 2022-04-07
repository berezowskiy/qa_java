import com.example.Feline;
import com.example.Lion;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void shouldReturnLionKittens() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        Mockito.when(feline.getKittens()).thenReturn(2);
        int expected = 2;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMane() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        boolean actual = lion.doesHaveMane();
        Assert.assertTrue(actual);
    }

    @Test
    public void shouldNotReturnMane() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        boolean actual = lion.doesHaveMane();
        Assert.assertFalse(actual);
    }

    @Test
    public void shouldReturnFoodForPredator() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void shouldBeException() throws Exception {
        Lion lion = new Lion(feline, "Самка богомола");
    }

}
