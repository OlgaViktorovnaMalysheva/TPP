import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckNameStart extends PagePath {
        public ChromeDriver driver;
        @Before
        public void open () {
            driver = new ChromeDriver();
                Data getData = new Data();
                driver.get(getData.getUrl);
                driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                driver.findElement(inputEmail).sendKeys(getData.email);
                driver.findElement(inputPassword).sendKeys(getData.password);
                driver.findElement(btnComeIn).click();
            System.out.println("test start");
        }
        @After
        public void close (){
            System.out.println( "test finished");
            driver.quit();
        }
    }
