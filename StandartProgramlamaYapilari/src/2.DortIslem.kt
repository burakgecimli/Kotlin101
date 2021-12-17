import java.util.*

fun main() {
    println("Toplama:(1)")
    println("Çıkarma:(2)")
    println("Çarpma:(3)")
    println("Bölme:(4)")

    val input = Scanner(System.`in`)
    println("1.Sayıyı Giriniz")
    val number1 = input.nextDouble()
    println("2.Sayıyı Giriniz")
    val number2 = input.nextDouble()
    println("İşlemi Seçiniz")
    val changeOperation = input.nextInt()


    if (changeOperation == 1) {
        println("Toplam:${number1 + number2}")
    } else if (changeOperation == 2) {
        println("Çıkarma:${number1 - number2}")
    } else if (changeOperation == 3) {
        println("Çarma:${number1 * number2}")
    } else if (changeOperation == 4) {
        println("Bölme:${number1 / number2}")
    } else {
        println("Hatalı İşlem")
    }
}