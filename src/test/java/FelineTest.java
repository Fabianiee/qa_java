import com.example.Feline;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {
    private Feline feline = new Feline();

    @Test
    public void testGetKittens() {
        assertEquals(3, feline.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
}

