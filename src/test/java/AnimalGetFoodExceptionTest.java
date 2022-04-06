import com.example.Animal;
import org.junit.Test;

public class AnimalGetFoodExceptionTest {

    @Test(expected = Exception.class)
    public void shouldBeException() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Муравей");
    }
}
