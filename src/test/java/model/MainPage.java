package model;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import runner.BasePage;

public class MainPage extends BasePage {


    @FindBy (how = How.ID, using = "menu-element-slider-0")
    private SelenideElement inputField;

}
