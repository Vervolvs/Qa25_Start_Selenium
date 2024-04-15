import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp(){

        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");

    }

    @Test
    public void cssLocator(){

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement input = wd.findElement(By.tagName("input"));
        WebElement a = wd.findElement(By.tagName("a"));
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement form = wd.findElement(By.tagName("form"));

        WebElement button1 = wd.findElement(By.cssSelector("button"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));
        WebElement a1 = wd.findElement(By.cssSelector("a"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));

        wd.close();
    }






}
