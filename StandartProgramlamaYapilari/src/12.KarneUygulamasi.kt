import java.util.*

fun main() {
    /*
     5 adet dersin adı ve notu konsoldan girilecek. Karne şeklinde çıktı alınacak ,ortalama hesaplanacak ve ortalama 50’ye eşit veya üzerindeyse
     geçti diğer durumda kaldı mesajı verecek.
     */

    val input = Scanner(System.`in`)
    val dersler = Array(5) { "" }
    val notlar = Array(5) { 0 }
    var toplamNot = 0
    var ortalama = 0

    var sayac = 0
    while (sayac < dersler.size) {
        println("${sayac + 1}.dersi giriniz")
        dersler[sayac] = input.next()

        println("${sayac + 1}.notu giriniz")
        notlar[sayac] = input.nextInt()
        toplamNot = toplamNot + notlar[sayac]

        sayac++
    }
    ortalama = toplamNot / sayac


    for (j in 0 until dersler.count()) {
        println("${dersler[j]}: ${notlar[j]}")
    }

    println("------------------------")
    println("Ortalamanız:$ortalama")
    if (ortalama >= 50) {
        println("Geçtiniz")
    } else
        println("Kaldınız")


}