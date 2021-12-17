import kotlin.math.*
import kotlin.random.Random

fun main() {
    val randNumber = Random.nextInt(1, 10)
    println(randNumber)

    val a = ceil(6.5) //Yukarı doğru yuvarlama işlemi yapar
    println(a)

    val b = floor(6.5) //Aşağı doğru yuvarlama işlemi yapar
    println(b)

    val c = sqrt(36.0) //Karekök alma işlemi yapar
    println(c)

    val d = abs(-15) //Mutlak Değer alma işlemi yapar
    println(d)

    val mx = max(100, 200) // İki değer arasındaki max değeri bulur
    println(mx)

    val min = min(100, 200) // İki değer arasındaki max değeri bulur
    println(min)

    val us = 2.0.pow(3) // Üs alma işlemini yapar
    println(us)

}