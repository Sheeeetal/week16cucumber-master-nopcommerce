import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Loginsteps {
    @Given("^I am On login Page$")
    public void iAmOnLoginPage() {
    }

    @When("^I click On login Link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^Welcome Message displayed$")
    public void welcomeMessageDisplayed() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }


    @Then("^I should see error message displayed$")
    public void iShouldSeeErrorMessageDisplayed() {
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = new LoginPage().getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
    }

    @Then("^I should  see Logout link displayed$")
    public void iShouldSeeLogoutLinkDisplayed() {
        Assert.assertTrue(new HomePage().isLogOutLinkDisplay(), "Logout link is not displayed");


    }

    @And("^I click On logout link$")
    public void iClickOnLogoutLink() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^i should see login link is displayed$")
    public void iShouldSeeLoginLinkIsDisplayed() {
        Assert.assertTrue(new HomePage().isLogInLinkDisplay(), "Login link is not displayed");

    }
}