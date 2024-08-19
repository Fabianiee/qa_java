import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FelineTest {

    @Test
    public void eatMeatContainsExpectedElements() throws Exception {
        Feline feline = new Feline();

        List<String> actualFoodTypes = feline.eatMeat();
        List<String> expectedFoodTypes = List.of("Животные", "Птицы", "Рыба");

            assertTrue(actualFoodTypes.containsAll(expectedFoodTypes));
    }

    @Test
    public void eatMeatHasCorrectSize() throws Exception {
        Feline feline = new Feline();

        List<String> actualFoodTypes = feline.eatMeat();
        List<String> expectedFoodTypes = List.of("Животные", "Птицы", "Рыба");

            assertEquals(expectedFoodTypes.size(), actualFoodTypes.size());
    }

    @Test
    public void getKittensReturnSameParam() {
        Feline feline = new Feline();

        assertEquals(-1, feline.getKittens(-1));
        assertEquals(1, feline.getKittens(1));
        assertEquals(0, feline.getKittens(0));
    }
}
