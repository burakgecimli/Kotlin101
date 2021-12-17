fun main() {

    /*
    •Switch yapısının adı değişmiş halidir.
    •else if yapısının daha pratik kullanımıdır.
    •Case denilen durumlar sağlanırsa kod çalışır.
     */

    var day: Int = 4
    when (day) {
        1 -> println("Pazartesi")
        2 -> println("Salı")
        3 -> println("Çarşamba")
        4 -> println("Perşembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Hatalı Değer")
    }
}