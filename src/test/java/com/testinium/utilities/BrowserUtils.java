package com.testinium.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

  public static void waitFor(int seconds) {
    try {
      Thread.sleep(seconds * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  public static WebElement waitForClickablility(By locator, int timeout) {
    WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
    return wait.until(ExpectedConditions.elementToBeClickable(locator));
  }
}
