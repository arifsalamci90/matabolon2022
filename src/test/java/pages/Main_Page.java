package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
@Data
public class Main_Page {

    public Main_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "app_logo")
    private WebElement appLogo;

    @FindBy(xpath = "//*[@class='title']")
    private WebElement pageTitle;



}
