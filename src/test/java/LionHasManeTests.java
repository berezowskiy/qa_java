import com.example.Lion;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionHasManeTests {

    @Mock
    Feline feline;

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

}
