package framework;

import framework.utils.LoadProperty;
import org.openqa.selenium.WebDriver;

public class DriverStart {
    private static WebDriver driver;
    private static DriverStart driverStartInstance;
    private static String URL = LoadProperty.getProperty("url");
    private static String BROWSER = LoadProperty.getProperty("browser");

    private DriverStart() {
        if (driver == null) {
            driver = ChooseBrowser.getBrowser(BROWSER);
            if (driver != null) {
                driver.manage().window().maximize();
                driver.navigate().to(URL);
            }
        }
    }

    public static synchronized DriverStart getInstance() {
        if (driverStartInstance == null || driverStartInstance.getDriver() == null) {
            driverStartInstance = new DriverStart();
        }
        return driverStartInstance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
            driver = null;
            driverStartInstance = null;
        }
    }
}