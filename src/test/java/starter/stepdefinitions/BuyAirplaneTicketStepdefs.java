package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.pages.page_object.AirplanePage;
import starter.pages.page_object.HomePage;
import starter.pages.page_object.RegisterLoginPage;

public class BuyAirplaneTicketStepdefs {

    AirplanePage airplanePage = new AirplanePage();

    @Given("User already login")
    public void userAlreadyLogin() {
        System.out.println("User Already Login using Background task");
    }

    @And("User Click button {string}")
    public void userClickButton(String value) {
        switch (value.toLowerCase()){
            case "pesawat" :
                airplanePage.clickButton("pesawat");
                break;
            default:
        }
    }

    @Then("User will direct to Airplane page")
    public void userWillDirectToAirplanePage() {
        System.out.println("User on Airplane Page");
    }

    @When("User choose Radio button with text {string}")
    public void userChooseRadioButtonWithText(String arg0) {
        airplanePage.clickItem(arg0);
    }

    @And("User click the airport {string}")
    public void userClickTheAirport(String value) {
        switch (value.toLowerCase()){
            case "dari" :
                airplanePage.clickdepartureFrom("Kota atau bandara");
                break;
            case "ke" :
                airplanePage.clickdepatureTo("Mau ke mana?");
            default:
        }
    }

    @And("On list of airport user select {string}")
    public void onListOfAirportUserSelect(String value) {
        switch (value.toLowerCase()){
            case "jktc" :
                airplanePage.selectAirport(value);
                break;
            case "jogc" :
                airplanePage.selectAirport(value);
            default:
        }
    }

    @And("User click the date on {string}")
    public void userClickTheDateOn(String arg0) {

    }

    @And("User select the date {string}")
    public void userSelectTheDate(String arg0) {

    }

    @And("User click total passenger on {string}")
    public void userClickTotalPassengerOn(String arg0) {
    }

    @And("User click button {string} and plus one adult passenger on passenger")
    public void userClickButtonAndPlusOneAdultPassengerOnPassenger(String arg0) {
    }

    @And("User select {string} on list of cabin class")
    public void userSelectOnListOfCabinClass(String arg0) {
    }

    @Then("User will direct to Detail Penerbangan Page")
    public void userWillDirectToDetailPenerbanganPage() {
    }

    @And("Select one of the available flight list using button {string}")
    public void selectOneOfTheAvailableFlightListUsingButton(String arg0) {
    }

    @Then("User will direct to Detail Pemesanan Page")
    public void userWillDirectToDetailPemesananPage() {
    }


}
