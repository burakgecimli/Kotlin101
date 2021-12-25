package ArrayListOrnek

import kotlin.math.roundToInt

fun main() {
    val arrayListSayilar = ArrayList<Int>()
    for (i in 1..100) {
        var rastgeleSayi = (Math.random() * 100).toInt()
        arrayListSayilar.add(rastgeleSayi)
    }

    for (i in arrayListSayilar) {
        println(i)
    }
    println("***** Sorted **********")
    arrayListSayilar.sort()
    /*
    val sortArrayList=arrayListSayilar.sortedBy { it }
    for (i in sortArrayList){
        println(i)
    }

     */

    for (i in arrayListSayilar) {
        println(i)
    }


}