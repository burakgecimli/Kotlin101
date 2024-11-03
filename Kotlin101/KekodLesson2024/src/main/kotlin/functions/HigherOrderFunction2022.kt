package functions

fun main() {

    calculatePrint(1, 3, "+")
    calculateHighOrder(4, 7, { numberOne, numberTwo -> numberOne + numberTwo })
    calculateHighOrder(5, 7, { numberOne, numberTwo -> numberOne * numberTwo })


}

fun calculatePrint(numberOne: Int, numberTwo: Int, operation: String) {
    val result = when (operation) {
        "+" -> numberOne + numberTwo
        "-" -> numberOne - numberTwo
        "*" -> numberOne * numberTwo
        "/" -> numberOne / numberTwo
        else -> numberOne + numberTwo
    }
    println(result)
}

/**
 *  Not: Burada high order function calculateHighOrder() fonksiyonu oluyor. operation() değil.
 */
fun calculateHighOrder(numberOne: Int, numberTwo: Int, operation: (numberOne: Int, numberTwo: Int) -> Int) {
    val result = operation(numberOne, numberTwo)
    println(result)
}

