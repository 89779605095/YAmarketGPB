package org.example;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Komputers {

    /**
     * метод для поиска кнопки раздела Ноутбуки
     */

    @FindBy(xpath = "//*[text() = 'Ноутбуки']")
    private WebElement selectNouts;


    /**
     * метод для выбюора раздела Ноутбуки
     */
    public void clickselectNouts() {
        selectNouts.click(); }

    /**
     * метод для поиска кнопки раздела Планшеты
     */
    @FindBy(xpath = "//*[text() = 'Планшеты']")
    private WebElement selectPlanshet;



    /**
     * метод для поиска кнопки раздела Планшета
     */

    public void clickselectPlanshet() {
        selectPlanshet.click(); }







}
