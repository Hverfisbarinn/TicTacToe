package is.ru.hugb;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestTicTacToe extends SeleniumTestWrapper {

  @Test
  public void testFirstBox() throws Exception {
    driver.get(baseUrl);
    /* Remove Thread.sleep... */
    Thread.sleep(2000);
    WebElement w = driver.findElement(By.id("1"));
    w.click();
    /* Remove Thread.sleep... */
    Thread.sleep(2000);
    /* ... finish test! */
  }
}