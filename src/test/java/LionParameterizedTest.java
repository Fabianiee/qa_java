import com.example.Feline;
import com.example.Lion;
import org.hamcrest.MatcherAssert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
    @Mock
    Feline feline;

    private final String sex;
    private final boolean hasMane;

    public LionParameterizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "Class Lion. Sex: {0}")
    public static Object[][] setSexForLion() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeIsCorrect() throws Exception {
        MatcherAssert.assertThat("Lion is the only one that has mane",
                new Lion(this.sex, feline).doesHaveMane(),
                equalTo(hasMane));
    }
}
