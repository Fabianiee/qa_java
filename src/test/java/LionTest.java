import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class LionTest {
    private Predator mockPredator;
    private Lion lion;

    @Before
    public void setUp() throws Exception {
        mockPredator = Mockito.mock(Feline.class);
        lion = new Lion("Самец", (Feline) mockPredator);
    }

    @Test
    public void testDoesHaveMane() {
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testGetKittens() {
        when(mockPredator.getKittens()).thenReturn(3);
        assertEquals(3, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        when(mockPredator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void testLionSex() throws Exception {
        Lion lion = new Lion("Самка", (Feline) mockPredator);
        assertNotNull(lion);
    }
}
