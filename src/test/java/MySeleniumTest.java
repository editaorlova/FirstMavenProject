import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MySeleniumTest {

    @Test
    public void testFirst(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));

        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        Assert.assertEquals(message.getText(), "Received!");

        driver.quit();
    }

    @Test
    public void testGoogle() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        WebElement textInput = driver.findElement(By.id("#APjFqb"));
        textInput.sendKeys("selenium");

        WebElement aiButton = driver.findElement(By.xpath("//button[@jsname='B6rgad']"));
        aiButton.click();

        WebElement text = driver.findElement(By.xpath("//div[@jsuid='r629cf_7t']"));
        Assert.assertEquals(text.getText(),"Основные компоненты");

        driver.quit();


    }

    @Test
    public void test() {
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.wikipedia.org/");
    driver.findElement(By.id("searchInput")).sendKeys("Selenium");
    driver.findElement(By.xpath("//button[@type='submit']")).click();

    WebElement text = driver.findElement(By.xpath("//h1/span"));

    Assert.assertEquals(text.getText(),"Selenium");

    driver.quit();
    }

    @Test
    public void testOnliner() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.onliner.by/");
        WebElement button = driver.findElement(By.cssSelector(".auth-bar__item--text"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        button.click();

        WebElement text = driver.findElement(By.cssSelector(".auth-form__title.auth-form__title_big.auth-form__title_condensed-default"));
        Assert.assertEquals(text.getText(),"Вход");

        driver.quit();
    }

    @Test
    public void TestOnlinerCart() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.onliner.by/");
        WebElement button = driver.findElement(By.cssSelector("a[title='Корзина']"));
        button.click();

        WebElement title = driver.findElement(By.cssSelector("div.cart-form__title"));

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.cart-form__title")));

        Assert.assertEquals(title.getText(),"Корзина");
        driver.quit();
    }
}
