package basics

/**
 * Kotlin'de her şey bir nesnedir. Öyle ki herhangi bir değişkende üye fonksiyonlari ve özellikleri çağırabilirsiniz.
 * Diğer programlama dillerinden aşina oldugunuz ilkel veri tipleri (primitive types) Kotlin'de birer sinif (class) gibi görünürler.
 * Buna rağmen çalışma zamanında sinif (class) olmayan ilkel (primitive) hallerine optimize edilirler.
 * Bu primitive tiplerden değişkenler oluşturduktan sonra "Show Kotlin Bytecode" özelliği ile Java'daki halleriyle karşılaştırabiliriz.
 *
 * Bu değişken tipleri aşağıdakiler gibidir.
 *
 * Numbers ve onlarin Unsigned muadilleri.
 * Booleans
 * Characters
 * Strings
 * Arrays
 */


/**
 * Bir değişken oluşturmak için "val" ya da "var" kelimelerinden istifade edilir.
 * val = "Degeri sonradan değiştirilemez, değişken" "Value" sabit kelimesinin kısaltmasıdır.
 * var = "Degeri sonraden degistirilebilir, değişken" "Variable" değişken kelimesinin kısaltmasıdır.
 * val değişkenlere genelde immutable dendiğini duyarsınız. Fakat bu yanlış bir ifadedir.
 * Çünkü:
 * readonly demek ilk değer atamasından sonra tekrar değer atanamaz demek.
 * immutable ise bir değişkenin nesnenin durumu asla ilk degerden farklı olamaz demek.
 * Asagidaki calculate Avaliable Space() fonksiyonunu inceleyebilirsiniz bunun için.
 * val olarak tanımlanan avaliableSpace değişkenin değǝri her seferinde farklı sonuç üretmektedir.
 * Respect: https://xabaras.medium.com/kotlin val is read only not immutable 585ce2e5357b
 *
 * --------------------------------------------------------------------------------------------------------
 *
 * val değişken ile var değişken arasında bir performans farkı bulunmuyor denebilir.
 * Yine de akademik seviyede konuşuyorsak, var değişkenler bir "readonly" gibi şarta sahip olmadıkları için
 * gözardı edilebilecek kadar ufak bir farkla val değişkenlere göre performanslıdır.
 *
 * Bunun yanında eğer yazdığınız proje multi-thread islemler gerçekleştiriyorsa, bu islemlerde kullanılan değişkenlerin
 * birbirlerinin son durumlarını kontrol etme ihtiyacının yarattığı maliyet çok daha ciddi performans sorunlarina yol açmaktadır.
 * Bu sebeple genel kabul (best-practice) olarak val değişkenlerin var deg skenlerden daha performansli olduğu söylenebilir.
 * Tüm bu sebeplerle bir değişken tanımladığınızda önce val olarak tanımlamanız, sonrasında başka bir yerde bu değişkenin değerini
 * değiştirecekseniz eğer var yapmanız pek çok açıdan daha kullanışlıdır.
 */


/**
 * Soru: Bir class in üye değişkenini var olarak tanımlayıp, bu değişkenin önündəki var kelimesini değiştirmeden
 * nasıl val yapabileceğiniz bizlere sorulur.
 * Bunun  yolu var değişkenin get fonksiyonunu private yapmanızdır. Bu durunda, değişken var olsada readonly hale dönüşür.
 * Asagidaki testUser() fonksiyonunda bunu test edebilirsiniz.
 */

class User {
    var name: String = "Burak"
    var surName: String = "Geçimli"
    var id: Int =
        1  //"var" ile tanimlanan bu değişkeni "val" yapmak için "private set" yaparak değer atamamanın önüne geçildi.
        private set
}

fun testUser() {
    val user = User()
    user.name = "Ahmet"
    user.surName = "Gümüş"
    //  user.id = 2 kod çalışmaz

}

/**
 * Not: var değişkeninin set ini neden private yapma gereği duyarız? sorusunun cevabı ise bir üye değişken kendi classı içindeki bir
 * fonksiyonda bir takım işlemlere tabi tutulup değeri değiştirebilir. Ama bu değişkeni dışarıdan da gizlemek isteyebiliriz.
 */


class Example {
    var price: Int = 100
        private set

    fun changePrice() {
        price = 200
    }
}

fun main(args: Array<String>) {


}

class Box {

    var width: Int = 20
    var height: Int = 40
    var length: Int = 50
    var usedSpace: Int = 0

    val avaliableSpace: Int
        get() {
            return (width * height * length) - usedSpace
        }
}

fun calculateAvaliableSpace() {
    val box = Box()
    box.height = 10
    box.width = 20
    box.length = 5
    box.usedSpace = 2
    println(box.avaliableSpace)

}

//Test function

fun createName(): String {
    val name: String = "Burak"
    return name
}










