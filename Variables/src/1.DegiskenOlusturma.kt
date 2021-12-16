fun main() {

    /*
    •Modern diller hafızada saklanan değerleri değişkenler ile ifade etmektedir.
    •Değişkenler hafızada geçici olarak saklanan değerleri temsil eder.
    •Kotlin dilinde değişken için tür belirtmemize gerek yoktur.
    Not:Değişkenler kalıcı değildir.Programdan çıkıldığında değerler kaybolur. Kalıcı değerler için
    değişkenlerin değerleri diske yazılmalıdır.
    •Modern bir dil olan kotlin için kod satırı bittikten sonra ; koyulmasına gerek yoktur.
    •El alışkanılığı ile ; koysanız bile problem olmaz hata almazsınız.
    •Eğer tek satırda iki farklı kod yazmak istersek mecburen ; koymalıyız.
       var yas=34; println("Yaş=$yas")
     */
    println("-------------- Tür Belirterek Değişken Tanımlama ----------------------")
    var yas = 34
    println("Yaş=$yas")

    var sayi: Int = 20
    println("Sayı=$sayi")

    var isim: String = "Burak"
    println("İsim=$isim")


    //Bir öğrencinin adını ,yaşını ,boyunu ve adının baş harfininin tutulduğu değişken oluşturunuz.

    println("------------------------------------------------------")
    var name: String = "Burak"
    var age: Int = 23;
    var height = 178;
    var nameFirstLetter: Char = 'B'

    println("İsim:$name\nYaş:$age\nBoy:$height\nİsmin İlk Harfi:$nameFirstLetter")


    println("-------------------------------------------------------")

    //Bir şirketin ürünlerinin bilgilerinin tutulduğu ürünler tablosunu temsil eden değişkenleri oluşturunuz.

    var productId: Int = 3416
    var productName: String = "Kol Saati"
    var productAmount: Int = 100
    var productPrice: Double = 149.99
    var productProducer: String = "Rolex"

    println("Ürün Id:$productId\nÜrün Ad:$productName\nÜrün Miktar:$productAmount\nÜrün Fiyat:$productPrice\nÜrün Üretici:$productProducer")
    println("-----------------------------------------------------------")

    // String ifade içine ${} ifadesi kullanılarak işlem yapılabilir.

    var a=12
    var b=30
    println("$a ve $b sayılarının toplamı:${a+b} dir")



}