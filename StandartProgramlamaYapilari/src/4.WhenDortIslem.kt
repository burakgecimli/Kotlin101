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



    when (changeOperation) {
        1 -> println(number1 + number2)
        2 -> println(number1 - number2)
        3 -> println(number1 * number2)
        4 -> println(number1 / number2)
        else -> println("Hatalı İşlem")
    }


}