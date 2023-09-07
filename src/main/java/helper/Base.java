package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import java.util.Properties;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Base {

	public static Properties prop;
	public  static WebDriver driver;

	static {

		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir")+"/src/test/java/resources/env.properties");

			prop = new Properties();

			prop.load(file);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Before

	public void setup() {

		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equals("edge")) {
			driver = new EdgeDriver();
		}

		driver.get(prop.getProperty("url"));

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

// @After
	public void tearDown(Scenario s) throws IOException {
		if (s.isFailed()) {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File src = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("Screenshots" + s.getName() + ".png"));

		}

		driver.quit();
	}

	
}