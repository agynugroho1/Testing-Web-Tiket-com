package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.page_object.HomePage;
import starter.pages.page_object.RegisterPage;

public class RegisterStepdefs {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

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
}
