import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;


public class MainTestRight extends MainTestSettings {


    @Test
    public void authorization() {
        Data getData = new Data();
        driver.get(getData.getUrl);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(inputEmail).sendKeys(getData.email);
        driver.findElement(inputPassword).sendKeys(getData.password);
        driver.findElement(btnComeIn).click();
        Assert.assertEquals("technopolisBot2 technopolisBot2",
                driver.findElement(framePerson).getText());
    }
}