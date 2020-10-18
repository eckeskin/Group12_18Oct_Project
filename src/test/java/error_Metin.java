import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class error_Metin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        Thread.sleep(2500);

        // closes currant tap
        driver.close();

        driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(6000);

        driver.quit(); // when error happens  find EXCEPTION and google the line
        // or the BLUE written parts takes you to the correct line if you click

        // I tried to run but in vain  :(

    }
    }
