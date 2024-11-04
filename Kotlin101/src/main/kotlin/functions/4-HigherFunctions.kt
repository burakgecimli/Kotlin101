package functions

fun main() {
    calculateAndPrint(1, 2, '+')
    calculateAndPrint(1, 2, '-')

    calculateAndPrintHigherOrder(5, 7, { number1, number2 -> number1 + number2 })


}

//  Normal Fonksiyon
fun calculateAndPrint(number1: Int, number2: Int, operation: Char) {

    val result = when (operation) {
        '+' -> number1 + number2

        '-' -> number1 - number2

        '*' -> number1 * number2

        '/' -> number1 / number2

        else -> "Hatalı İşlem"
    }

    println("Result:$result")

}


//  Yukarıdaki fonksiyon içerisi baya bir kalabalık bir kod yapısına sahiptir.
//  Bu yüzden opearation bir değişken olarak değil de bir fonksiyon olarak veririz.

fun calculateAndPrintHigherOrder(number1: Int, number2: Int, operation: (number1: Int, number2: Int) -> Int) {

    val result = operation(number1, number2)
    println(result)
}

//  Higher Order içinde Higher Order kullanımı
fun calculateAndPrint2(
    number1: Int,
    number2: Int,
    operation: (number: Int, number2: Int, foo: (str: String) -> Unit) -> Int
) {

}

