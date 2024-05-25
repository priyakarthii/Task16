package tests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class wikipedia extends MainChrome
{
@Test
    public void test3() throws InterruptedException
    {

        chromeDriver.get("https://www.wikipedia.org");
        // wait time
        Thread.sleep(1000);
        // search input in wikipedia
        WebElement search=chromeDriver.findElement(By.id("searchInput"));
        search.sendKeys("Artificial Intelligence");
        search.submit();
        Thread.sleep(1000);
        // histroy in wikipedia
        WebElement history=chromeDriver.findElement(By.xpath("//a[@href=\"#History\"]"));
        history.click();
        Thread.sleep(1000);
        //get histroy title
        WebElement htitle=chromeDriver.findElement(By.xpath("//span[@id='History']"));
        String histroytitle=htitle.getText();
        //print current title
        System.out.println("The current pageTitle:" +histroytitle);
        Thread.sleep(1000);

    }

















}
