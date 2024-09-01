import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class placeOrderTests {

    WebDriver driver;

    @BeforeMethod
    public void searchingTest() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("123");    //set the Web Browser Version into my chrome version
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();        //maximize the window


    }

    @Test
    public void placeOrderingTest() {

        driver.get("https://www.singersl.com/");
        Actions actions = new Actions(driver);

        System.out.println("-----------------------Test Cases of Place an Order----------------------------");

        System.out.println("Test 1: Go to Cart");
        WebElement cart = driver.findElement(By.xpath("//span[@class='cart-block-icon']"));
        cart.click();

        System.out.println("Test 2: Continue Shopping");
        WebElement shopping = driver.findElement(By.xpath("//a[normalize-space()='Continue Shopping']"));
        shopping.click();

        System.out.println("Test 3: Search an product on the searching bar.");
        driver.findElement(By.xpath("//input[@id='edit-search']")).sendKeys("Laptop" + Keys.ENTER);

        System.out.println("Test 4: Select an item to purchase.");
        WebElement product = driver.findElement(By.xpath("//*[@id='popularity']/div/div[5]/div[2]/a/img"));
        product.click();

        System.out.println("Test 5: Purchase the selected product");
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='buy-now-id']"))).perform();
        WebElement purchaseButton = driver.findElement(By.xpath("//*[@id='buy-now-id']"));
        purchaseButton.click();

        System.out.println("Test 6: Confirm The Order");
        //This place order element is not interactable through Selenium.
        //actions.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Place Order']"))).perform();
        //WebElement confirmbutton = driver.findElement(By.xpath("//a[normalize-space()='Place Order']"));
        //confirmbutton.click();

    }

}
