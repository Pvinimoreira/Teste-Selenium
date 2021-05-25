package pages;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageLogin {

    private ChromeDriver driver;

    @Before
    public  void iniciar() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void logar(){


        driver.get("http://automationpractice.com/index.php");


    }




}
