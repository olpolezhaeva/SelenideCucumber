package cucumber;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import runner.BaseTest;

import static com.codeborne.selenide.Selenide.*;

public class CreditsTest extends BaseTest {


    @Given("Open {string}")
    public void openHttpKKBank(String url) {
        open("https://kk.bank/");
    }

    @When("Go to Credits item")
    public void goToCreditsItem() {
        $(".navbar_main .link0").click();
        $x("//div[@class='uk-form']//a[@href='/kredity/kredity-chastnym-klientam/']").click();
    }


    @And("Input {string} to Credit summ and {string} to Credit srok fields")
    public void inputToCreditSummField(String summ, String srok) {
//        $x("//input[@id='credit-summ']").scrollTo();
//        //actions().moveToElement( $("input#credit-summ"));
//        $("input#credit-summ").shouldBe(Condition.visible).hover();
        $("input#credit-summ").sendKeys("1000000");
        $("#credit-srok").sendKeys("6");
    }
//    @Then("^user enters \"(.*)\" and \"(.*)\"$")
//    public void user_enters_username_and_password(String username, String password){
//        driver.findElement(By.name("username")).sendKeys(username);
//        driver.findElement(By.name("password")).sendKeys(password);
//    }

    @And("Click on calc button")
    public void clickCalcBtn() {
        $("#calc-btn").click();
    }
    @Then("Header is 'Кредиты частным клиентам'")
    public void assertH1() {
        Assert.assertEquals( $("h1.uk-article-title").getText(), "Кредиты частным клиентам");
    }

    @Then("Cred calc result block should be displayed")
    public void culcResultBlockIsDisplayed() {
        Assert.assertTrue($(".payment-count").shouldBe(Condition.visible).isDisplayed());
        Assert.assertEquals($("#result-pay-size").getText(), "204 018");
        Assert.assertEquals($("#result-overpay-size").getText(), "224 108");
        Assert.assertEquals($("#result-rate1-size").getText(), "8");
    }
}
