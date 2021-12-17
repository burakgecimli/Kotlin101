fun main() {

    var num: Int = 1
    while (num < 10) {
        if (num == 5) { // 5 olunca döngüyü kırar.
            break
        }
        println(num)
        num++
    }

    println("-----------")
    for (number in 1..5) {
        if (number == 3) { // 3'ü es geçer
            continue
        }
        println(number)
    }
}