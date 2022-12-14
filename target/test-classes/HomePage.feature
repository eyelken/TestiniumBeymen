Feature: Beymen sayfasının açılması

  @wip
  Scenario: Beymen sayfası açılır
    Given kullanıcı Beymen sayfasına yönlendirilir
    When kullanıcı ilgili anasayfasını başarıyla açmıştır
    Then kullanıcı ekranda beliren cinsiyet seçimini yapar
    And kullanıcı çerezleri kabul eder
    And kullanıcı pop up'ı kabul eder
    Then arama kutucuğuna tıklanılır ve excelden şort kelimesi alınarak kutucuğa yazılır ve silinir
    Then arama kutucuğuna tıklanılır ve excelden gömlek kelimesi alınarak kutucuğa yazılır ve enter'a tıklanılır
    And sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir
    Then seçilen ürünün ürün bilgisi ve tutar bilgisi txt dosyasına yazılır
    And seçilen ürün sepete eklenilir
    Then ürün sayfasındaki fiyat ile sepetteki fiyatın doğruluğu karşılaştırılır
    Then ürün adeti arttırılarak ürün adedinin iki adet olduğu doğrulanılır
    And sepetten ürün silinerek sepetin boş olduğu kontrol edilir


