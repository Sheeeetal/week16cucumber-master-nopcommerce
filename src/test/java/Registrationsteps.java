import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

public class Registrationsteps {
    SoftAssert softAssert = new SoftAssert();


    @Given("^I am on register page$")
    public void iAmOnRegisterPage() {
    }

    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should see register page is displayed$")
    public void iShouldSeeRegisterPageIsDisplayed() {
        Assert.assertEquals("Register", new RegisterPage().getRegisterText(), "Register page not displayed");

    }
    @When("^I click on registration buttonn$")
    public void iClickOnRegistrationButtonn() {
        new RegisterPage().clickOnRegisterButton();
    }


    @And("^I should see First name is required \"([^\"]*)\"$")
    public void iShouldSeeFirstNameIsRequired(String firstName) {
        softAssert.assertEquals("First name is required.",
                new RegisterPage().getValidationErrorMessageForField(firstName),
                "FirstName field error message not displayed");
        softAssert.assertAll();

    }

    @And("^I should see last name is required \"([^\"]*)\"$")
    public void iShouldSeeLastNameIsRequired(String lastName) {
        softAssert.assertEquals("Last name is required.",
                new RegisterPage().getValidationErrorMessageForField(lastName),
                "LastName field error message not displayed");
        softAssert.assertAll();


    }

    @And("^I should see email is required \"([^\"]*)\"$")
    public void iShouldSeeEmailIsRequired(String email) {
        softAssert.assertEquals("Email is required.",
                new RegisterPage().getValidationErrorMessageForField(email),
                "Email field error message not displayed");
        softAssert.assertAll();


    }

    @And("^I should see password is required \"([^\"]*)\"$")
    public void iShouldSeePasswordIsRequired(String password) {
        softAssert.assertEquals("Password is required.",
                new RegisterPage().getValidationErrorMessageForField(password),
                "Password field error message not displayed");
        softAssert.assertAll();


    }

    @Then("^I should see  confirm password is required \"([^\"]*)\"$")
    public void iShouldSeeConfirmPasswordIsRequired(String confirmPassword) {
        softAssert.assertEquals("Password is required.",
                new RegisterPage().getValidationErrorMessageForField(confirmPassword),
                "ConfirmPassword field error message not displayed");
        softAssert.assertAll();


    }

    @And("^I select Gender \"([^\"]*)\"$")
    public void iSelectGender(String gender) {
        new RegisterPage().selectGender(gender);


    }

    @And("^I enter first name  \"([^\"]*)\"$")
    public void iEnterFirstName(String first) {
        new RegisterPage().enterFirstName(first);


    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String last) {
        new RegisterPage().enterLastName(last);


    }

    @And("^I select date of birth \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iSelectDateOfBirth(String day, String month, String year) {
        new RegisterPage().selectDateOfBirth(day, month, year);


    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new RegisterPage().enterEmail(email);


    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String passcode) {
        new RegisterPage().enterPassword(passcode);

    }

    @And("^I enter Confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confrimPasscode) {
        new RegisterPage().enterConfirmPassword(confrimPasscode);

    }

    @And("^I click on registration button$")
    public void iClickOnRegistrationButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("^I should see registration message$")
    public void iShouldSeeRegistrationMessage() {
        Assert.assertEquals("Your registration completed", new RegisterPage().getYourRegCompletedText(),
                "Registration not successful");
    }

    @Then("^I click on continue button$")
    public void iClickOnContinueButton() {
        new RegisterPage().clickOnContinueButton();
    }


}
