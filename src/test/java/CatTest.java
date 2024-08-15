import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;


public class CatTest {
    private Feline mockFeline;
    private Cat cat;

    @Before
    public void setUp() throws Exception {
        mockFeline = Mockito.mock(Feline.class);
        cat = new Cat(mockFeline);
    }

    @Test
    public void testGetSound() {
        when(mockFeline.getSound()).thenReturn("Мяу");
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetKittens() {
        when(mockFeline.getKittens()).thenReturn(3);
        assertEquals(3, cat.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы"));
        assertEquals(List.of("Животные", "Птицы"), cat.getFood());
    }

    @Test
    public void testLionSex() throws Exception {
        Lion lion = new Lion("Самка", mockFeline);
        assertNotNull(lion);
    }
}
