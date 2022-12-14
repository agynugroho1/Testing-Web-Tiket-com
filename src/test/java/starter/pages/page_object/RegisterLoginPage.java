package starter.pages.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import starter.pages.BasePageObject;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegisterLoginPage extends BasePageObject {
    public void inputFieldRegister(String value){
        By element = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]");
        typeOn(element, value);
    }

    public void clickButton(String value){
        By element = By.xpath("//button[contains(text(),\""+value+"\")]");
        clickOn(element);
    }

    public void clickArrow(){
        By element = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]");
        clickOn(element);
    }

    public void clickTitle(String value){
        By element = By.xpath("//*[contains(text(),\""+value+"\")]");
        clickOn(element);
    }

    public void inputFieldFristName(String value){
        By element = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[1]");
        typeOn(element, value);
    }

    public void inputFieldLastName(String value){
        By element = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/input[1]");
        typeOn(element, value);
    }

    public void inputFieldNumberPhone(String value){
        By element = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/div[1]/input[1]");
        typeOn(element, value);
    }

    public void inputFieldPassword(String value){
        By element = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]");
        typeOn(element, value);
    }

    public void inputFieldEmail(String value){
        By element = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]");
        typeOn(element, value);
    }

    public void inputFieldPasswordLogin(String value){
        By element = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]");
        typeOn(element, value);
    }

    public void buatAkun(){
        WebElement elementToClick = getDriver().findElement(By.xpath("//*[text()=\"Buat Akun\"]"));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", elementToClick);
    }

    public void verifyEntryOTPPage(){
        assertTrue(isPresent(By.xpath("//h2[contains(text(),\"Pastikan kepemilikan akun ini\")]")));
    }
}
