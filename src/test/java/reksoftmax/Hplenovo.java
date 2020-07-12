package reksoftmax;

import org.example.ConfProperties;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hplenovo {


    @BeforeClass
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //создание экземпляра драйвера
        WebDriver driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("page"));
        driver.findElement(By.xpath("//a[text() = 'Маркет']")).click();


    }

    @Test

    //Выбрать раздел Ноутбуки
    public void clickselectNouts() {
        selectNouts.click(); }
    //
    //6. Проверить что на странице заголовок содержит текст «Ноутбуки»
    //

    //7. Выбрать фильтр по производителям HP и Lenovo
    //
    //8. Выбрать опцию «Показывать по 12» внизу страницы
    //
    //9. Проверить, что элементов на странице 12.
    //
    //10. Запомнить первый элемент в списке.
    //
    //11. В поисковую строку ввести запомненное значение.
    //
    //12. Нажать «Найти»
    //
    //13. Проверить, что наименование и сумма товара соответствует запомненному значению.
//










    @AfterClass
    public static void tearDown() {
        WebDriver.quit();
    }
}





}























