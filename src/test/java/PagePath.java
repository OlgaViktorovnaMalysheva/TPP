import org.openqa.selenium.By;

public class PagePath extends Data {
    public By inputEmail = By.xpath("//div[@class = 'it_w']//input[@id='field_email']");
    public By inputPassword = By.xpath("//div[@class = 'it_w']//input[@id='field_password']");
    public By btnComeIn = By.xpath("//div[@class='login-form-actions']//input[@Class='button-pro __wide']");
    public By framePerson = By.xpath("//div[@class='nav-side_i-w']//div[@class='tico ellip']");
    public By    frameLoginWrog =  By.xpath("//div[@class='form_i form_i__error']//div[@class='input-e login_error']");


}
