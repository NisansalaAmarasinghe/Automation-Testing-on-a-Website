import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MousePointerTests {
    WebDriver driver;

    @BeforeMethod
    public void HomePageTest() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("123");    //set the Web Browser Version into my chrome version
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();        //maximize the window
        driver.get("https://www.singersl.com/");
    }

    @Test
    public void mouseMovementsTests() throws InterruptedException {

        System.out.println("-----------------------Test Cases of Mouse movements in HomePage----------------------------");

        Actions actions = new Actions(driver);

        System.out.println("Test 1: Mouse movements in Navigation Bar with 7 tabs.");

        actions.moveToElement(driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[1]")))
                .moveToElement(driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[2]")))
                .moveToElement(driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[3]")))
                .moveToElement(driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[4]")))
                .moveToElement(driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[5]")))
                .moveToElement(driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[6]")))
                .moveToElement(driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[7]"))).perform();

        //Move Main Advertisements Banner
        System.out.println("Test 2: Move the Advertisement Banner using the arrow.");
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='main-banner']/div[2]/button[2]"))).perform();
        WebElement bannerArrow = driver.findElement(By.xpath("//*[@id='main-banner']/div[2]/button[2]"));

        for (int i = 1; i <= 3; i++) {
            Thread.sleep(1000);
            bannerArrow.click();
        }

        //Navigate to PRODUCTS button with mouse movements.
        System.out.println("Test 3: Browse to the Products Page in Navigation Bar.");
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[1]"))).perform();
        WebElement productButton = driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[1]"));
        productButton.click();

        //Navigate to BRANDS button with mouse movements.
        System.out.println("Test 4: Browse to the Brands Page in Navigation Bar.");
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[2]"))).perform();
        WebElement brandsButton = driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[2]"));
        brandsButton.click();

        //Navigate to ADDED SERVICES button with mouse movements.
        System.out.println("Test 5: Browse to the Added Services Page in Navigation Bar.");
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[3]"))).perform();
        WebElement serviceButton = driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[3]"));
        serviceButton.click();
        String title = driver.getTitle();
        if (title.contains("403") || title.contains("404") || title.contains("Error")) {
            System.out.println("        The link might be broken or the page might not be found.");
        } else {
            System.out.println("        Page loaded successfully.");
        }

        //Navigate to DUTY FREE Cart button with mouse movements.
        System.out.println("Test 6: Browse to the Duty Free Page in Navigation Bar.");
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[3]/a"))).perform();
        WebElement dutyButton = driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[3]/a"));
        dutyButton.click();

        //Navigate to  OMNI CART button with mouse movements.
        System.out.println("Test 7: Browse to the Omni Cart Page in Navigation Bar.");
        actions.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Omni Cart']"))).perform();
        WebElement cartButton = driver.findElement(By.xpath("//a[normalize-space()='Omni Cart']"));
        cartButton.click();

        //Slider operation
        System.out.println("Test 8: Slider Operation in Omni Cart Page");
        Thread.sleep(2000);
        WebElement slidePoint1 = driver.findElement(By.xpath("//*[@id='slider-range']/div"));
        System.out.println("        Location of Slider point 1 before moving: " + slidePoint1.getLocation());
        actions.dragAndDropBy(slidePoint1,500,0).perform();

        //Navigate to HOT DEALS button with mouse movements.
        System.out.println("Test 9: Browse to the Hot Deals Page in Navigation Bar.");
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[6]"))).perform();
        WebElement dealsButton = driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[6]"));
        dealsButton.click();

        //Navigate to LOYALTY PROGRAM button with mouse movements.
        System.out.println("Test 10: Browse to the Loyalty Program Page in Navigation Bar.");
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[7]"))).perform();
        WebElement loyaltyButton = driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[7]"));
        loyaltyButton.click();

        //Navigate to SINGER button with mouse movements.
        System.out.println("Test 11: Browse the Singer Button to home page.");
        actions.moveToElement(driver.findElement(By.xpath("//img[@alt='SINGER Sri Lanka']"))).perform();
        WebElement singerButton = driver.findElement(By.xpath("//img[@alt='SINGER Sri Lanka']"));
        singerButton.click();
    }
}

