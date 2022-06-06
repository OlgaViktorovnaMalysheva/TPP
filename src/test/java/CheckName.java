import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.By.*;

public class CheckName extends CheckNameStart {

    @Test
    public void checkName() {
        driver.findElement(frameFriends).click();
        Assert.assertTrue (driver.findElement(xpath("//*[@id=\"hook_Loader_MyFriendsSquareCardsPagingBLoader\"]//*[contains(@class,\"n-t bold\")]")).
            getText().contains("technopolisBot38 technopolisBot38"));
    }

}


