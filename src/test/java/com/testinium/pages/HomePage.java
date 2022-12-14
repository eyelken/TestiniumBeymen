package com.testinium.pages;

import com.testinium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

  public HomePage(){
    PageFactory.initElements(Driver.get(), this);
  }

  @FindBy(xpath = "//button[@id='genderWomanButton']")
  public WebElement womanBtn;

  @FindBy(xpath = "//button[@id='genderManButton']")
  public WebElement manBtn;

  @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
  public WebElement acceptCookies;

  @FindBy(xpath = "//input[@class='default-input o-header__search--input']")
  public WebElement searchBox;

}
