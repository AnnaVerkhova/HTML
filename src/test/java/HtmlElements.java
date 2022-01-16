import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HtmlElements {

    ChromeDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--ignore-popup-blocking");
        chromeOptions.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        driver.get("file:///C:/Users/HP/IdeaProjects/HTML/src/test/java/Homework18.html");
    }

    @Test
    public void HtmlTest() {
        driver.findElement(By.cssSelector("div[class='table']"));
        driver.findElement(By.cssSelector("div[class='Car model']"));
        driver.findElement(By.cssSelector("div[class='Checkboxes']"));
        driver.findElement(By.id("cars"));
        driver.findElement(By.tagName("button"));
        driver.findElement(By.className("image"));
        driver.findElement(By.cssSelector("div[class='paragraph']"));
        driver.findElement(By.linkText("Html book"));
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
