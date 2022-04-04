import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authorization extends Data {

    private By inputEmail = By.xpath ("//div[@class = 'it_w']//input[@id='field_email']");
    private By inputPassword = By.xpath("//div[@class = 'it_w']//input[@id='field_password']");
    private By btnComeIn = By.xpath("//div[@class='login-form-actions']//input[@Class='button-pro __wide']");

    @Test
    public void authorization() {
        WebDriver driver = new ChromeDriver();
        Data getData = new Data();
        driver.get(getData.getUrl);
        driver.manage().window().maximize();
        driver.findElement(inputEmail).sendKeys(getData.email);
        driver.findElement(inputPassword).sendKeys(getData.password);
        driver.findElement(btnComeIn).click();
        driver.quit();


    }
}






