import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Lesson1 {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "src/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://picsart.com/");

        WebElement loginButton = driver.findElement(By.cssSelector("[data-test='headerAuth-signInBtn pa-uiLib-headerAuth-authBtn']"));
        loginButton.click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("username")));

//        Thread.sleep(3000);

        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("janeeyr");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("230901890");

        WebElement logInPageButton = driver.findElement((By.cssSelector("[data-test='pa-uiLib-authentication-btn primary pa-uiLib-authentication-signIn']")));
        logInPageButton.click();

        driver.quit();
    }
}
