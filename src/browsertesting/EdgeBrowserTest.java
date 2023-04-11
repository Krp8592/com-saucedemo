package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {


        String baseUrl = "https://www.saucedemo.com/";

        //Opening the browser
        WebDriver driver = new EdgeDriver();

        //Maximize the browser
        driver.manage().window().maximize();

        //Opening the Url in the browser
        driver.get(baseUrl);

        //Set the implicit wait for the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Current url
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //Page source
        System.out.println("Page source : " + driver.getPageSource());

        //Find the username field element and type username in the username field element
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //Find the password field element and type the password in the password field element
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //Close the browser
        driver.close();
    }
}
