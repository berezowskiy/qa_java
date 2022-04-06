import com.example.Lion;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionConstructorExceptionTest {

    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void shouldBeException() throws Exception {
        Lion lion = new Lion(feline, "Самка богомола");
    }
}

