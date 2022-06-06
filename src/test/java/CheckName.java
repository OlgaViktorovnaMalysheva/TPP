import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.By.*;

public class CheckName extends WebDriverSettings {

    @Before
    public void enterData() {
        Data getData = new Data();
        driver.get(getData.getUrl);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(inputEmail).sendKeys(getData.email);
        driver.findElement(inputPassword).sendKeys(getData.password);
        driver.findElement(btnComeIn).click();
    }

    @Test
    public void checkName() {
        driver.findElement(frameFriends).click();
        Assert.assertTrue (driver.findElement(xpath("//*[@id=\"hook_Loader_MyFriendsSquareCardsPagingBLoader\"]//*[contains(@class,\"n-t bold\")]")).
            getText().contains("technopolisBot38 technopolisBot38"));
    }
}


