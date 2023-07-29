fun main() {
    /**
     * Extension fonksiyonlar bir sınıfın içinde yazıldılarsa kullanım alanı sadece o sınıfın içerisinde olacaktır.
     * Sınıfın dışından Global çağırım yapılamaz.
     * Int.extToString() metodu Shape sınıfına yazılmıştır dolayısı ile Shape sınıfı dışında erişilemez.
     */

    // 34.extToString() Bu kod hata verir extToString Shape classında olduğu için erişim yapamayız.

    //Yine de extension methodu veren aşağıdaki a() gibi bir method ile erişilebilir.
    val shape = Shape()
    shape.setNumber(12)
    shape.a()


}

open class Shape {

    var intNumber = 0

    fun setNumber(intNumber: Int) {
        this.intNumber = intNumber
    }

    fun a() {
        intNumber.extToString()

    }

    //---------------------------------------------------------------------------------------------------------

    /**
     * Bir sınıfın içinde farklı bir sınıfa ait extension function yazılırsa, bu sınıfın içinde aynı
    isimde normal bir fonksiyon olsa bile extension function içinde aynı isme sahip fonksiyon çağrılırsa
    bu extensiona işaret eder demektir.

     * Sınıfın aynı isimdeki üye fonksiyonunu extension fonksiyon içerisinde çağırmak için
     * this@Sınıfİsmi.uyeFonksiyon() şeklinde çağırım yapılmalıdır.
     *
     */

    open fun Int.extToString() {
        println("")

        // Int.extToString() methodunu isaret eder.
        extToString()

        this.extToString()
        //aslinda shape class icinde gibidir ama buradaki this Int classini isaret eder.
        // Cunku extension fonksiyon scope'u icindeyken receiver class icindeyizdir.
        // Normal functionda this icerisinde bulundugu classi isaret ederdi.
        //ama biz bu extToString i sadece Shape class i icinde kullanabiliriz. Butun projede kullanmayiz.
        //butun projede ext fun kullanmak istiyorsak kt dosyasinda class disinda yazmamiz gerekiyor.


        // Shape'e ait asagidaki sekilde uye methodu isaret ederiz.
        this@Shape.extToString()

        println("Awesome class printi")
    }


    fun extToString() {
        println("Keko class printi")
    }

}

//-------------------------------------------------------------------------------------------------------------


/** Bir sınıf, kendinden turetilmis disarda yazilmis extension fonksiyonun
aynisini (isim ayni, parametre sayisi ve tipleri ayni, ayrica geri donus tipi de ayni olmali),
kendi icinde barindiriyorsa, bu durumda yazilan extension fonksiyon gecersizdir asla calismaz.
Daima Sinifin uye fonksiyonu cagirilir.
*/
fun Shape.setNumber(intNumber: Int) { //pratikte ext ederek shape class i icinde old icin shape in private degiskenine bile erisebliriz.
    val result = intNumber * intNumber //fakat bu ext func gecersizdir. yok hükmündedir. classin kendi fonksiyonu calisir.
    println(result)
}

//---------------------------------------------------------------------------------------------------------------
/**
 * Bir sinifa extension fonksiyon yazilabildigi gibi extension property de yazilabilir.
 * Bunun sebebi aslinda property'lerin ozunde bir fonksiyon olmasidir.
 * Bu extension property'lerin icerisinde field tanimlanamaz. Yani deger atanamaz.
 * Dolayisiyla aslinda gercek anlamda bir degisken extension yapilamaz.
 *      Bu konu property vs field konusu ile beraber sinif'lar islenirken detayli anlatilacaktir. (onemli!!)
 *      Aslinda biz kotlinde degiskenlerin fieldina erisemiyoruz, fielda erisen get ve set methodlarina
 *      erisiyoruz. Bu fieldlara backing field denir.
 * **/
var Shape.type
    get() = "Rectangle"
    set(value) {
        type = value
    }


//--------------------------------------------------------------------------------------------------------

/**
 *  Open (Extend edilebilir) bir sinifa, sinifin icinde bir open (override edilebilir) extension fonksiyon yazilirsa,
 *   bu sinifi miras (inherit) alan siniflar, ilgili extension fonksiyonu override edebilirler.
 * **/
class Rectangle : Shape() {
    override fun Int.extToString() {
    }
}

class Triangle : Shape(){
    fun deneme(){
        4.extToString()
    }
}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *   NOTES :
 * Nullable extension function da yazilabilir.
 * Companion object'lere de extension yazilabilir. Siniflar'da ornegini yapacagiz.
 * **/

