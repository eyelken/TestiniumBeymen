package com.testinium.step_definitions;

import com.testinium.pages.SearchResultsPage;
import com.testinium.utilities.BrowserUtils;
import com.testinium.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;


public class SearchResultsStepDefs {

  SearchResultsPage searchResultsPage=new SearchResultsPage();
  Actions actions=new Actions(Driver.get());
  @Then("sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir")
  public void sonuca_göre_sergilenen_ürünlerden_rastgele_bir_ürün_seçilir() throws InterruptedException {
    searchResultsPage.randomProduct();
    Thread.sleep(4000);
    }


  @Then("seçilen ürünün ürün bilgisi ve tutar bilgisi txt dosyasına yazılır")
  public void seçilen_ürünün_ürün_bilgisi_ve_tutar_bilgisi_txt_dosyasına_yazılır() throws IOException {
    searchResultsPage.saveAsTxt();
  }

  @Then("seçilen ürün sepete eklenilir")
  public void seçilen_ürün_sepete_eklenilir() {
    searchResultsPage.getTheBodySizeList();
  }

  @Then("ürün sayfasındaki fiyat ile sepetteki fiyatın doğruluğu karşılaştırılır")
  public void ürün_sayfasındaki_fiyat_ile_sepetteki_fiyatın_doğruluğu_karşılaştırılır() {
    String priceProductPage = Driver.get().findElement(By.className("m-price__new")).getAttribute("innerHTML");
    String priceCartPage = Driver.get().findElement(By.xpath("//span[@class='m-productPrice__salePrice']")).getAttribute("innerHTML");
    Assert.assertEquals(priceCartPage,priceProductPage);
  }

  @Then("ürün adeti arttırılarak ürün adedinin iki adet olduğu doğrulanılır")
  public void ürün_adeti_arttırılarak_ürün_adedinin_iki_adet_olduğu_doğrulanılır() {
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

  @Then("sepetten ürün silinerek sepetin boş olduğu kontrol edilir")
  public void sepetten_ürün_silinerek_sepetin_boş_olduğu_kontrol_edilir() {
    actions.moveToElement((WebElement) By.xpath("//button[@id='removeCartItemBtn0-key-0']")).click().perform();
    boolean displayed= Driver.get().findElement(By.xpath("(//*[@class='m-empty__messageTitle'])[1]")).isDisplayed();
    Assert.assertTrue("true", displayed);
  }
}
