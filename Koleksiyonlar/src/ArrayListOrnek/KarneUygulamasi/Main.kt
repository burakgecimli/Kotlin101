package ArrayListOrnek.KarneUygulamasi

import java.util.*
import kotlin.collections.ArrayList

fun main() {

    val input = Scanner(System.`in`)
    val ogrenciler = ArrayList<NotHesapla>()
    var toplam:Double = 0.0


    while (true) {
        println("Ders giriniz")
        val ders = input.next()

        println("Not Giriniz")
        val not = input.nextInt()

        val nesne = NotHesapla(not, ders)
        ogrenciler.add(nesne)




        println("Çıkmak için 0 basınız")
        val sayi = input.nextInt()
        if (sayi == 0) {
            println("Çıkış yapıldı")
            for (o in ogrenciler) {
                toplam = toplam + o.not
            }
            val ortalama:Double = toplam / ogrenciler.size
            println("Ortalama: $ortalama")
            if (ortalama>50){
                println("Geçtiniz")
            }else{
                println("Kaldınız")
            }

            break
        }
    }




}