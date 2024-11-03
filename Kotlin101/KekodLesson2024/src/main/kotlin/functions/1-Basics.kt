package functions

import basics.User
import java.util.*

/**
 * fun keywordu ile fonksiyonlar baslar.
 * fonksiyon ismi verilir.
 * parametre parantezleri acilir ve parantezler girilir.
 * : operatoru ve geri donus degeri yazilir.
 * fonksiyon bodysi acilir ve kapanir.
 * Geri donus degeri verilmeyen fonksiyonlar Unit tipini geri dondurur.
 */

fun main(): Unit {

    // Fonksiyon çağrılırken ismi ve parametreleri kullanılır.
    // Eğer bir geri dönüşü varsa bir değişkene atanabilir.

    takeSquare()
    takeSquare(2)
    takeSquare(number = 5)


    val squareValue = takeSquare(2)
    println(squareValue)

    /* ---------------------------------------------------------------------------------------------------- */

    // Bir class'ın fonksiyonunu çağırırken iki nokta işaretini kullanırız.
    Math.pow(2.0, 3.0)


    /* ---------------------------------------------------------------------------------------------------- */



    reformatMessage("mesage", true, 7, "eng")
    //Örneğin isUpperCase bilgisini vermek istemeyelim.Aşağıdaki gibi paramtre sırası karışacaktır.
    // reformatMessage("işfidşf",7,"tr")

    //Bunun için name argument kullanıyoruz.
    reformatMessage("Hello Name Argument", size = 7, lang = "tr")

    reformatMessage(message = "message", size = 7, lang = "eng") //siralama kaydigi icin name argument kullandik.
    reformatMessage("message", true, 7)
    reformatMessage("message", size = 7)

    /* ------------------------------------------------------------------------------------------------------------------------- */


    //  vaarag kullanımına örnek,key=1 önceki parametreler vararg parametresine karşılık gelir.
    //  Burada key parametresini vararg'a karşılık gelmediğini belirterek name argument şeklinde vermeliyiz.
    getUserInfo1("hello", "one", "two", "", key = 1)  // Jvm de Array  dönüştürülür.

    // Not:name argument kullanmadan vermeye çalışırsak; "getUserInfo1("hello", "one", "two", 1)" gibi, key değerini de vararg'a vereceğimizi düşünürek
    //  type missmatch hatasını alırız.

    //  vararg parametresi olarak arrayOf kullanılmak istenirse * operatörü eklenmelidir.(spread operatörü)
    //  bu operatör diğer dillerde ki pointer kullanımı anlamına gelmez.Kotlin'de pointer yoktur.
    getUserInfo1(*arrayOf("boo", "foo", "", ""), key = 2)

    // Jvm de String...  dönüştürülür.
    getUserInfo2(1, "java", "kotlin", "", "javascript")

    getUserInfo3("", "", "hello", "")

}


/**
 * = ile default değeri olan parametrelerde tanımlayabiliriz.
 *  Default değeri ataması yapmak function/method overload yapmamızı sağlar.
 *  Böylece tekrar aynı fonksiyonun farklı varyasyonlarını yazmak durumunda kalmayız.
 *
 *  Default parametresi olan değerlere fonksiyonu çağrırken değer atamak zorunda değiliz.
 *  Default değeri olan parametreler opsiyoneldir.
 *  Default değeri olan parametrelere değer atanmadan fonksiyon çağrılacaksa bu durumda parametre sırası değişir
 *  Ide'ye hangi parametreye değer ataddığımızı söylemek için opsiyonel parametrelerde "Named Argument" kullanmalıyız.
 *
 */

fun reformatMessage(message: String, isUpperCase: Boolean = false, size: Int, lang: String = "tr") {

    val locale = if (lang == "tr") {
        Locale("Tr", "tr")
    } else {
        Locale.ROOT
    }

    val localMessage = if (isUpperCase) {
        message.uppercase(locale)
    } else {
        message.lowercase(locale)
    }

    println("Message: $localMessage")
}


