package manager;

import org.example.Element;
import org.example.MainPage;
import org.example.SendPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    public WebDriver driver;
    public MainPage mainPage;
    public Element element;


    public MainPage getMainPage() {
        return mainPage;
    }

    public SendPage getSendPage() {
        return sendPage;
    }


    public SendPage sendPage;
    public void init() throws InterruptedException {
        System.setProperty("webdriver.chome.driver", "C:\\Users\\azarechnyi\\AT\\testimonyAutotests\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/index.html");
        element = new Element(driver);
        mainPage = new MainPage(driver);
        sendPage = new SendPage(driver);
        Thread.sleep(1000);
    }

    public void close() {
        driver.quit();
    }
}
