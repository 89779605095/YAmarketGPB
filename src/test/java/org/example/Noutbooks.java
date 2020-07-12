package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Noutbooks {

    @FindBy(xpath = "/html/body/div[2]/div[5]/div[3]/div/h1")
    private WebElement selectNouts;

  @FindBy(xpath = "//*[@id=\"7893318_152722\"]")
    private WebElement selectHP;
    public void clickselectHP() {
        selectHP.click(); }

}
