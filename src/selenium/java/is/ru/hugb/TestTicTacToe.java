package is.ru.hugb;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

public class TestTicTacToe extends SeleniumTestWrapper {

  @Test
  public void testTitleMatches() {
    driver.get(baseUrl);
    assertEquals("HverfisTacToe", driver.getTitle());
  }
  
  @Test
  public void testDraw() throws Exception {
    driver.get(baseUrl);
    
    driver.findElement(By.id("1")).click(); //X
    driver.findElement(By.id("2")).click(); //O
    driver.findElement(By.id("3")).click(); //X
    driver.findElement(By.id("5")).click(); //O
    driver.findElement(By.id("4")).click(); //X
    driver.findElement(By.id("7")).click(); //O
    driver.findElement(By.id("6")).click(); //X
    driver.findElement(By.id("9")).click(); //O
    driver.findElement(By.id("8")).click(); //X
    
    try{
      Thread.sleep(2000);
    }
      catch(InterruptedException ie){
    }  
    Alert alert = driver.switchTo().alert();
	  assertEquals("DRAW", alert.getText());
    alert.accept();

  }
  
  @Test
  public void testWinnerX() throws Exception {
    driver.get(baseUrl);

    driver.findElement(By.id("1")).click(); //X
    driver.findElement(By.id("2")).click(); //O
    driver.findElement(By.id("3")).click(); //X
    driver.findElement(By.id("4")).click(); //O
    driver.findElement(By.id("5")).click(); //X
    driver.findElement(By.id("6")).click(); //O
    driver.findElement(By.id("7")).click(); //X
	
    try{
      Thread.sleep(2000);
    }
      catch(InterruptedException ie){
    }  
	  Alert alert = driver.switchTo().alert();
	  assertEquals("Player X Won!", alert.getText());
	  alert.accept();	
  }
  
  
  @Test
  public void testWinnerO() throws Exception {
    driver.get(baseUrl);

    driver.findElement(By.id("1")).click(); //X
    driver.findElement(By.id("2")).click(); //O
    driver.findElement(By.id("3")).click(); //X
    driver.findElement(By.id("5")).click(); //O
    driver.findElement(By.id("4")).click(); //X
    driver.findElement(By.id("7")).click(); //O
    driver.findElement(By.id("6")).click(); //X
    driver.findElement(By.id("8")).click(); //O

    try{
      Thread.sleep(2000);
    }
      catch(InterruptedException ie){
    }  
	  Alert alert = driver.switchTo().alert();
	  assertEquals("Player O Won!", alert.getText());	
	  alert.accept();	
  } 
  
  @Test
  public void testHorizontalWin() throws Exception {
    driver.get(baseUrl);

    driver.findElement(By.id("1")).click(); //X
    driver.findElement(By.id("4")).click(); //O
    driver.findElement(By.id("2")).click(); //X
    driver.findElement(By.id("5")).click(); //O
    driver.findElement(By.id("3")).click(); //X

    try{
      Thread.sleep(2000);
    }
      catch(InterruptedException ie){
    }  
    Alert alert = driver.switchTo().alert();
    assertEquals("Player X Won!", alert.getText()); 
    alert.accept();
  } 

  @Test
  public void testVerticalWin() throws Exception {
    driver.get(baseUrl);

    driver.findElement(By.id("1")).click(); //X
    driver.findElement(By.id("2")).click(); //O
    driver.findElement(By.id("4")).click(); //X
    driver.findElement(By.id("5")).click(); //O
    driver.findElement(By.id("7")).click(); //X

    try{
      Thread.sleep(2000);
    }
      catch(InterruptedException ie){
    }  
    Alert alert = driver.switchTo().alert();
    assertEquals("Player X Won!", alert.getText()); 
    alert.accept();
  } 

  @Test
  public void testDiagonalWinOne() throws Exception {
    driver.get(baseUrl);

    driver.findElement(By.id("1")).click(); //X
    driver.findElement(By.id("2")).click(); //O
    driver.findElement(By.id("5")).click(); //X
    driver.findElement(By.id("4")).click(); //O
    driver.findElement(By.id("9")).click(); //X

    try{
      Thread.sleep(2000);
    }
      catch(InterruptedException ie){
    }  
    Alert alert = driver.switchTo().alert();
    assertEquals("Player X Won!", alert.getText()); 
    alert.accept();
  } 

  @Test
  public void testDiagonalWinTwo() throws Exception {
    driver.get(baseUrl);

    driver.findElement(By.id("1")).click(); //X
    driver.findElement(By.id("3")).click(); //O
    driver.findElement(By.id("2")).click(); //X
    driver.findElement(By.id("5")).click(); //O
    driver.findElement(By.id("4")).click(); //X
    driver.findElement(By.id("7")).click(); //O

    try{
      Thread.sleep(2000);
    }
      catch(InterruptedException ie){
    }  
    Alert alert = driver.switchTo().alert();
    assertEquals("Player O Won!", alert.getText()); 
    alert.accept();
  } 
  
}