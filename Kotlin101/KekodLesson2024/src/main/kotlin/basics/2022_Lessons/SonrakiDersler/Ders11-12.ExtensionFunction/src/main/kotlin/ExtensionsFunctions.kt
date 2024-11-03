fun main() {

    /*
       Excention Function: Üzerinde değişiklik yapamadığımız sınıflar,(Kotlin'in built-in sınıfları) veya bizim kendi yazdığımız
       sınıflar veya değişkenlerin, içeriğini bozmadan eksta özellik katmak için fonskiyon yazmamıza olanak sağlayan fonksiyonlardır.
       Kelime anlamı olarak uzantı anlamına gelir yani bir sınıfı modifiye etmiyoruz da olan sınıfı içeriğini
       koruyarak ekstra özellik kazandırmış oluyoruz.

     */

    /**
     * Extension fonksiyon yazarak o sınıfa bir üye fonksiyon yazmış oluyoruz.
     * Bunu yaparken unutmamız gereken; yazdığımız extension function aslında o sınıfın gerçek bir fonksiyonu olmayacaktır.

     * Not:Extension fonksiyonlar statik olarak tutulurlar yani hafızada yer kaplarlar
     * Statik olarak tutuldukları için de ayrı bir fonksiyon yazılmış gibi davranış gösterirler.

     * --- Neden extension functionlara gerek duyarız? ---
     * Bunun cevabı olarak bir sınıf yazdığımızı düşünelim bu sınıfın içeriği ne kadar büyürse yönetilmesi o kadar zor olacağından
     * extension function kullanarak, sınıf dışında, sınıfa ait bir üye fonksiyon yazmış olarak sınıfımızı daha yönetilebilir yapmış oluruz.

     * Bir sınıf içerisinde extension fonksiyon yazdığımızda artık sadece o sınıf içerisinden ulaşılabilir duruma gelir bizim için.
     * Ve de sınıfımızı receiver olarak adlandırırız.
     *
     * fun Type.funcName(parameters):ReturnType şeklinde yazılır.
     */


    val pi: Double = 3 + 0.14
    println(pi)

    val schoolNumber: Int = 1341
    println(schoolNumber)

    val tcIdentityNumber: Long = 15657621343456
    println(tcIdentityNumber)

    //Yukarıdaki kullanımlar yerine bir log adında extension funciton yazarak kullanım sağlayabiliriz.

    3.log()  //Burada Number sınıfına bir extension yazdık.Daha sonra olşturduğumuz değerler üzerinden direkt bu fonksiyonu çağırdık.
    7.6.log()
    sum(12, 4)

    //--------------------------------------------------------------------------------------------------------------------------------------

    5 extInfixMethodLog "sayısıdır" //Burada ise yazmış olduğumuz infix extension functionu çağırma işlemi yaptık
    12 extInfixMethodLog "sayıdır"

}


fun sum(a: Int, b: Int) {
    (a + b).log() // Burada fonksiyoni içinde de bu şekilde kullanabiliriz.
}


fun Number.log() {
    println(this)
}


// Burada receiver Number sınıfı oluyor.Fonksiyonumuz "extInfixMethodLog" adında bir infix extension functiondur.
// this ifadesi extension yapılan değeri verir. x.Log() yazarsak x'i verir.
infix fun Number.extInfixMethodLog(value: String) {
    println("$this $value")
}

//--------------------------------------------------------------------------------------------------------------------------------------

/**
 *      Infix extension fonksiyon expression formunda kullanilabilir.
 * **/

infix fun String.extPlus(otherString: String): Int = this.toInt() + otherString.toInt()


