import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTestSettings extends PagePath {
    public ChromeDriver driver;
    @Before
    public void open () {
        driver = new ChromeDriver();
        System.out.println("test start");
    }
    @After
    public void close (){
        System.out.println( "test finished");
        driver.quit();
    }
}
