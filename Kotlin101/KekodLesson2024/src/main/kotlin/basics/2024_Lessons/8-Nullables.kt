package basics

import java.util.*

/**
 * Bir değişkene null değer atamasi yapabilmek için degisken tipinin sonuna ? işareti konulur.
 * Eğer bir değişkene tip verilmez ve direkt null değer ataması yapılırsa,IDE tip cikarimi yaparken
 * bu değişkenin degerini Nothing? olarak isaretler.Cunku hangi tipe karşılık geldiğini  bilemez.
 */


fun main() {
    val name: String? = null
    val age: Int? = null

    val number = null // Tipi Nothing? dir.

    val nameLower = name?.lowercase(Locale.getDefault())
    println(nameLower)


    var result: Int? = 0
    result?.plus(324) // Null ise çalıştırma null değilse çalıştır
    result!!.plus(324) // Ne olursa olsun çalıştır.


//-------------------------------------------------------------------------------------------------------------------------------------
    /**
     * Elimizde nullable bir degisken varsa ve bu degiskenin methodlarindan birine ihtiyac duyacaksak ya da,direkt olarak kullanacaksak,
     * bu durumda ideye ya bu degiskenin null olmayacaginin garantisi !! operatoru ile vermek gerekiyor,
     * ya da null degilse calissin demek icin ?. operatorunu kullanmak gerekiyor.
     * Best Practice olarak debug modda çalışırken kodlarımıza !! seklinde yazmamiz Kotlin Null Pointer Exception hatasi almamizi saglar.
     * Bu sayede gozden kacan nullable degerleri bulabilmemizi saglar.
     * Ancak,canliya cikan projemizde,cok gerekli olmayan kisimlar icin,daha az onemli olan kisimlar icin ?.
     * daha onemli,kritik kisimlar icin !!. kullanmaliyiz.
     */


    /**
     *   // Exception : Uygulamamiz calisirken,hata alip uygulamanin cokmesi durumudur.
     *     // Genel olarak kritik durumlarda,kullanciya ciddi bir problem olacaksa !!. kullanmamiz daha mantiklidir.(Uygulamanin cokmesi daha uygundur)
     *     // Eger cok onemli bir durum degilse, ?. kullanabiliriz.
     */

    var number1: Int? = null
    var number2: Int? = null

    number1 = readLine()!!.toInt()
    number2 = readLine()!!.toInt()

    // Yukarıda readline() in null olamayacağını !! işaretleri ile söylediğimiz için alt satırda
    result = number1 + number2
    println(result)


    // Nullable kontrolünü böyle yapma...
    if (number1 != null && number2 != null) {
        result = number1 + number2
    }


}
