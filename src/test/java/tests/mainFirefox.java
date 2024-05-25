package tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class mainFirefox {

    FirefoxDriver firefoxDriver;

    @BeforeTest

    public void setUp()
    {
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().window().maximize();
    }

@AfterTest
public void tearDown(){
    // close the firefox
    firefoxDriver.quit();
}

}
