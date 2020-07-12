package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Market {
    /**
     * метод для поиска кнопки раздела Компьютеры
     */
    @FindBy(xpath = "//*[@class=\"_3Lwc_UVFq4\"]//*[text() = 'Компьютеры']")
    private WebElement selectComp;
    /**
     * метод для осуществления перехода на форму маркета
     */
    public void clickselectComp() {
        selectComp.click(); }



}
