import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class play {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://uitestingplayground.com/dynamicid");
        Thread.sleep(3000);
        try {
            driver.findElement(By.xpath("//*[@id=\"74b171e9-2444-82a0-9fbf-b686afbafd6b\"]")).click();
            Thread.sleep(3000);


        }catch (Exception e){
            System.out.println("err test");
            driver.quit();
        }


    }
}
