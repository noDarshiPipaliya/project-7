package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {

        clickOnElement(By.linkText("Log in"));

        // this is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        //find welcome text and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);

        //validate actual and expected message
        Assert.assertEquals("not navigate to login page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        clickOnElement(By.linkText("Log in"));

        sendTextToElement(By.name("Email"), "devanshi17@gmail.com");
        sendTextToElement(By.name("Password"), "password!");

        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        String expectedMessage = "Log out";
        WebElement actualMessageelement = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals("navigate to page area ", expectedMessage, actualMessage);
    }

    @Test
    public void verifyTheErrorMessage() {
//        WebElement loginlink = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
//        loginlink.click();

        clickOnElement(By.linkText("Log in"));


//        WebElement emailfiels = driver.findElement(By.id("Email"));
//        emailfiels.sendKeys("prime123@gmail.com");
//        WebElement passwordfiels = driver.findElement(By.id("Password"));
//        passwordfiels.sendKeys("Prime123");

        sendTextToElement(By.name("Email"), "devanshipatel@gmail.com");
        sendTextToElement(By.name("Password"), "password!");

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        WebElement actualMessageelement = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals(" not able navigate to page area ", expectedMessage, actualMessage);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }


}
