package basics

/**
 *      Type    |   Size(bits)  |   Min Value                             |     Max value
 *      ------------------------------------------------------------------------------------------------------------
 *      Byte    |   8 Bit       |   -128                                  |     127
 *      Short   |   16 Bit      |   -32768                                |     32767
 *      Int     |   32 Bit      |   -2,147,483,648 (-2^31)                |     2,147,483,647 (2^31-1)
 *      Long    |   64 Bit      |   -9,223,372,036,854,775,808 (-2^63)    |     9,223,372,036,854,775,807 (2^63-1)
 */

/**
 *      Type    |   Size(bits)  |   Significant bits    |   Exponent bits   |   Decimal digits
 *      ------------------------------------------------------------------------------------------------------------
 *      Float   |       32      |           24          |        8          |       6-7
 *      Double  |       64      |           53          |        11         |       15-16
 */

fun main() {

    val number = 127

    val boxedNumber: Int? =123
    val anotherBoxedNumber: Int? = 124

    println(boxedNumber === anotherBoxedNumber)


}