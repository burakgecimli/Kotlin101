package basics.kekod2022.lesson07

import java.util.*

fun main() {

    /**
     * switch case lerin yerine kotlinde when yapisi kullanilir..
    when(karsilastirilacak ifade) {
    value1, value2 -> {}
    value3 or value4 -> {}
    value -> {}
    else -> {}
    }
    formatiyla kullanilir.
     * Yine {} arasina tek satir kod yazilacaksa bu durumda {} leri kullanmayabiliriz.
     * "tr","az" gibi aynı kodu çalıştıracak case'ler varsa araya virgül koyarak kullanılabilir.
     * Bu veya kullanımı yapmayı sağlar."tr" veya "az" gibi
     * when caseleride if caseleri gibi expression olarak kullanilip sonucu bir degiskene atilabilir.
     */

    println("Enter a code of country")
    val countryCode = readLine()!!

    when (countryCode.lowercase(Locale.getDefault())) {

        "tr", "az" -> println("Turkish Citizien")
        "ar" -> println("Arab Citizien")
        "fr" -> println("French Citizien")
        "uk" -> println("United Kingdom Citizien")
        else -> println("Invalid Code")
    }

    println("Enter a number of days")
    val dateNum = readLine()!!.toInt()

    val result = when (dateNum) {
        1 or 9 -> "Monday"
        2, 66 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }

    println(result)

    println("Kod giriniz")
    val countryCod = readln()
    when (countryCod.toInt()) {
        2.and(3) -> println("tc")
        1 or 5 -> println("az")
    }


    /**
     * when"in yanina karsilastirma ifadesi eklemeden , bunu caselerin yaninada ekleyebiliriz.
     * bunun artisi && || and or xor gibi ifadeleride kullanabilmemizi saglar
     */

    // is !is ile bir clas in referansi olunup olunmadigi kontrolu yapilabilir
    val phoneNumber = 531213451343L
    when (phoneNumber) {
        is Long -> {
            println("Long Value")

        }

        !is Long -> println("Long Value Değil")
    }

    //range leri in !in seklinde kontroulu yapilabilir.
    val number = 2
    when (number) {
        in 0..10 -> println("ff") // 0 10 arasindaysa
        in 11..20 -> println("bb") // 11 20 arasindaysa
        !in 0..10 -> println("cc") // 0 10 arasinda degilse
    }


    /*

    println("Notunuzu giriniz")
    val note: Int = readln().toInt()

    when (note) {
        in 85..100 -> {
            println("Notunuz:$note= AA")
        }

        in 70..84 -> {
            println("Notunuz:$note= BB")
        }

        in 50..69 -> {
            println("Notunuz:$note= CC")
        }

        in 35..49 -> {
            println("Notunuz:$note= DD")
        }

        else -> println("Kaldınız:(")
    }

     */


}