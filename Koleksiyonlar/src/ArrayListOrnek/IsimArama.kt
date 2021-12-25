package ArrayListOrnek

import java.util.*
import kotlin.collections.ArrayList


fun main() {
    println("İsim giriniz")
    val input = Scanner(System.`in`)
    val girilenIsim = input.next()

    val isimler = ArrayList<String>()
    isimler.add("Berna")
    isimler.add("Ahmet")
    isimler.add("Zeynep")
    isimler.add("Mete")
    isimler.add("Yunus")

    if (isimler.contains(girilenIsim)){
        println("İsim bulundu")
    }else {
        println("İsim bulunamadı")
    }


}