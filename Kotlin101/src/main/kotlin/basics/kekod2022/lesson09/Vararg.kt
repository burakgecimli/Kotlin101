package basics.kekod2022.lesson09

fun main() {

    // vararg kullanımına örnek. key = 4 den önceki parametreler vararg parametresine denk gelir.
    getUserInfo("Gökhan", "Öztürk", "İstanbul", "Türkiye", "", "", key = 4)

    //vararg parametresi olarak arrayOf kullanmak istenirse * operatoru eklenmelidir. (spread operatoru)
    getUserInfo(*arrayOf("ahmet", "ahmet", "atmaca", "istanbul", "caddebostan", "sirlisokak"), key = 5)

}

//VARARG
/**
 * Aynı tipte ve çok sayıda parametreniz olacaksa "variable number of arguments" = vararg tanımlanabilir.
 * Aynı fonksiyon içerisiinde iki kere vararg tanımlanamaz.
 * Aslında vararg bir arraydır.
 * Bu sayede fonksiyon tek bir parametre alıyor gibi gözükürken kendisine çok miktarda değişken atanabilir.
 * Bu değişkenlere array e erişir gibi erişebiliriz. [index] ya da .get(index) şeklinde.
 * vararg tek ya da son parametre olarak yazılırsa, jvm e hazırlanırken javadaki "String..." gibi aynı kod derlenirken
 * vararg  birden fazla parametre ile tanımlanırken ortada ya da başta yer alırsa, jvm e hazırlanırken, array'e dönüştürür.
 * Bu da performans farkı yaratır
 * İlla vararg kullanıyorsak tek veya sonda kullanmamız daha iyidir.
 */

fun getUserInfo(vararg userInfo: String, key: Int) { // Vararg başta ve ortada  kullanıldığı için Java da karşılığı arraydir.
    userInfo[3]
    userInfo.get(3)
}

fun getUserInfo2(key: Int, vararg userInfo: String) { // Burada sonda kullanıldığı için  Java daki karşılşığı String... şeklindedir.Bu daha performanslıdır.
    userInfo[3]
    userInfo.get(3)
    print(key)
}


//---------------------------------------------------------------------------------------------------------------------

/**
 * Geri dönüşü olan(Unit olmayan) tek satırlık,bir fonksiyona = koyularak da return edecegi deger yazilabilir.
 * (Single-Expression kullanimi)
 */

val userList = arrayOfNulls<String>(5)

fun getListCount(): Int = userList.size

fun getListCount2(): Int {
    return userList.size
}


/*---------------------------------------------------------------------------------------------------------------*/
/**
 *  Default değeri olan parametrelere sahip bir olan bir fonksiyon Java sınıflarından çağrılacaksa eğer
 *  Bu fonksiyonlara @JvmOverLoads annotation u verilmelidir.Böylece yazılan kod Jvm' e hazır hale getirilir.
 *  İlgili fonskyinun tüm varyasyonları yazılır.
 *
 *
 *
 * Javada yazılan kodu Kotlinde kullanabiliyoruz ikiside Assembly uzerinden makine koduna ceviriliyor
 * javada default tanimlama yoktur. legacy projelerde bu nasil cagirilacak
 * bu tarz default deger tanimlamalari javaya nasil tanimlayacagiz
 * @JvmOverloads annotation u kullanmamiz gerekiyor
 */

@JvmOverloads
fun printss(message: String = "Message") {
    println(message)
}

fun boo() {
    printss() //default olarak mesaj parametresi var
    printss("abcdef") //default parametreyi kullanmadık kendimiz parametre verdik
}

// ---------------------------------------------------------------------------------------------------------------

/**
     * Inheritance olan bir class ın fonksiyonunun default parametresi, child class da override edilirken değiştirilemez
     * Aşağıdaki örnekte foo fonksiyonunun parametresini değistiremiyoruz.Çünkü parametre defaut olarak verilmiş

 */
open class A {
    open fun foo(i: Int = 10) {

    }
}

class B : A() {
    override fun foo(i: Int) {
        //override fun foo(i: Int = 5){ no default value allowed hatasi verir }
    }
}





