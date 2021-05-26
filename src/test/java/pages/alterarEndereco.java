package pages;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alterarEndereco {


        private ChromeDriver driver;

        @Before
        public void iniciar() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
            driver = new ChromeDriver();

            driver.get("http://automationpractice.com/index.php");
            driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
            driver.findElement(By.id("email")).sendKeys("abc@abc.com.br");
            driver.findElement(By.id("passwd")).sendKeys(("123456"));
            driver.findElement(By.id("SubmitLogin")).click();
        }

        @Test
        public void alterarEndereco() {

            driver.findElement(By.cssSelector("a[title='Addresses'] span")).click();
            driver.findElement(By.cssSelector("a[title='Update'] span")).click();
            driver.findElement(By.id("firstname")).clear();
            driver.findElement(By.id("firstname")).sendKeys("joao");
            driver.findElement(By.id("lastname")).clear();
            driver.findElement(By.id("lastname")).sendKeys("pedro");
            driver.findElement(By.id("address1")).clear();
            driver.findElement(By.id("address1")).sendKeys("Av abc");
            driver.findElement(By.id("address2")).clear();
            driver.findElement(By.id("address2")).sendKeys("bairro abc");
            driver.findElement(By.id("city")).clear();
            driver.findElement(By.id("city")).sendKeys("udia");
            driver.findElement(By.id("id_state")).sendKeys("Hawaii");
            driver.findElement(By.id("postcode")).clear();
            driver.findElement(By.id("postcode")).sendKeys("83445");
            driver.findElement(By.id("submitAddress")).click();
            WebElement validar = driver.findElement(By.cssSelector("#center_column > div.addresses > p"));
            Assert.assertEquals("Your addresses are listed below.", validar.getText());
        }

        @After
        public void afterCaso() {
            driver.quit();
        }
    }

