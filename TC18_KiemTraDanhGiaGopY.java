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
public class TC18danhgiagopyTest {
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
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void tC18danhgiagopy() {
    driver.get("https://winmart.vn//");
    driver.manage().window().setSize(new Dimension(1936, 1048));
    js.executeScript("window.scrollTo(0,3439)");
    driver.findElement(By.cssSelector(".auth-menu__Box-sc-1ifavmo-0 > p")).click();
    driver.findElement(By.cssSelector(".customerstyle__SidebarMenu-sc-ds3fyt-4:nth-child(7) > .item")).click();
    js.executeScript("window.scrollTo(0,0)");
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.linkText("Đánh giá góp ý")).click();
    vars.put("win2036", waitForWindow(2000));
    driver.switchTo().window(vars.get("win2036").toString());
    driver.findElement(By.cssSelector(".MuiGrid-root:nth-child(3)")).click();
    driver.findElement(By.id("feedbackReason")).click();
    driver.findElement(By.id("feedbackReason-option-4")).click();
    driver.findElement(By.id("feedbackLocation")).click();
    driver.findElement(By.id("feedbackLocation-option-2")).click();
    driver.findElement(By.id("fullName")).click();
    driver.findElement(By.id("content")).click();
    driver.findElement(By.id("fullName")).click();
    driver.findElement(By.id("fullName")).sendKeys("Hoàng Yên");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("maibaongocc18102002@gmail.com");
    driver.findElement(By.id("phoneNo")).click();
    driver.findElement(By.id("phoneNo")).click();
    driver.findElement(By.id("title")).click();
    driver.findElement(By.id("phoneNo")).click();
    driver.findElement(By.id("phoneNo")).sendKeys("0384331808");
    driver.findElement(By.id("title")).click();
    driver.findElement(By.cssSelector(".feedbackstyle__MainContainer-sc-1g23iox-0")).click();
    driver.findElement(By.id("title")).sendKeys("em cảm ơn, em làm bài tập ạ, đơn online trên winmart oke lắm ạ");
    driver.findElement(By.id("content")).click();
    driver.findElement(By.id("content")).sendKeys("em cảm ơn, em làm bài tập ạ, đơn online trên winmart oke lắm ạ");
    driver.findElement(By.id("title")).click();
    driver.findElement(By.id("title")).click();
    {
      WebElement element = driver.findElement(By.id("title"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("title")).click();
    driver.findElement(By.id("title")).click();
    {
      WebElement element = driver.findElement(By.id("title"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("title")).click();
    driver.findElement(By.id("title")).click();
    driver.findElement(By.id("title")).sendKeys("góp ý dịch vụ");
    driver.findElement(By.id("content")).click();
    driver.findElement(By.id("content")).sendKeys("em cảm ơn, em làm bài tập ạ, đơn online trên winmart oke lắm ạ, quý anh/chị không cần liên hệ em đâu ạ <3");
    driver.findElement(By.cssSelector(".hLrTMn")).click();
    driver.findElement(By.cssSelector(".css-15j76c0")).click();
    assertThat(driver.findElement(By.cssSelector(".feedbackstyle__SuccessDiv-sc-1g23iox-6")).getText(), is("Thông tin của Quý Khách đã được ghi nhận. Chúng tôi xin phép kiểm tra và sẽ phản hồi thông tin trong thời gian sớm nhất!. Xin trân trọng cảm ơn!!!"));
    driver.findElement(By.cssSelector(".feedbackstyle__MainContainer-sc-1g23iox-0")).click();
  }
}
