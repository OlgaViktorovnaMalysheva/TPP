import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;


public class MainTestWrong extends MainTestSettings {

    @Test
    public void wrongAutorization()  {
        Data getData = new Data();
        this.driver.get(getData.getUrl);
        this.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
        this.driver.findElement(inputEmail).sendKeys(getData.email);
        this.driver.findElement(inputPassword).sendKeys(getData.wrongpassword);
        this.driver.findElement(btnComeIn).click();
        Assert.assertEquals(  "Неправильно указан логин и/или пароль",
                driver.findElement(frameLoginWrog).getText());
    }

}