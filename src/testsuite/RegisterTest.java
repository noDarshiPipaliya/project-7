package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class RegisterTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        clickOnElement(By.linkText("Register"));
//        WebElement registerlink = driver.findElement(By.linkText("Register"));
//        registerlink.click();
        String expectedMessage = "Register";
        WebElement actualMessageelement = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals("navigate to page area ", expectedMessage, actualMessage);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {

        clickOnElement(By.linkText("Register"));

        clickOnElement(By.id("gender"));

        clickOnElement(By.id("gender-female"));

        sendTextToElement(By.id("FirstName"), "Devanshi");

        sendTextToElement(By.id("LastName"), "Pipaliya");

        selectByVisibleTextFromDropdown(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]"), "18");

        selectByVisibleTextFromDropdown(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]"), "March");

        selectByVisibleTextFromDropdown(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]"), "1998");

        sendTextToElement(By.id("Email"), "darshil17@gmail.com");

        sendTextToElement(By.id("Password"), "Password!");

        sendTextToElement(By.id("ConfirmPassword"), "Password!");

        clickOnElement(By.xpath("//button[@id='register-button']"));

        String expectedMessage = "Your registration completed";
        WebElement actualMessageelement = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals("navigate to page area ", expectedMessage, actualMessage);


    }


}
