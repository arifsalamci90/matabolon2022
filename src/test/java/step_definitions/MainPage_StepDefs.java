package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Main_Page;

public class MainPage_StepDefs {

    Main_Page main_page = new Main_Page();

    @Then("I verify that sauce demo main page is opened")
    public void i_verify_that_sauce_demo_main_page_is_opened() {
        String pageTitle = main_page.getPageTitle().getText();
        Assert.assertEquals("PRODUCTS", pageTitle);
    }

    @Then("I verify the app logo exists on main page")
    public void i_verify_the_app_logo_exists_on_main_page() {
        Assert.assertTrue(main_page.getAppLogo().isDisplayed());
    }

}
