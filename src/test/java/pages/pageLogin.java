package pages;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageLogin {

    private ChromeDriver driver;

    @Before
    public void iniciar() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void logar() {

        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
        driver.findElement(By.id("email")).sendKeys("abc@abc.com.br");
        driver.findElement(By.id("passwd")).sendKeys(("123456"));
        driver.findElement(By.id("SubmitLogin")).click();
        WebElement validar = driver.findElement(By.cssSelector("a[title='Addresses'] span"));
        Assert.assertEquals("MY ADDRESSES", validar.getText());
    }

    @After
    public void afterCaso() {

            driver.quit();
        }
    }
