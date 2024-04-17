import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
       wd = new ChromeDriver();
       wd.get("file:///C:/Users/Objec/Downloads/21.index.html");
    }

    @Test
    public void tableTest(){
        //Canada
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals(canada.getText(),"Canada");


    }




    @Test
    public void cssLocators(){
        //by tag name
        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));
        WebElement button2 = wd.findElement(By.xpath("button"));

        List<WebElement> list = wd.findElements(By.tagName("a"));
        List<WebElement> a = wd.findElements(By.cssSelector("a"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

        //by class
        WebElement el = wd.findElement(By.className("container"));
        WebElement el1 = wd.findElement(By.cssSelector(".container"));
        WebElement el15 = wd.findElement(By.xpath("//*[@class='conainer']"));

        List<WebElement> a1 = wd.findElements(By.className("nav-item"));
        List<WebElement> a2 = wd.findElements(By.cssSelector(".nav-item"));

        //by id
        WebElement el2 = wd.findElement(By.id("nav"));
        WebElement el3 = wd.findElement(By.cssSelector("#nav"));
       // WebElement el6 = wd.findElement(By.cssSelector("[id='nav']"));
        WebElement el17 = wd.findElement(By.xpath("//*[@id='nav']"));

        //by attribute

        WebElement el4 = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement el5 = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement el7 = wd.findElement(By.cssSelector("[name='surename']"));
        WebElement el8 = wd.findElement(By.name("surename"));

        //by.limkText & partianText
        WebElement el9 = wd.findElement(By.linkText("Item1"));
        WebElement el10 = wd.findElement(By.partialLinkText("m 1"));

        //
        WebElement el11 = wd.findElement(By.cssSelector("[placeholder = 'Type your name']"));
        //
        WebElement el12 = wd.findElement(By.cssSelector("[placeholder = 'Type']"));
        WebElement el19 = wd.findElement(By.xpath("//*[starts-with(@placeholder, 'Type')]"));
        //
        WebElement el13 = wd.findElement(By.cssSelector("[placeholder $= 'name']"));
        WebElement el20 = wd.findElement(By.xpath("//*[comains(@placeholder, 'name')]"));
        //
        WebElement el14 = wd.findElement(By.cssSelector("[placeholder "));


    }





}
