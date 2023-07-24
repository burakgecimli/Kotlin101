    /**
     *   Fonksiyonlar "fun" keyword ile başlar.
     *   Fonksiyon ismi verilir.
     *   Parametre parantezleri açılır ve parantezler girilir.
     *   : operatoru ve geri dönüş değeri yazılır.
     *   Fonksiyon body'si açılır ve kapatılır.
     *   Geri dönüş değeri  verilmeyen fonksiyonlar Unit tipini geri döndürür.
     *   Unit = void      fun main(): Unit{ ... } seklinde tanimlanir ama tanimlamaya gerek yoktur.
     */


    fun main(args: Array<String>) {

        //   Fonksiyon çağrılırken ismi ve parametreleri kullanılır.
        //   Eğer bir geri dönüş değeri varsa bir değişkene atanır.

        /**
        Business logiclerin(isin yapilma mantigi) tekrarli sekilde cagrilmalari ve logiclerin kolay
        sekilde degistirilmesi icin kullanilir. aksi taktirde tek tek degistirmek zorunda kaliriz logicleri.
         */

        takeSquare(12)
        val squareValue = takeSquare(2)
        println(squareValue)

        //------------------------------------------------------------------------------------------------------------------

        // Bir class in fonksiyonunu çağırırken ise nokta isareti kullaniriz.
        Math.pow(1.0, 2.0)

        //------------------------------------------------------------------------------------------------------------------

        /**
         * Default degeri olan parametrelere sahip bir fonksiyon çağrılırken default degeri olan parametrelere deger atamak sart degildir.
         * Default degeri olan bu parametreler opsiyonel parametrelerdir.
         * Default degeri olan parametrelere deger atanmadan fonksyiyon çağrılacaksa bu durumda parametre sırası değisir.
         * Ide ye hangi parametreye deger atadigınizi söylemek icin opsiyonel parametrelerde Named Argument kullanmalısınız.
         */
        reformatMessage("mesage", true, 7, "eng")
        reformatMessage(message = "message", size = 7, lang = "eng") //siralama kaydigi icin name argument kullandik.
        reformatMessage("message", true, 7)
        reformatMessage("message", size = 7)


    }


    /**
     * Fonksiyon parametresi tanımlanırken val var gibi betimleyiciler kullanılmaz.
     */
    fun takeSquare(number: Int): Int {

        return number * number
    }
    //----------------------------------------------------------------------------------------------------------------------

    /**
    = ile default degeri olan parametrelerde  tanimlayabiliriz.(Default Argument)
    Default deger atamasi yapmak function/method overload islemi yapmanizi saglar.
    Tekrar tekrar ayni fonksiyonun farkli varyasyonlarini yazmak durumunda kalmayiz.
    Javada ayni fonksiyon farkli varyasyonlar ile yazilir.
     */

    fun reformatMessage(message: String, isUpperCase: Boolean = false, size: Int, lang: String = "tr") {}

    /**

     *
     *
     * BU DURUMA KOTLINDE FUNCTION OVERLOAD DENIR.
     * !opsiyonel parametreleri genelde sona yaz..
     * named argumentleri istedigimiz sirada verebiliriz.
     * method overloading; ayni isimdeki methodlarin ya parametre sayisi farkli ya da tipleri farkliysa overload etmektir.
     */

