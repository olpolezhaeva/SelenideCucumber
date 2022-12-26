package runner;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public abstract class BaseTest {

    @BeforeClass
    public static void setup() {
        Configuration.browser = "Chrome";
        open("https://kk.bank/");
    }
}
