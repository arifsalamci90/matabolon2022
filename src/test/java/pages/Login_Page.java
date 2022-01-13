package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

@Data
public class Login_Page {

    public Login_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    private WebElement emailInputBox;

    @FindBy(id = "password")
    private WebElement passwordInputBox;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@class='error-message-container error']")
    private WebElement errorMessage;

}
