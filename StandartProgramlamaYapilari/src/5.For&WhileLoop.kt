fun main() {

    println("***** 1 den 10'a *******")
    for (sayac in 1..10) {
        println(sayac)
    }
    println("***** 0 dan 20'ye 4 arttırmak *******")
    for (sayac in 0..20 step 4) {
        println(sayac)
    }
    println("***** 10 dan 20'ye 2 azaltmak *******")
    for (sayac in 10..20 step 2) {
        println("Sayı:$sayac")
    }

    println("***** 20'den 15 'e geriye gitmek *******")
    for (sayac in 20 downTo 15) {
        println("Sayı:$sayac")
    }

    println("***** 20'den 0'a 5 geri  gitmek *******")
    for (sayac in 20 downTo 0 step 5) {
        println("Sayı:$sayac")
    }


    println("***** Bitiş değerini dahil etmez 1,2,3,4 ******")
    for (sayac in 1 until 5) {
        println(sayac)
    }


    // While Loop

    println("**** While Loop *****")
    var sayac = 0
    while (sayac < 5) {
        println(sayac)
        sayac++
    }


}