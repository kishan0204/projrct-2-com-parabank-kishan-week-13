package testsuite;

import com.google.common.base.Verify;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class LoginTest extends Utility {
    String baseurl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        //Enter valid username
        sendTextToElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]"), "kishan_0250");
        //* Enter valid password
        sendTextToElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]"), "Vivek241990");
        //* Click on ‘LOGIN’ button
        Thread.sleep(1500);
        clickONElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]"));
        //* Verify the ‘Accounts Overview’ text is display
        verifyTextFromElements(By.xpath("//h1[contains(text(),'Accounts Overview')]"), "Accounts Overview");
        //

    }

    //2.verifyTheErrorMessage
    @Test
    public void verifyTheErrorMessage() throws InterruptedException {
        sendTextToElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]"), "kishan_0250");
        //* Enter valid password
        sendTextToElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]"), "Vivek2419900");
        //* Click on ‘LOGIN’ button
        Thread.sleep(1500);
        clickONElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]"));
        //* Verify the error message ‘The username and password could not be verified.’
        verifyTextFromElements(By.xpath("//p[contains(text(),'The username and password could not be verified.')]"), "The username and password could not be verified.");
    }
@Test
public void userShouldLogOutSuccessfully() throws InterruptedException {

    //Enter valid username
    sendTextToElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]"), "kishan_0250");
    //* Enter valid password
    sendTextToElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]"), "Vivek241990");
    //* Click on ‘LOGIN’ button
    Thread.sleep(1500);
    clickONElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]"));
//* Click on ‘Log Out’ link
    clickONElement(By.xpath("//a[contains(text(),'Log Out')]"));
    //Verify the text ‘Customer Login’
    verifyTextFromElements(By.xpath("//h2[contains(text(),'Customer Login')]"),"Customer Login");

    }
}