/**
 * @param number değişken tanımlanır gibi tanımlanır.
 * Fonksiyon parametresi tanımlanırken,val var gibi betimleyiciler kullanılmaz
 */
fun takeSquare(number: Int = 4): Int {
    //  Some operation

    return 2 * number
}


//-----------------------------------------------------------------------------------------------------------------------------

/**
 *  Default değeri olan parametrelere sahip bir fonksiyon Java sınıflarından çağrılacaksa eğer,
 *  Bu fonksiyona @JvmOverlods annotation'i verilmelidir.Böylece yazılan kod JVM'e hazır hale getirilken,
 *  ilgili fonksiyonun tüm varyasları yazılır(overload edilir)
 */

@JvmOverloads
fun print(message: String = "Message") {

    println(message)
}
//-----------------------------------------------------------------------------------------------------------------------------
/**
 *  Extend edilebilir bir sınıf, yavru (child) sınıf tarafından miras (inherit) alınırsa ve bu sınıfın override edilebilir open bir
 *  methodu varsa bu method default argument'e sahip olursa, bu sınıfı miras alan sınıfda method override edilirse,
 *  override edilen methodun parametresine default argument tanımlanamaz.
 *
 * Üst sınıfın methodunda ki default argument geçerli olur.
 *
 */

open class A {
    open fun foo(i: Int = 10) {
    }
}

open class B : A() {
    override fun foo(i: Int) {
        // no default value allowed
    }
}


//--------------------------------------------------------------------------------------------------------------------------

/**
 * Cok uzun sayida parametremiz olacaksa "variable number of arguments"- vararg tanimlanabilir.
 * Vararg parametre sayisi belli olmayan durumlarda kullanilir.
 * Parametre sayisi cok fazla oluyor diye kullanmamiz gereken bir durum degildir.
 * Bu sayede fonksiyon tek bir parametre aliyor gibi gozukurken,kendisine cok miktarda degisken alabilir.
 * Bu degiskenlere array'e erisir gibi erisebiliriz. " [index]" ya da .get(index) seklinde.
 */

/**
 * vararg tek ya da son parametre olarak yazilirsa,Jvm'e hazirlanirken,javadaki "String.. " gibi ayni kod derlenir.
 * Ancak vararg parametresi birden fazla tanimlanirken,ortada ya da basta yer alirsa,Jvm'e hazirlanirken Array'e donusturulur.
 * Bu kullanımda hangi tipte bir vararg kullanıyorsak arka planda o tipte array'e donusturulur..
 * Bu da performans farki olusturur demektir.
 * Bu performans farki  dert edilmeyecek bir farktir.
 * Ama mülakatta show yapmak istiyorsak,
 * Akademik levelda ,String.. 'lı kullanım Array'li kullanıma gore ufak da olsa daha performansli olacaktir diyebiliriz :)
 */


//Jvm de array'e dönüştürülür.
fun getUserInfo1(vararg userInfo: String, key: Int) {
    userInfo[3]
    userInfo.get(3)
}

//Jvm de String...  dönüştürülür.
fun getUserInfo2(key: Int, vararg userInfo: String) {
    userInfo[3]
    userInfo.get(3)
    println(key)
}

fun getUserInfo3(vararg userInfo: String) {
    userInfo[3]
    userInfo.get(3)
}


/**
 *  Aynı fonksiyon içinde birden fazla vararg tanımı yapılmasına izn verilmez.
 *  Çalışmaz. Commenti kaldır kontrol et isterse
 */

/*
fun getUserInfo(vararg userInfo: String, vararg userInfo2: String) {
    userInfo[3]
   // Multiple vararg-parameters are prohibited
}
 */


/* ----------------------------------------------------------------------------------------------------------------------- */

/**
 *  Bir fonksiyona = koyularak da returne edeceği yazılabilir.(Single-Expression) kullanımı
 *
 */

val userList = arrayOfNulls<String>(5)
fun getListCount(): Int = userList.size

fun getListCount2(): Int {
    return userList.size
}

















