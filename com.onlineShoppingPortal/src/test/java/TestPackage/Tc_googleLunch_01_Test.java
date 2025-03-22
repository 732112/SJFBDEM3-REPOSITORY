package TestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_googleLunch_01_Test {
  @Test
  public void lunchGoogle() {
WebDriver	driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.google.com/");
  }
}
// mvn -Dtest="packageName.classname"test
// mvn test="packageName.classname"test
