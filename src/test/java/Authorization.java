import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Authorization extends PagePath {
    public ChromeDriver driver;

    @Before
            public void setup () {
        driver = new ChromeDriver();
        System.out.println("test start");

    }
    @Test
    public void authorization1() {
        Data getData = new Data();
        driver.get(getData.getUrl);
        driver.manage().window().maximize();
        driver.findElement(inputEmail).sendKeys(getData.email);
        driver.findElement(inputPassword).sendKeys(getData.password);
        driver.findElement(btnComeIn).click();
    }

    @Test
    public void authorization2() {
        Data getData = new Data();
        driver.get(getData.getUrl);
        driver.manage().window().maximize();
        driver.findElement(inputEmail).sendKeys(getData.email);
        driver.findElement(inputPassword).sendKeys(getData.password);
        driver.findElement(btnComeIn).click();

    }
    @After
    public void close (){
        System.out.println( "test finished");
        driver.quit();
    }
}