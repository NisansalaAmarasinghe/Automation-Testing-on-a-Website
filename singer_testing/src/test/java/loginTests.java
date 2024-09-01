import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTests {

    WebDriver driver;

    @BeforeMethod
    public void loginTestPage() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("123");    //set the Web Browser Version into my chrome version
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();        //maximize the window
        driver.get("https://www.singersl.com/");

        System.out.println("---------------------Test Cases in LogIn button Before Register---------------------------");

        System.out.println("Test 1: Click on Login button in Dashboard");
        System.out.println("------------------------------------------------------------------------------------------");
        WebElement loginButton = driver.findElement(By.xpath("//a[@class='login-link']")); //Browse login page
        loginButton.click();
    }

    @Test
    public void logInButtonTestBeforeRegister() {

        //email field operations
        System.out.println("Test 2: Fill the email field in logIn.");
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("mifipa8360@mposhop.com");
        String email1Value = email.getAttribute("value");
        System.out.println("        Given email address: " + email1Value);

        //password field operations
        System.out.println("Test 3: Fill the password field in logIn.");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("1234");
        String password1Value = password.getAttribute("value");
        System.out.println("        Given password: " + password1Value);

        //LogIn button operations
        System.out.println("Test 4: Click on LogIn button.");
        WebElement logInButton = driver.findElement(By.xpath("//input[@id='login-submit']"));
        logInButton.click();

        //Retrieve warning button text
        WebElement text = driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div[2]"));
        String alertText = text.getText();
        System.out.println("Given Alert is: " + alertText);
        WebElement warningButton = driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div[3]/a"));
        warningButton.click();

        driver.navigate().refresh();  //to refresh

        System.out.println("------------------------------------------------------------------------------------------");

    }
}


