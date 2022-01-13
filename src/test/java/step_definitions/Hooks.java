package step_definitions;



import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utilities.Driver;

public class Hooks {

    @After
    public void tearDown(Scenario scenario) {

        Driver.quitDriver();
    }




}
