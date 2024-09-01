import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewAccountTest {

    WebDriver driver;

    @BeforeMethod
    public void loginTestPage() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("123");    //set the Web Browser Version into my chrome version
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();        //maximize the window
        driver.get("https://www.singersl.com/");

        System.out.println("---------------------Test Cases in New Registration Form---------------------------");


        System.out.println("Test 1: Click on Login button in Dashboard");
        System.out.println("------------------------------------------------------------------------------------------");
        WebElement loginButton = driver.findElement(By.xpath("//a[@class='login-link']")); //Browse login page.
        loginButton.click();
    }

    @Test
    public void newRegistrationTests() {


        //full name field operations
        System.out.println("Test 2: Fill the full name field in New Registration.");
        WebElement name = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        name.sendKeys("Harry Potter");
        String nameValue = name.getAttribute("value");
        System.out.println("        Given Full Name: " + nameValue);

        //email field operations
        System.out.println("Test 3: Fill the email field in New Registration.");
        WebElement email = driver.findElement(By.xpath("//input[@id='email_change']"));
        email.sendKeys("rakeham945@dcbin.com");
        String emailValue = email.getAttribute("value");
        System.out.println("        Given email: " + emailValue);

        //phone number field operations
        System.out.println("Test 3: Fill the phone number field in New Registration.");
        WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
        phone.sendKeys("0715645852");
        String phoneValue = phone.getAttribute("value");
        System.out.println("        Given phone number: " + phoneValue);

        //Create New Account button operations
        System.out.println("Test 4: Click on Create New Account button.");
        WebElement newAccountButton = driver.findElement(By.xpath("//*[@id='edit-submit-2']"));
        newAccountButton.click();

        //Retrieve warning button text
        WebElement text = driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div[2]/div/div/div"));
        String alertText = text.getText();
        System.out.println("Given Alert is: " + alertText);
        WebElement warningButton = driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div[3]/a"));
        warningButton.click();

        System.out.println("------------------------------------------------------------------------------------------");

    }
}
