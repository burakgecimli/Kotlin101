package functions

/**
 *  Üzerinde değişiklik yapamadığımız (readOnly)(Kotlin built-it class) sınıflara,ya da yapmak istediğimiz sınıflara,
 *  bu sınıflara, bu sınıfların içerisinde yazmadan fonksiyon tanımlamamızı sağlar.
 *  Böylece o sınıfa üye bir fonksiyon kazandırabiliriz.
 *  Bunu yaparken unutmamız gereken yazdığımız extension function aslında o sınıfın gerçek bir fonksiyonu olmayacaktır.
 *  Extension fonksiyonlar statik olarak tutulurlar yani hafızada yer kaplarlar.
 *  Statik olarak tutuldukları için de ayrı bir fonksiyon yazılmış gibi davranış gösterirler.
 *  Receiver(alıcı) olarak adlandırdığımız bir sınıfa ihtiyaç duyar.Receiver extension yazacağımız sınıfı ifade eder.
 */

//  Show Kotlin Bytecode incelendiğinde Java da bunu yapmak için statik bir fonksiyon yazıyorduk,
//  Bu fonksiyonun ilk parametresi hangi classı extend etmek istiyorsak o classın instance içeriyordu
//  ikinci parametre ise o classın instance ve kullanmak istediğimiz parametreyi içerir.


fun main() {
    val pi: Double = 3 + 0.14
    println(pi)

    val schoolNumber: Int = 1345
    println(schoolNumber)

    val tcIdentityNumber: Long = 78320520
    println(tcIdentityNumber)

    println("----------------")

    //  Yukarıdaki kodlar da print işlemi tekrar edilmiştir.
    //  Bu yüzden yukarıdaki kullanımların yerine normal bir log2 fonksiyonu yazılabilir.
    log2(pi)
    log2(schoolNumber)
    log2(tcIdentityNumber)
    println("------------------")


    //  Yukarıdaki kodlar da print işlemi tekrar edilmiştir.
    //  Yukarıdaki değişkenler incelendiğinde üç değişkende Number classından extend edilmiştir.
    //  Bu çıkarımlara göre Number classına bir extension function yazabiliriz.

    pi.extensionLog("")
    schoolNumber.extensionLog("")
    tcIdentityNumber.extensionLog("")
    println("--------------------")


    println(5.extPrint())

    println("10".extPlus("10"))


    println(4.getName())



}

fun Int.extPrint() = this.toFloat()

infix fun String.extPlus(otherString: String): Int = this.toInt() + otherString.toInt()


//Normal Fonksiyon

fun log2(number: Number) {
    println(number)
}

infix fun Number.extensionLog(emptyParam: String) {
    println(emptyParam + this)
}

fun Number.getName()="Number ext fun"


