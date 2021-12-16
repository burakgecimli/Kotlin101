fun main() {
    /*
    1.Sayısaldan sayısala dönüşüm
    2.Sayısaldan metine dönüşüm
    3.Metinden sayısala dönüşüm
    • toDouble() , toFloat(), toLong(), toInt(), toShort(), toByte(),
    toChar() , toString()
    */


    //Sayısaldan Sayısal'a dönüşüm
    println("Sayısaldan Sayısal'a dönüşüm")
    var numberInt:Int=42
    var numberDouble:Double=34.6
    var numberFloat:Float=12.5f

    var sonuc1:Double=numberInt.toDouble()
    var sonuc2:Int=numberDouble.toInt()
    var sonuc3:Float=numberInt.toFloat()
    var sonuc4:Int=numberFloat.toInt()

    println(sonuc1)
    println(sonuc2)
    println(sonuc3)
    println(sonuc4)

    println("Sayısaldan Metine Dönüşüm")

    var num:Int=10
    var num2:Double=12.5
    var num3:Float=41.6f

    var str1=num.toString()
    var str2=num2.toString()
    var str3=num3.toString()

    println(str1)
    println(str2)
    println(str3)








}