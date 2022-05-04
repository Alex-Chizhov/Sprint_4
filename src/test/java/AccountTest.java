import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
@DisplayName("Проверка коррекности имени для печати на банковской карте")
public class AccountTest {

    private final String name;
    private final boolean expected;

    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters(name="{index}. Test data: {0} | Expected: {1}")
    public static Object[][] getNameData() {
        return new Object[][] {
                { "Тимоти Шаламе", true},
                { "Ти", false},
                { "Тим", false},
                { "Тима", false},
                { "йцукенгшщ зфывапро", true},
                { "Йцукенгшщзфывапролдя", false},
                { "йцукенгшщзхфывапрол", false},
                { "Тимоти  Шаламе", false},
                { " ТимотиШаламе", false},
                { "ТимотиШаламе ", false},
                { " ТимотиШаламе ", false},
        };
    }

    @Test
    @DisplayName("Проверка корректности имени")
    public void checkCorrectNameTest() {
        Account acc = new Account(name);
        assertEquals(expected, acc.checkNameToEmboss());
    }

}
