package practicalexam.slip21;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

 @FindBy(id = "user-name")
 private WebElement usernameField;

 @FindBy(id = "password")
 private WebElement passwordField;

 @FindBy(id = "login-button")
 private WebElement loginButton;

 public void login(String username, String password) {
     usernameField.sendKeys(username);
     passwordField.sendKeys(password);
     loginButton.click();
 }
}