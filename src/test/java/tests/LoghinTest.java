package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoghinTest {
    //webdriver=variabila care ne ajuta sa interactionam cu siteul si elementele acestuia

    public WebDriver driver;

    @Test
    public void testAutomat() {
        //specificam unde se afla driverul pt browser
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        //deschidem un browser
        driver = new ChromeDriver();
        //introducem o adresa
        driver.get("http://demo.automationtesting.in/Index.html");
        //schimbam in full screen
        driver.manage().window().maximize();

        //trebuie sa identificam elementul sign in
        WebElement signInElement = driver.findElement(By.id("btn1"));
        //facem un click
        signInElement.click();
        //indentificare element dupa locator: id, class, name, link, css, xpath

        WebElement emailElement = driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailValue = "ceva@ceva.com";
        emailElement.sendKeys(emailValue);

        WebElement parolaElement = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        String parolaValue = "parolaInspargibila";
        parolaElement.sendKeys(parolaValue);
        WebElement enterElement = driver.findElement(By.id("enterbtn"));
        enterElement.click();


    }
    }