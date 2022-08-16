package starter.pages.page_object;

import org.openqa.selenium.By;
import starter.pages.BasePageObject;

public class AirplanePage extends BasePageObject {
    public void clickButton(String value){
        By element = By.xpath("//a[@href=\""+ value +"\"]//div[@class='VerticalIcons_icon__M26iM']");
        clickOn(element);
    }

    public void clickItem(String items){
        By element = By.xpath("//label[contains(text(),\""+items+"\")]");
        clickOn(element);
    }

    public void clickdepartureFrom(String value){
        By element = By.xpath("//input[@placeholder='Kota atau bandara']");
        clickOn(element);
    }

    public void clickdepatureTo(String value){
        By element = By.xpath("//input[@placeholder='Mau ke mana?']");
        clickOn(element);
    }

    public void selectAirport(String value){
        By element = By.xpath("//div[contains(text(),\""+value+"\")]");
        clickOn(element);
    }
}
