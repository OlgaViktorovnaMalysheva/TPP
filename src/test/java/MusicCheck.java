import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.By.xpath;

public class MusicCheck extends MusicStart {
    private By AllMusic = By.xpath("//*[@id=\"hook_Block_MusicToolbarButton\"]//*[contains(@class,\"toolbar_nav_i_ic\")]");
    private By Song = By.xpath("//*[contains(@data-l,\"t,top_tracks_list\")]"
            + "/slot/top-tracks-list/wm-tracks-list/main/wm-track[position() <= 1]");

    @Test
    public void musicCheck() {
        driver.findElement(AllMusic).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         if (driver.findElement(Song).getText().contains("03:31")) {
            System.out.println("song wright");
        }
         else {
             System.out.println("song wrong");
        }
        }
    }


