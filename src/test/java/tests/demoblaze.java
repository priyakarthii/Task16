package tests;

import org.testng.annotations.Test;

public class demoblaze extends MainChrome
{

    @Test
    public void test2() throws InterruptedException

    {

        // load url
        chromeDriver.get("https://www.demoblaze.com");
        String title=chromeDriver.getTitle();
        //print current title
        System.out.println("The current pageTitle:" +title);
        // wait time
        Thread.sleep(1000);
        // check the page title
        if("STORE".equals(title)) {
            System.out.println("Page landed on correct website");
        }
        else {
            System.out.println("Page landed on wrong website");
        }
    }






}
