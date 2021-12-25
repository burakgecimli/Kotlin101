package ArrayListOrnek

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val input = Scanner(System.`in`)

    var sayac = 1
    val ogrenciler = ArrayList<Ogrenci>()




    while (true) {

        println("Öğrenci Adı Giriniz")
        val ad = input.next()

        println("Öğrenci Sınıfı Giriniz")
        val sinif = input.next()

        val yeniOgrenci = Ogrenci(ad, sinif, sayac)
        sayac++

        ogrenciler.add(yeniOgrenci)



        println("Çıkış için (1) - Devam etmek için(Diğer Sayılar)")
        val sayi = input.nextInt()
        if (sayi == 1) {
            for (ogrenci in ogrenciler) {
                println("**************")
                println("Öğrenci Ad: ${ogrenci.ad}")
                println("Öğrenci Sınıf: ${ogrenci.sinif}")
                println("Öğrenci No: ${ogrenci.no}")
            }
            println("***************")
            println("Çıkış Yapıldı")
            break
        }

    }

}