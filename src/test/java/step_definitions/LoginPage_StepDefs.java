package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Login_Page;
import utilities.Driver;

public class LoginPage_StepDefs {
    Login_Page login_page = new Login_Page();

    @Given("I am on {string}")
    public void i_am_on(String url) {
        Driver.getDriver().get(url);
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        login_page.getEmailInputBox().clear();
        login_page.getEmailInputBox().sendKeys(username);

        login_page.getPasswordInputBox().clear();
        login_page.getPasswordInputBox().sendKeys(password);
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        login_page.getLoginButton().click();
    }

    @Then("I verify the Error Message contains the text {string}")
    public void i_verify_the_Error_Message_contains_the_text(String expectedErrorMessage) {
        String actualErrorMessage = login_page.getErrorMessage().getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }

}
