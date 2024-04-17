import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp(){

        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");

    }

    @Test
    public void cssLocator(){

        //by tagName

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button_1 = wd.findElement(By.xpath("//button"));
        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input_1 = wd.findElement(By.xpath("//input"));
        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a2 = wd.findElement(By.xpath("//a"));
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div2 = wd.findElement(By.xpath("//div"));
        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form_1 = wd.findElement(By.xpath("//form"));
        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h_1 = wd.findElement(By.xpath("//h1"));
        List<WebElement> list = wd.findElements(By.cssSelector("a"));

        WebElement button1 = wd.findElement(By.cssSelector("button"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));
        WebElement a1 = wd.findElement(By.cssSelector("a"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));
        WebElement h1_2 = wd.findElement(By.cssSelector("form"));

        //by className

        WebElement el = wd.findElement(By.className("container"));
        WebElement el1 = wd.findElement(By.cssSelector(".container"));
        WebElement el2 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement el3 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el4 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement el5 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement el6 = wd.findElement(By.className("active"));
        WebElement el7 = wd.findElement(By.cssSelector(".active"));
        WebElement el8 = wd.findElement(By.xpath("//*[@class='active']"));

        WebElement el9 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement el10 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement el11 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));

        //by id

        WebElement el12 = wd.findElement(By.id("root"));
        WebElement el13 = wd.findElement(By.cssSelector("#root"));
        WebElement el14 = wd.findElement(By.xpath("//*[@id='root']"));

        //attribute

        WebElement el15 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement el16 = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement el17 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement el18 = wd.findElement(By.name("email"));
        WebElement el19 = wd.findElement(By.name("password"));
        WebElement el20 = wd.findElement(By.name("login"));
        WebElement el21 = wd.findElement(By.name("registration"));
        WebElement el22 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement el23 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement el24 = wd.findElement(By.xpath("//*[@href='/login']"));
        WebElement el25 = wd.findElement(By.xpath("//*[@href='/about']"));
        WebElement el26 = wd.findElement(By.xpath("//*[@href='/home']"));
        WebElement el27 = wd.findElement(By.xpath("//*[@name='email']"));
        WebElement el28 = wd.findElement(By.xpath("//*[@name='password']"));
        WebElement el29 = wd.findElement(By.xpath("//*[@type='submit']"));

        //by.limkText & partianText

        WebElement el30 = wd.findElement(By.linkText("HOME"));
        WebElement el31 = wd.findElement(By.linkText("ABOUT"));
        WebElement el32 = wd.findElement(By.linkText("LOGIN"));
        WebElement el33 = wd.findElement(By.partialLinkText("ME"));
        WebElement el34 = wd.findElement(By.partialLinkText("AB"));
        WebElement el35 = wd.findElement(By.partialLinkText("LO"));



        wd.close();
    }






}
