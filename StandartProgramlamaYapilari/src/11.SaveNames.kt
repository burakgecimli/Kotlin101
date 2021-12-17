import java.util.*

fun main() {
    /*
    5 kişinin ismini konsoldan girerek kayıt işlemi yapınız ve girilen isimleri ekranda gösteriniz.
    */

    val arrNames = Array<String>(5) { " " }
    println("İsim Giriniz")


    for (sayac in 0 until arrNames.size) {
        val input = Scanner(System.`in`)
        arrNames[sayac] = input.next()
    }

    println(arrNames.contentToString())

    for ((index, names) in arrNames.withIndex()) {

        println("${index + 1}.isim $names")
    }

    var sayac = 0
    while (sayac < arrNames.size) {
        val input = Scanner(System.`in`)
        arrNames[sayac] = input.next()
        sayac++
    }

    println(arrNames.contentToString())

    for ((index, names) in arrNames.withIndex()) {

        println("${index + 1}.isim $names")
    }


}


