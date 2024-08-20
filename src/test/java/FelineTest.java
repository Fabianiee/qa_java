import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatContainsExpectedElements() throws Exception {
        Feline feline = new Feline();

        List<String> actualFoodTypes = feline.eatMeat();
        String[] expectedFoodTypes = {"Животные", "Птицы", "Рыба"};

        assertArrayEquals(expectedFoodTypes, actualFoodTypes.toArray());
    }
    @Test
    public void eatMeatHasCorrectSize() throws Exception {
        Feline feline = new Feline();

        List<String> actualFoodTypes = feline.eatMeat();
        int expectedSize = 3;

        assertEquals(expectedSize, actualFoodTypes.size());
    }
    @Test
    public void getKittensReturnNegativeOneForNegativeInput() {
        Feline feline = new Feline();

        assertEquals(-1, feline.getKittens(-1));
    }
    @Test
    public void getKittensReturnOneForOneInput() {
        Feline feline = new Feline();

        assertEquals(1, feline.getKittens(1));
    }
    @Test
    public void getKittensReturnZeroForZeroInput() {
        Feline feline = new Feline();

        assertEquals(0, feline.getKittens(0));
    }
}
