import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.lenient;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;
    @Test
    public void getKittensReturnCorrectValue() throws Exception {
                lenient().when(feline.getKittens()).thenReturn(1);

        Lion lion = new Lion("Самец", feline);
             int actualAmountOfKittens = lion.getKittens();
             assertEquals(1, actualAmountOfKittens);
    }

    @Test
    public void doesHaveManeShouldReturnTrueForMaleLion() throws Exception {
        Lion lion = new Lion("Самец", feline);

        boolean actualResult = lion.doesHaveMane();

        assertTrue(actualResult);
    }

    @Test
    public void doesHaveManeShouldReturnFalseForFemaleLion() throws Exception {
        Lion lion = new Lion("Самка", feline);

        boolean actualResult = lion.doesHaveMane();

        assertFalse(actualResult);
    }

    @Test(expected = Exception.class)
    public void lionConstructorShouldThrowExceptionForInvalidGender() throws Exception {
        new Lion("Тест", feline);
    }

    @Test
    public void getFoodTest() throws Exception {
                List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        lenient().when(feline.getFood("Хищник")).thenReturn(expectedList);

        Lion lion = new Lion("Самка", feline);

        List<String> actualList = lion.getFood();

        assertEquals(expectedList, actualList);
    }

}
