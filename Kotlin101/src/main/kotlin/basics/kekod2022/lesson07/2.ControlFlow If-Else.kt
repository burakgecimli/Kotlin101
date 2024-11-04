package basics.kekod2022.lesson07

import java.io.IOException

fun main() {


    /**
     * if else case lerinden sonra suslu parantez acilir ve kapanir
     * ancak bu suslu parantezler arasina tek satir kod yazacaksak suslu parantez kullanmak zorunda degiliz
     * if else caselerinin state ve expression olmak uzere 2 kullanimi vardir
     * State kullanimi sadece if else kullanarak sartli durumlarimizi kodlamaktir.
     *  expression kullanimi ise bir value ya deger olarak esitligin karsi tarafina if else kodlarimizi yazariz
     *  expression olarak yapilan kullanimda, if else bloklari icindeki en son satir degiskene deger olarak verilir.
     */


    println("Öğrenci misiniz?")
    val result = readLine()!!
    println(result)


    //State Kullanımı
    if (result.contains("Evet", ignoreCase = true)) {
        println("Öğrenci")
    } else {
        println("Öğrenci Değil")
    }

    //expression kullanimi.{} içerisindeki son satir,değer olarak değişkene atanır.

    println("Sınava Girdin mi")
    val isEnter: String = readLine()!!
    val result1 = if (isEnter == "Evet") {
        "Girildi"
    } else {
        "Girilmedi"
    }

    println(result1)


    //  Örneğin basitçe aşağıdaki gibi bir Android kodu olduğunu düşünelim.


    /*
    if (sex == "male") {
        textview.text = "Beyfendi"
    } else {
        textview.text = "Hanımefendi"
    }
------------------------------------------------------------------------------------------------------------------------
    textview.text = if (sex == "male") {  Expression kullanımının daha temiz bir kullanım olduğu görülür.textview öğesine iki kez erişmek yerine bir kez eriştik.
        "Beyfendi"
    } else {
        "Hanımefendi"
    }

     */

// ---------------------------------------------------------------------------------------------------------------------
    /**
     * Kotlin de if elselerin Expression kullanimindan oturu ternary operatoru yoktur
     * Ternary yerine asagidaki gibi kullanim yapabliriz.
     */
    val isStudent = false
    val isStudent2 = if (isStudent) "yes" else "no"


    /*
     * else if lerden olusan bloklarda kullanabiliriz. farkli kosullari bu bloklarda kullanabilirz
     * her zaman iki secenegimiz olmaz 4 5 6 secenek varsa else if leri if case ekleyebiliriz
     * harf notu hesaplamasi orneginde kullanabiliriz en bariz ornek
     */

    println("Final notunuzu giriniz")
    val grade = readLine()!!.toDouble()

    if (grade <= 100 && grade >= 85) {
        println("AA")
    } else if (grade < 85 && grade >= 70) {
        println("BB")
    } else if (grade < 70 && grade >= 55) {
        println("CC")
    } else if (grade < 55 && grade >= 40) {
        println("DD")
    } else {
        println("Sen Okulu Bırak :)")
    }

    // true && true = true
    // true && false = false
    // false && false = false
    // false && true = false

    // true || true = true
    // true || false = true
    // false || true = true
    // false || false = false


    /*
     * else if ile alt alta if if if yazmak arasindaki fark nedir?
     * else if de dogru kontrol bulununca  alttaki caseler calistirilmaz
     * ama alt alta if if if caseleri yazilirsa hepsi calisacaktir.
     * Else if li bir case yaziyorsak farkli bir seyi kontrol etmeyiz ayni seyi kontrol ederiz.
     * birbirinden farkli durumlari kontrol eden caselerde Alt alta if ile kontrol etmeliyiz.
     */

    /**
     * .equals,  ==  ile karsilastirma yaparken once tipler karsilastirilir tipler uymuyorsa hata verir
     */

    //  if(10 == 10L) {} bu kod calismaz quiz sorularinda gelebilir. Bu kod derlenmez.

    //------------------------------------------------------------------------------------------------------------------


    /**
     * bazi durumlarda if else yazmaktansa, if caseini yazip return ya da throw gibi kodun devam etmesini bozabiliriz
     * kod calisirken bu if case ine girmezse devam eden kod blogu calisir
     * bu da pratikte else case i demek olur. Bu sekkilde kodu biraz daha temiz gosterecektir.
     */
    if (isStudent) {
        println("Student")
    } else {
        otherMethod()
    }


    if (isStudent) {
        println("Student")
        throw IOException()
        //return
    }
    var score = 10
    if (score == 100) {
        return
    }
    otherMethod()
}



private fun otherMethod() {

}
