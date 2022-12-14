package com.testinium.step_definitions;

import com.testinium.pages.HomePage;
import com.testinium.utilities.BrowserUtils;
import com.testinium.utilities.ConfigurationReader;
import com.testinium.utilities.Driver;
import com.testinium.utilities.ExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class HomeStepDefs {

  HomePage homePage = new HomePage();

  @Given("kullanıcı Beymen sayfasına yönlendirilir")
  public void kullanıcı_Beymen_sayfasına_yönlendirilir() {
    String url = ConfigurationReader.get("url");
    Driver.get().get(url);
  }

  @When("kullanıcı ilgili anasayfasını başarıyla açmıştır")
  public void kullanıcı_ilgili_anasayfasını_başarıyla_açmıştır() {
    String actualURL = Driver.get().getCurrentUrl();
    String expectedURL = "https://www.beymen.com/";
    System.out.println(actualURL);
    Assert.assertEquals(actualURL, expectedURL);
  }

  @Then("kullanıcı ekranda beliren cinsiyet seçimini yapar")
  public void kullanıcı_ekranda_beliren_cinsiyet_seçimini_yapar(){
    Actions actions = new Actions(Driver.get());
    actions.moveToElement(homePage.womanBtn).doubleClick().perform();
  }

  @Then("kullanıcı çerezleri kabul eder")
  public void kullanıcı_çerezleri_kabul_eder() {
    Actions actions = new Actions(Driver.get());
    actions.moveToElement(homePage.acceptCookies).click().perform();


  }
  @Then("kullanıcı pop up'ı kabul eder")
  public void kullanıcı_pop_up_ı_kabul_eder() throws InterruptedException {
    Thread.sleep(1000);
  }
  @Then("arama kutucuğuna tıklanılır ve excelden şort kelimesi alınarak kutucuğa yazılır ve silinir")
  public void arama_kutucuğuna_tıklanılır_ve_excelden_şort_kelimesi_alınarak_kutucuğa_yazılır_ve_silinir() {
    Actions actions=new Actions(Driver.get());
    actions.moveToElement(homePage.searchBox).click().perform();

    ExcelUtil excel = new ExcelUtil("src/test/resources/Book.xlsx","Sheet1");

    System.out.println("sheet1.getColumnsNames() = " + excel.getColumnsNames());

    String sort= excel.getColumnsNames().get(0);
    System.out.println("firstData= " + sort);

    actions.moveToElement(homePage.searchBox).sendKeys(sort).perform();
    BrowserUtils.waitFor(2);

    for (int i=0; i < sort.length(); i++ ){
      actions.moveToElement(homePage.searchBox).sendKeys(Keys.BACK_SPACE).perform();

    }
  }

  @Then("arama kutucuğuna tıklanılır ve excelden gömlek kelimesi alınarak kutucuğa yazılır ve enter'a tıklanılır")
  public void arama_kutucuğuna_tıklanılır_ve_excelden_gömlek_kelimesi_alınarak_kutucuğa_yazılır_ve_enter_a_tıklanılır()  throws InterruptedException {
    Actions actions=new Actions(Driver.get());
    actions.moveToElement(homePage.searchBox).click().perform();

    ExcelUtil excel = new ExcelUtil("src/test/resources/Book.xlsx","Sheet1");

    String gomlek= excel.getColumnsNames().get(1);
    System.out.println("secondData= " + gomlek);

    actions.moveToElement(homePage.searchBox).sendKeys(gomlek).perform();
    actions.moveToElement(homePage.searchBox).sendKeys(Keys.ENTER).perform();

    Thread.sleep(5000);

    }


}

