package runner;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public abstract class BasePage {

    @BeforeClass
    public static void setup() {
        Configuration.browser = "chrome";

        open("https://kk.bank/");
    }
}
