package stepDefination;

import helper.Constants;
import helper.Helper;
import org.junit.After;
import org.junit.Test;
import pageObjects.SignUpPage;

public class LoginPage {

    // This method should be public so JUnit can access it
    @Test
    public void openHomePage() throws InterruptedException {
        // Assuming Helper is a class with the openBrowser method and Constants has LoginUrl defined
        Helper.openBrowser(Constants.LoginUrl);

        SignUpPage.clickonLogin();
        SignUpPage.tribunal();
        SignUpPage.Login();
    }

    @After
    public void OpenwithwrongCrentials() throws InterruptedException {
        Helper.openBrowser(Constants.LoginUrl);

        SignUpPage.clickonLogin();
        SignUpPage.tribunal();
        SignUpPage.Login();

    }

//    public void OpenwithInvalidCredentials() {
//        String username = "rajveerbaljeet374@gmail.com"; // example invalid username
//        String password = "Test@1234"; // example invalid password
//
//        Helper.openBrowser(Constants.LoginUrl);
//        SignUpPage.clickonLogin();
//        SignUpPage.tribunal();
//        SignUpPage.LoginWithCredentials(username, password);
//    }

    @After
    public void OpenwithwronPasword() throws InterruptedException {
        Helper.openBrowser(Constants.LoginUrl);

        SignUpPage.clickonLogin();
        SignUpPage.tribunal();
        SignUpPage.Login();

    }

    @After
    public void OpenwithwrongUsrname() throws InterruptedException {
        Helper.openBrowser(Constants.LoginUrl);

        SignUpPage.clickonLogin();
        SignUpPage.tribunal();
        SignUpPage.Login();

    }



}