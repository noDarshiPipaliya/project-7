package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class TopMenuTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        clickOnElement(By.linkText("Computers"));

        String expectedMessage = "Computers";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals("navigate to computer area ", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        clickOnElement(By.linkText("Electronics"));

        String expectedMessage = "Electronics";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage = actualMessageelement.getText();

        Assert.assertEquals(" navigate to electornic tab", expectedMessage, actualMessage);


    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        clickOnElement(By.linkText("Apparel"));

        String expectedMessage = "Apparel";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals(" navigate to apparel tab", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        clickOnElement(By.linkText("Digital downloads"));

        String expectedMessage = "Digital downloads";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals(" navigate to digital downloads tab", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        clickOnElement(By.linkText("Books"));

        String expectedMessage = "Books";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals(" navigate to books tab", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {

        clickOnElement(By.linkText("Jewelry"));

        String expectedMessage = "Jewelry";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals(" navigate to jewelry tab", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {

        clickOnElement(By.linkText("Gift Cards"));

        String expectedMessage = "Gift Cards";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals(" navigate to gift cards tab", expectedMessage, actualMessage);
    }


}
