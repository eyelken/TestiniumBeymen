package com.testinium.pages;

import com.testinium.utilities.BrowserUtils;
import com.testinium.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SearchResultsPage {

  @FindBy(xpath = "//div[@class='m-productCard__photo']")
  public WebElement products;

  @FindBy(xpath = "//a[@class='o-productDetail__brandLink']")
  public WebElement brand;

  @FindBy(xpath = "//h1/span")
  public WebElement productDescription;

  @FindBy(className = "m-price__new")
  public WebElement productPrice;

  @FindBy(xpath = "//span[@class='m-productPrice__salePrice']")
  public WebElement cartPrice;

  @FindBy(xpath = "//button[@id='removeCartItemBtn0-key-0']")
  public WebElement remove;

  @FindBy(xpath = "(//*[@class='m-empty__messageTitle'])[1]")
  public WebElement emptyCart;

  Actions actions= new Actions(Driver.get());

  public void randomProduct() throws InterruptedException {
    int min = 1;
    int max = 48;

    System.out.println("Random value in int from " + min + " to " + max + ":");
    int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
    System.out.println(random_int);
    BrowserUtils.waitFor(2);
    String productsText = "//div[@class='m-productCard__photo']";
    String randomProduct = "(" + productsText + ")" + "[" + random_int + "]";
    System.out.println("randomProduct = " + randomProduct);

    Driver.get().findElement(By.xpath(randomProduct)).click();

  }

  public void saveAsTxt() throws IOException {

    System.setProperty("src/driver/chromedriver", "G:\\chromedriver.exe");

    System.out.println("brandName = " + Driver.get().findElement(By.xpath("//a[@class='o-productDetail__brandLink']")).getAttribute("innerHTML"));
    String brandName = Driver.get().findElement(By.xpath("//a[@class='o-productDetail__brandLink']")).getAttribute("innerHTML");
    System.out.println("productDetail = " + Driver.get().findElement(By.xpath("//h1/span")).getAttribute("innerHTML"));
    String productDetail = Driver.get().findElement(By.xpath("//h1/span")).getAttribute("innerHTML");
    System.out.println("price = " + Driver.get().findElement(By.className("m-price__new")).getAttribute("innerHTML"));
    String price = Driver.get().findElement(By.className("m-price__new")).getAttribute("innerHTML");

    File oldtextFile = new File("src/test/resources/textFile.txt");
    if (oldtextFile.exists())
      oldtextFile.delete();
    FileWriter textFile = new FileWriter("src/test/resources/textFile.txt", true);
    textFile.write(brandName + " " + productDetail + " " + price);
    textFile.close();

    System.out.println("File has been created");
  }

  public void getTheBodySizeList() {
    List<WebElement> allSizes = Driver.get().findElements(By.xpath("//span[starts-with(@class,'m-variation__item')]"));
    System.out.println("allSizes = " + allSizes.size());
    BrowserUtils.waitFor(2);

    for (int i = 1; i < allSizes.size(); i++) {

      if(! allSizes.get(i).getAttribute("class").contains("disabled"));
      String element= String.valueOf(allSizes.get(i).getAttribute("class").contains("disabled"));
      actions.moveToElement(allSizes.get(i)).click().perform();

      Driver.get().findElement(By.xpath("//button[@id='addBasket']")).click();
      BrowserUtils.waitFor(5);
      Driver.get().findElement(By.xpath("//a[@title='Sepetim']")).click();
    }
  }

  public void addQty(){
    WebElement qtyDD=Driver.get().findElement(By.id("quantitySelect0-key-0"));
    Select qtyDropdown=new Select(qtyDD);
    List<WebElement> qtys=qtyDropdown.getOptions();
    for (int i=0; i< qtys.size(); i++){
      if (i>1){
        qtys.get(1);
        System.out.println(qtys.get(1));
        Driver.get().findElement((By) qtys.get(1)).click();
      } else if (i == 0){
        System.out.println("This product doesnt have a second qty");
      }
    }
  }

  public void comparePrices(){
    String priceProductPage = Driver.get().findElement(By.className("m-price__new")).getAttribute("innerHTML");
    String priceCartPage = Driver.get().findElement(By.xpath("//span[@class='m-productPrice__salePrice']")).getAttribute("innerHTML");
    Assert.assertEquals(priceCartPage,priceProductPage);
  }

  public void removeProductAndCheck(){
    actions.moveToElement(remove).click().perform();
    Assert.assertTrue(emptyCart.isDisplayed());
  }



}
