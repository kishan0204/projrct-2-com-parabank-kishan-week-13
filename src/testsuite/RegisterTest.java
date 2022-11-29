package testsuite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;


public class RegisterTest extends Utility {
    String baseurl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void verifyThatSigningUpPageDisplay() {
       //* click on the ‘Register’ link
        clickONElement(By.xpath("//a[contains(text(),'Register')]"));
        //* Verify the text ‘Signing up is easy!’
        verifyTextFromElements(By.xpath("//h1[contains(text(),'Signing up is easy!')]"),"Signing up is easy!");
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //* click on the ‘Register’ link
        clickONElement(By.xpath("//a[contains(text(),'Register')]"));
        //* Enter First name
        sendTextToElement(By.xpath("//input[@id='customer.firstName']"),"kishan");
        //* Enter Last name
        sendTextToElement(By.xpath("//input[@id='customer.lastName']"),"Malaviya");
        //* Enter Address
        sendTextToElement(By.xpath("//input[@id='customer.address.street']"),"115a manor drive north");
        //* Enter City
        sendTextToElement(By.xpath("//input[@id='customer.address.city']"),"london");
        //* Enter State
        sendTextToElement(By.xpath("//input[@id='customer.address.state']"),"new malden");
        //* Enter Zip Code
        sendTextToElement(By.xpath("//input[@id='customer.address.zipCode']"),"kt3 5pd");
        //* Enter Phone
        sendTextToElement(By.xpath("//input[@id='customer.phoneNumber']"),"07534994688");
        //Enter SSN
        sendTextToElement(By.xpath("//input[@id='customer.ssn']"),"kkkk");
        //* Enter Username
        sendTextToElement(By.xpath("//input[@id='customer.username']"),"kishan_0250");
        //* Enter Password
        sendTextToElement(By.xpath("//input[@id='customer.password']"),"Vivek241990");
        //* Enter Confirm
        sendTextToElement(By.xpath("//input[@id='repeatedPassword']"),"Vivek241990");
        //* Click on REGISTER button
        clickONElement(By.xpath("//tbody/tr[13]/td[2]/input[1]"));  ////tbody/tr[13]/td[2]/input[1]
        //* Verify the text 'Your account was created successfully. You are now logged in.
        verifyTextFromElements(By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]"),"Your account was created successfully. You are now logged in.");








    }
}


