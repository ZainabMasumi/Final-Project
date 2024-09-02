package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.HomePage;
import tek.bdd.utility.SeleniumUtility;

public class HomePageSteps extends SeleniumUtility {
    @Then("validate home page is TEK Insurance APP")
    public void validateTekInsuranceUiIsExist() {
        String actualResult = getElementText(HomePage.HOME_PAGE);
        Assert.assertEquals("TEK Insurance App" , actualResult);
        System.out.println(actualResult);
    }
    @Then("create Primary Account Button is exist")
    public void validateCreatePrimaryAccount() {
        boolean validateCreatePrimaryAccount = isElementEnabled(HomePage.CREATE_PRIMARY_ACCOUNT);
        Assert.assertTrue(validateCreatePrimaryAccount);

    }
}
