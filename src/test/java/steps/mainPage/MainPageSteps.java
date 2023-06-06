package steps.mainPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import steps.BaseForSteps;

public class MainPageSteps extends BaseForSteps {

    @Given("I open Demoqa site")
    public void openDemoqaSite() {
        mainPage.openMainPage(BASE_URL);
    }

    @Then("Main page should be opened and 6 cards must be present")
    public void checkOpenedMainPage() {
        Assertions.assertThat(mainPage.getHomeBanner().getSeleniumTrainingRef().isDisplayed()).isTrue();

    }

    @When("I click on {string} card")
    public void clickOnCard(String card) {
        mainPage.getHomeBody().clickOnCard(card);
    }
}
