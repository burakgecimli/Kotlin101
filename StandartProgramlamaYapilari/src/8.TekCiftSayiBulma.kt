import java.util.*

fun main() {

    println("Sayı Giriniz")
    val input = Scanner(System.`in`)

    while (true) {

        var number = input.nextInt()
        if (number == -1) {
            println("Çıkış Yapıldı")
            break
        } else if (number % 2 == 0) {
            println("Sayı Çifttir(Çıkış İçin -1 Basınız)")
        } else {
            println("Sayı Tektir(Çıkış İçin -1 Basınız)")
        }


    }
}