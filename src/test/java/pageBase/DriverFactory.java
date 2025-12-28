package pageBase;

	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class DriverFactory {

	    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	    private DriverFactory() {
	        // prevent object creation
	    }

	    public static void initDriver(String browser) {

	        if (driver.get() == null) {

	            switch (browser.toLowerCase()) {
	            case "chrome":
	                driver.set(new ChromeDriver());
	                break;

	            case "firefox":
	                driver.set(new FirefoxDriver());
	                break;

	            case "edge":
	                driver.set(new EdgeDriver());
	                break;

	            default:
	                throw new IllegalArgumentException("Invalid browser: " + browser);
	            }

	            driver.get().manage().window().maximize();
	            driver.get().manage().timeouts()
	                    .implicitlyWait(Duration.ofSeconds(10));
	        }
	    }

	    public static WebDriver getDriver() {
	        return driver.get();
	    }

	    public static void quitDriver() {
	        if (driver.get() != null) {
	            driver.get().quit();
	            driver.remove();
	        }
	    }
	}

