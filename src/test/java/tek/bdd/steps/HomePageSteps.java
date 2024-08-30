package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tek.bdd.utility.SeleniumUtility;

public class HomePageSteps extends SeleniumUtility {
    @Given("open browser and navigate to insurance app")
    public void openBrowserAndNavigate() {
        setupBrowser();
    }
    @Then("validate home page is title is (string)")
    public void validateHomePageTitle(String expectedResult) {
        String actualResult = getTitleElement();

    }
}
