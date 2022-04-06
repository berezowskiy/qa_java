import com.example.Feline;
import com.example.Lion;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class LionKittensTest {

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
}
