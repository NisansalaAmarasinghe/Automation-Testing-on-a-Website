import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxSelectionTests {
    WebDriver driver;

    @BeforeMethod
    public void checkPrductsTest() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("123");    //set the Web Browser Version into my chrome version
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();        //maximize the window
        driver.get("https://www.singersl.com/");
    }

    @Test
    public void checkboxTests() throws InterruptedException {

        System.out.println("-----------------------Test Cases of check box selections in products----------------------------");

        Actions actions = new Actions(driver);

        //Navigate to PRODUCTS button with mouse movements.
        System.out.println("Test 1: Browse to the Products Page in Navigation Bar.");
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[1]"))).perform();
        WebElement productButton = driver.findElement(By.xpath("//*[@id='block-mainnavigation']/div/nav/div/ul/li[1]"));
        productButton.click();

       //Navigate to Main Device Category
        System.out.println("Test 2: Browse to device category in list of check boxes.");
        WebElement deviceCategory = driver.findElement(By.xpath("//*[@id='block-categories']/div/ul[1]/li/label/span"));
        deviceCategory.click();

        //Navigate to Mobile phone check box
        System.out.println("Test 3: Browse to mobile phone category in child list of main check box list.");
        WebElement mobileCategory = driver.findElement(By.xpath("//span[normalize-space()='Mobile Phones']"));
        mobileCategory.click();

        //Slider operation
        System.out.println("Test 4: Slider Operation in mobile phone category");
        Thread.sleep(2000);
        WebElement slidePoint = driver.findElement(By.xpath("//*[@id='slider-range']/div"));
        System.out.println("        Location of Slider point before moving: " + slidePoint.getLocation());
        actions.dragAndDropBy(slidePoint,500,0).perform();

        //Navigate to back
        driver.navigate().back();

        //Navigate to projector check box.
        System.out.println("Test 5: Browse to projector category in child list of main check box list.");
        WebElement projectorCategory = driver.findElement(By.xpath("//span[normalize-space()='Projectors']"));
        projectorCategory.click();

        //Navigate to SINGER button with mouse movements.
        System.out.println("Test 6: Browse the Singer Button to home page.");
        actions.moveToElement(driver.findElement(By.xpath("//img[@alt='SINGER Sri Lanka']"))).perform();
        WebElement singerButton = driver.findElement(By.xpath("//img[@alt='SINGER Sri Lanka']"));
        singerButton.click();

    }
}
