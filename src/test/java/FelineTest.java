import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();

        List<String> actualFoodTypes = feline.eatMeat();

        assertEquals("Животные", actualFoodTypes.get(0));
        assertEquals("Птицы", actualFoodTypes.get(1));
        assertEquals("Рыба", actualFoodTypes.get(2));
    }

    @Test
    public void getKittensReturnSameParam() {
        Feline feline = new Feline();

        assertEquals(-1, feline.getKittens(-1));
        assertEquals(1, feline.getKittens(1));
        assertEquals(0, feline.getKittens(0));
    }
}

