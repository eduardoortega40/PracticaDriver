
package com.qualitystream.tutorial
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openca.selenium.chome.CromeDriver
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GoogleSearchTest {

    private WebDriver driver;
    @Before
    public void setUp(){
System.setProperty(webdriver.chrome.driver","./src/chromeDriver/chromedriver.exe");
        driver=new ChromeDiver();
        driver.manage().window().maximize();
        driver.get("https:/www.google.com/");


    }
    @Test
    public void testGooglePage(){
        WebElement searchbox=driver.findElement(By.name("q"));
        searchbox.clear();
        searchbox.sendkeys("quality-stream Introduccion a la automatizacion");
        searchbox.submit();
driver.manage().timeout().implicitlyWait(10,TimeUni.SECONDS);
 assertquals("quality-stream Introduccion a la automatizacion ",driver.getTitle));

    }
@After
    public void teardow(){
        driver.quit;
}
}
