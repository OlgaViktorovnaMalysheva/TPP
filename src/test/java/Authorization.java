import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Authorization extends PagePath {
    public ChromeDriver driver;

    @Before
            public void open () {
driver = new ChromeDriver();
        System.out.println("test start");
    }

    @Test
    public void wrongautorization() {
        Data getData = new Data();
        driver.get(getData.getUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(inputEmail).sendKeys(getData.email);
        driver.findElement(inputPassword).sendKeys(getData.wrongpassword);
        driver.findElement(btnComeIn).click();
        Assert.assertEquals(  "Неправильно указан логин и/или пароль",
                driver.findElement(frameLoginWrog).getText());
    }
    @Test
    public void authorization() {
        Data getData = new Data();
        driver.get(getData.getUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(inputEmail).sendKeys(getData.email);
        driver.findElement(inputPassword).sendKeys(getData.password);
        driver.findElement(btnComeIn).click();
        Assert.assertEquals(  "technopolisBot2 technopolisBot2",
                driver.findElement(framePerson).getText());

    }

    @After
    public void close (){
        System.out.println( "test finished");
        driver.quit();
    }
}