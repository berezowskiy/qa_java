import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import  org.junit.experimental.runners.Enclosed;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class PerameterizedTest {


    @RunWith(Parameterized.class)
    public static class AnimalKindTest {

        private final String checkedAnimalKind;
        private final List<String> expected;

        public AnimalKindTest(String checkedAnimalKind, List<String> expected) {
            this.checkedAnimalKind = checkedAnimalKind;
            this.expected = expected;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
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

    @RunWith(Parameterized.class)
    public static class FelineGetKittensTest {

        private final int kittenCount;
        private final int expected;

        public FelineGetKittensTest(int kittenCount, int expected) {
            this.kittenCount = kittenCount;
            this.expected = expected;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][] {
                    {1, 1},
                    {3, 3},
                    {-1, -1},
            };
        }

        @Test
        public void shouldReturnKitten() {
            Feline feline = new Feline();
            int actual = feline.getKittens(kittenCount);
            assertEquals(expected, actual);
        }
    }
}
