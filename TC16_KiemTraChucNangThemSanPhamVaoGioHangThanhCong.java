// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TC16Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tC16() {
    driver.get("https://winmart.vn/");
    driver.manage().window().setSize(new Dimension(1366, 728));
    driver.findElement(By.cssSelector(".daily-zone__SliderSection-sc-1y0rgat-4 > .product-card__Card-sc-1q72qgw-0:nth-child(1)")).click();
    vars.put("name1", driver.findElement(By.cssSelector(".daily-zone__SliderSection-sc-1y0rgat-4 > .product-card__Card-sc-1q72qgw-0:nth-child(1) .product-card__Title-sc-1q72qgw-6")).getText());
    driver.findElement(By.cssSelector(".product-card__Card-sc-1q72qgw-0:nth-child(1) .add-item-to-cart__Button-sc-1ruto21-1:nth-child(5) span")).click();
    driver.findElement(By.cssSelector(".cart-menu__Box-sc-1uxxzqy-1 > p")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector(".cart-itemstyle__Name-sc-yuve81-5")).click();
    vars.put("name2", driver.findElement(By.cssSelector(".cart-itemstyle__Name-sc-yuve81-5")).getText());
    System.out.println(vars.get("name1").toString());
    System.out.println(vars.get("name2").toString());
    vars.put("check", js.executeScript("return arguments[0].toUpperCase().includes(arguments[1].toUpperCase())", vars.get("name1"),vars.get("name2")));
    System.out.println(vars.get("check").toString());
    assertEquals(vars.get("check").toString(), "true");
    driver.close();
  }
}
