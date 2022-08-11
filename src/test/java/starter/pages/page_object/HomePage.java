package starter.pages.page_object;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import starter.pages.BasePageObject;

@DefaultUrl("https://www.tiket.com/")
public class HomePage extends BasePageObject {

    public void clickButtonDaftar(){
        By element = By.xpath("//body[1]/div[1]/main[1]/div[2]/header[1]/div[1]/header[1]/div[1]/div[1]/div[2]/a[4]");
        clickOn(element);
    }
}
