package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.pages.page_object.HomePage;
import starter.pages.page_object.RegisterLoginPage;

public class RegisterLoginStepdefs {

    HomePage homePage = new HomePage();
    RegisterLoginPage registerPage = new RegisterLoginPage();

    @Given("User already on home page")
    public void userAlreadyOnHomePage() {
        homePage.open();
    }

    @When("User click {string} menu")
    public void userClickMenu(String menus) {
        switch (menus.toLowerCase()){
            case "daftar" :
                homePage.clickButtonDaftar();
                break;
            case "masuk" :
                homePage.clickButtonDaftar();
                break;
            default:
        }
    }

    @And("User input {string} on field {string}")
    public void userInputOnField(String value, String field) {
        switch (field.toLowerCase()){
            case "register":
                registerPage.inputFieldRegister(value);
                break;
            case "first name":
                registerPage.inputFieldFristName(value);
                break;
            case "last name":
                registerPage.inputFieldLastName(value);
                break;
            case "number phone":
                registerPage.inputFieldNumberPhone(value);
                break;
            case "password":
                registerPage.inputFieldPassword(value);
                break;
            case "email" :
                registerPage.inputFieldEmail(value);
                break;
            case "password login" :
                registerPage.inputFieldPasswordLogin(value);
                break;
            default:
        }
    }

    @And("User click {string} button")
    public void userClickButton(String value) {
        if (value.equalsIgnoreCase("buat akun")){
            registerPage.buatAkun();
        } else {
            registerPage.clickButton(value);
        }
    }

    @And("User choose title {string}")
    public void userChooseTitle(String title) {
        registerPage.clickArrow();
        registerPage.clickTitle(title);
    }

    @Then("Entry OTP page appear")
    public void entryOTPPageAppear() {
        registerPage.verifyEntryOTPPage();
    }
}
