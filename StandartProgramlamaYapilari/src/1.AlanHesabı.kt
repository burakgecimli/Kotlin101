import java.util.*

fun main() {

    println("Dikdörtgen Alanı:(1)  Çember Alanı: (2)")
    println("İşlem Seçiniz")
    val input = Scanner(System.`in`)
    val change = input.nextInt()
    if (change == 1) {
        println("Kısa Kenarı Giriniz")
        val kisaKenar = input.nextInt()
        println("Uzun Kenarı Giriniz")
        val uzunKenar = input.nextInt()
        val alan = kisaKenar * uzunKenar
        println("Alan: $alan")
    } else if (change == 2) {
        val PI = 3.14
        println("Çember Yarıçap Değerini Giriniz")
        val r = input.nextInt()
        val cemberAlan = PI * r * r
        println(cemberAlan)
    } else {
        println("Hatalı İşlem")
    }


}