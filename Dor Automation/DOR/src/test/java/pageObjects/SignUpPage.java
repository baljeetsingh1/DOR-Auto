package pageObjects;

import helper.Helper;
import helper.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static helper.Helper.getWebDriver;

public class SignUpPage extends PageObject {
    static By Login = By.xpath("//a[normalize-space()='Login']");
    //By choose_tribunal = By.xpath("");
   static By UserName = By.xpath("//input[@id='usernameid']");
   static By Password = By.xpath("//input[@id='passwordid']");
   static By Cpatch = By.xpath("//input[@id='loginCaptcha']");
   static By Click_Login_Button = By.xpath("//button[normalize-space()='Login']");
//    By mobileNumberField = By.xpath("//input[@name='mobile']");
//    By passwordField = By.xpath("//input[@name='password']");
//    By confirmpasswordFiled = By.xpath("//input[@name='password_confirmation']");
//    By signupButton = By.xpath("//input[@type='button']");
//    By confirmationDialog = By.xpath("//p[contains(text(),'Registered Successfully.')]");

    public static void clickonLogin() {
        element(Login).click();
        wait(5);
    }

    public static void tribunal() {
        WebElement dropdownElement = Helper.getWebDriver().findElement(By.xpath("//select[@id='tribunalId']"));
        Select select = new Select(dropdownElement);
        select.selectByVisibleText("Adjudicating Authority PMLA");

    }
    public static void Login() throws InterruptedException {
        element(UserName).sendKeys("rajveerbaljeet374@gmail.com");
        element(Password).sendKeys("Test@1234");
        System.out.println("Please solve the CAPTCHA manually.");
        TimeUnit.SECONDS.sleep(30); // Give you time to solve the CAPTCHA manually

        // Once CAPTCHA is solved, continue with the automation
        System.out.println("CAPTCHA solved, continuing with automation...");
        element(Click_Login_Button).click();
    }

}



//    public void typeFirstName(String firstName) {
//        element(firstNameField).sendKeys(firstName);
//    }
//
//    public void typemiddleName(String middleName) {
//        element(Password).sendKeys(middleName);
//    }
//
//    public void typelastnameField(String lastname) {
//        element(lastnameField).sendKeys(lastname);
//    }
//
//    public void typeEmail(String email) {
//        List<WebElement> emailfields = getWebDriver().findElements(emailField);
//        emailfields.get(1).sendKeys(email);
//    }
//
//    public void typeMobileNumber(String mobileNumber) {
//        element(mobileNumberField).sendKeys(mobileNumber);
//    }
//
//    public void typePassword(String password) {
//        List<WebElement> passwordFileds = getWebDriver().findElements(passwordField);
//        passwordFileds.get(1).sendKeys(password);
//    }
//
//    public void typeconfirmpassword(String confirmpassword) {
//        element(confirmpasswordFiled).sendKeys(confirmpassword);
//
//    }
//
//    public void clickOnSignUpButton() {
//        List<WebElement> registerButton = getWebDriver().findElements(signupButton);
//        registerButton.get(1).click();
//    }
//
//    public boolean isConfirmationDialog() {
//        return element(confirmationDialog).isDisplayed();
//    }
//
//}
//
