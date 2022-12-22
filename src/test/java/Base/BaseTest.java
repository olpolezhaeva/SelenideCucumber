package Base;

import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public abstract class BaseTest {
    @BeforeClass
    public static void setup() {
        open("https://kk.bank/");
    }
}
