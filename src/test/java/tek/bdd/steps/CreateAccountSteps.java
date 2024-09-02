package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.CreateAccountPage;
import tek.bdd.utility.SeleniumUtility;

public class CreateAccountSteps extends SeleniumUtility {
   @When("click on Create Primary account link")
    public void clickOnCreatePrimaryAccount() {
       clickOnElement(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_LINK);
    }
    @When("user fill the create new account form")
    public void userFillTheCreateNewAccountForm (DataTable dataTable) {
       MapString createPrimaryAccountHolder = getElementText(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_HOLDER);
       Assert.assertEquals("Create Primary Account Holder", createPrimaryAccountHolder);
    }

}
