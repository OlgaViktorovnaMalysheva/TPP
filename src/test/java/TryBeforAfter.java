import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class TryBeforAfter extends WebDriverSettings {
    public ChromeDriver driver;

    @Test
    public void wrongautorization()  {
        Data getData = new Data();
        driver.get(getData.getUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(inputEmail).sendKeys(getData.email);
        driver.findElement(inputPassword).sendKeys(getData.wrongpassword);
        driver.findElement(btnComeIn).click();
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
        Assert.assertEquals("technopolisBot2 technopolisBot2",
                driver.findElement(framePerson).getText());
    }
}