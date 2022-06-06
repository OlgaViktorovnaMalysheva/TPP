import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.By.xpath;

public class MusicCheck extends MusicStart {
    private By AllMusic = By.xpath("//*[@id=\"hook_Block_MusicToolbarButton\"]//*[contains(@class,\"toolbar_nav_i_ic\")]");
    private By Song = By.xpath("//*[@class=\"duration\"]//*[contains(@name,\"info\")]");

    @Test
    public void musicCheck() {
        driver.findElement(AllMusic).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         if (driver.findElement(Song).getText().contains("03:31")) {
            System.out.println("песня совпала");
        }
         else {
             System.out.println("песня не совпала");
        }
        }
    }


