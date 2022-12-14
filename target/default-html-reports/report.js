$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/HomePage.feature");
formatter.feature({
  "name": "Beymen sayfasının açılması",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Beymen sayfası açılır",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanıcı Beymen sayfasına yönlendirilir",
  "keyword": "Given "
});
formatter.match({
  "location": "com.testinium.step_definitions.HomeStepDefs.kullanıcı_Beymen_sayfasına_yönlendirilir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanıcı ilgili anasayfasını başarıyla açmıştır",
  "keyword": "When "
});
formatter.match({
  "location": "com.testinium.step_definitions.HomeStepDefs.kullanıcı_ilgili_anasayfasını_başarıyla_açmıştır()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanıcı ekranda beliren cinsiyet seçimini yapar",
  "keyword": "Then "
});
formatter.match({
  "location": "com.testinium.step_definitions.HomeStepDefs.kullanıcı_ekranda_beliren_cinsiyet_seçimini_yapar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanıcı çerezleri kabul eder",
  "keyword": "And "
});
formatter.match({
  "location": "com.testinium.step_definitions.HomeStepDefs.kullanıcı_çerezleri_kabul_eder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanıcı pop up\u0027ı kabul eder",
  "keyword": "And "
});
formatter.match({
  "location": "com.testinium.step_definitions.HomeStepDefs.kullanıcı_pop_up_ı_kabul_eder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "arama kutucuğuna tıklanılır ve excelden şort kelimesi alınarak kutucuğa yazılır ve silinir",
  "keyword": "Then "
});
formatter.match({
  "location": "com.testinium.step_definitions.HomeStepDefs.arama_kutucuğuna_tıklanılır_ve_excelden_şort_kelimesi_alınarak_kutucuğa_yazılır_ve_silinir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "arama kutucuğuna tıklanılır ve excelden gömlek kelimesi alınarak kutucuğa yazılır ve enter\u0027a tıklanılır",
  "keyword": "Then "
});
formatter.match({
  "location": "com.testinium.step_definitions.HomeStepDefs.arama_kutucuğuna_tıklanılır_ve_excelden_gömlek_kelimesi_alınarak_kutucuğa_yazılır_ve_enter_a_tıklanılır()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir",
  "keyword": "And "
});
formatter.match({
  "location": "com.testinium.step_definitions.SearchResultsStepDefs.sonuca_göre_sergilenen_ürünlerden_rastgele_bir_ürün_seçilir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seçilen ürünün ürün bilgisi ve tutar bilgisi txt dosyasına yazılır",
  "keyword": "Then "
});
formatter.match({
  "location": "com.testinium.step_definitions.SearchResultsStepDefs.seçilen_ürünün_ürün_bilgisi_ve_tutar_bilgisi_txt_dosyasına_yazılır()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seçilen ürün sepete eklenilir",
  "keyword": "And "
});
formatter.match({
  "location": "com.testinium.step_definitions.SearchResultsStepDefs.seçilen_ürün_sepete_eklenilir()"
});
formatter.result({
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d108.0.5359.124)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ege-macbook-pro\u0027, ip: \u0027fe80:0:0:0:1850:d7e6:d67:f13b%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002712.2.1\u0027, java.version: \u002718.0.1.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.124, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: /var/folders/3v/0zg12cg13c3...}, goog:chromeOptions: {debuggerAddress: localhost:62040}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1cc9ed244458c8149efd9fe9e4728acb\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.getAttribute(RemoteWebElement.java:134)\n\tat com.testinium.pages.SearchResultsPage.getTheBodySizeList(SearchResultsPage.java:86)\n\tat com.testinium.step_definitions.SearchResultsStepDefs.seçilen_ürün_sepete_eklenilir(SearchResultsStepDefs.java:35)\n\tat ✽.seçilen ürün sepete eklenilir(file:///Users/egeyelken/IdeaProjects/TestiniumBeymen/src/test/resources/HomePage.feature:14)\n",
  "status": "failed"
});
formatter.step({
  "name": "ürün sayfasındaki fiyat ile sepetteki fiyatın doğruluğu karşılaştırılır",
  "keyword": "Then "
});
formatter.match({
  "location": "com.testinium.step_definitions.SearchResultsStepDefs.ürün_sayfasındaki_fiyat_ile_sepetteki_fiyatın_doğruluğu_karşılaştırılır()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "ürün adeti arttırılarak ürün adedinin iki adet olduğu doğrulanılır",
  "keyword": "Then "
});
formatter.match({
  "location": "com.testinium.step_definitions.SearchResultsStepDefs.ürün_adeti_arttırılarak_ürün_adedinin_iki_adet_olduğu_doğrulanılır()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "sepetten ürün silinerek sepetin boş olduğu kontrol edilir",
  "keyword": "And "
});
formatter.match({
  "location": "com.testinium.step_definitions.SearchResultsStepDefs.sepetten_ürün_silinerek_sepetin_boş_olduğu_kontrol_edilir()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});