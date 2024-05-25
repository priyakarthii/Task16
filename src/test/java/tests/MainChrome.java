package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MainChrome {

    ChromeDriver chromeDriver;

@BeforeTest
    public void setUp()
    {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
    }
@AfterTest
    public void tearDown(){
        // close the chrome
        chromeDriver.quit();
    }



}
