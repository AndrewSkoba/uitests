package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {

    @FindBy(id = "item-1")
    private WebElement checkBoxBtn;

    @FindBy(id = "item-2")
    private WebElement radioBtn;

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    public String getCheckBoxText() {
        return checkBoxBtn.getText();
    }

    public String getRadioBtnText() {
        return radioBtn.getText();
    }
}
