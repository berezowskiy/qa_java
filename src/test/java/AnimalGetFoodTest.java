import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class AnimalGetFoodTest {

    private final String checkedAnimalKind;
    private final List<String> expected;

    public AnimalGetFoodTest(String checkedAnimalKind, List<String> expected) {
        this.checkedAnimalKind = checkedAnimalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")}
        };
    }

    @Test
    public void shouldBeRightAnimalKind() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(checkedAnimalKind);
        assertEquals(expected, actual);
    }
}
