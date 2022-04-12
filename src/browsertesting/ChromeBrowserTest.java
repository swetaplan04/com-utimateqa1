package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
    String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current URL = " + driver.getCurrentUrl());
    String loginUrl ="https://courses.ultimateqa.com/users/sign_in";

        driver.navigate().to(loginUrl);
        System.out.println("Current URL = " +driver.getCurrentUrl());


        System.out.println(driver.getPageSource());
    WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("Admin");

    WebElement passwordlField = driver.findElement(By.name("user[password]"));
        passwordlField.sendKeys("admin123");
        driver.close();
}

}
