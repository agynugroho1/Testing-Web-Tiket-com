package starter.pages.page_object;

import org.openqa.selenium.By;
import starter.pages.BasePageObject;

public class RegisterPage extends BasePageObject {
    public void inputFieldRegister(String value){
        By element = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]");
        typeOn(element, value);
    }
}
