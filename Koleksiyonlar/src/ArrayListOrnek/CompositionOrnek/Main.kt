package ArrayListOrnek.CompositionOrnek

import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val personeller = ArrayList<Personel>()

    for (i in 1..2) {
        println("$i. Personel ad:")
        val isim = input.next()

        println("$i. Personel adres il:")
        val il = input.next()

        println("$i. Personel adres ilçe:")
        val ilce = input.next()


        val adres = Adres(il, ilce)
        val personel = Personel(i, isim, adres)

        personeller.add(personel)
    }

    for (p in personeller) {
        println("************")
        println("Personel no: ${p.no}")
        println("Personel isim: ${p.isim}")
        println("Personel adres il: ${p.adres.il}")
        println("Personel adres ilçe: ${p.adres.ilce}")
    }

}