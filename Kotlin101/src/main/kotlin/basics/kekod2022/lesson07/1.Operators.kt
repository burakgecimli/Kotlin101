package basics.kekod2022.lesson07

fun main() {


    var numberOne = 10
    val numberTwo = 5

    println("NumberOne : ${numberOne}")
    println("NumberOne : ${numberOne++}") //Burada ilk önce işlem yapılır.Daha sonra değişkenin değeri arttırılır.(numberOne=10) yazar ve artık değer 11 olmuştur.
    println("NumberOne : ${numberOne}")   //Burada 11 yazacaktır.
    println("NumberOne : ${++numberOne}") //Burada ise ilk önce ifadenin değeri arttırılır.Daha sonra işlem yapılır.Değeri 12 yazacaktır.


    println("--------------------------------------------------------------------------------------------------------------------------------------------")

    // + operatoru yerine .plus()
    // - yerine .minus()
    // * yerine .times()
    // / yerine .div()
    // % kalani verir, yerine .rem() kullanilabilir

    print("${numberOne + numberTwo}")
    print(" ")
    println(numberOne.plus(numberTwo))

    print("${numberOne - numberTwo}")
    print(" ")
    println(numberOne.minus(numberTwo))

    print("${numberOne * numberTwo}")
    print(" ")
    println(numberOne.times(numberTwo))

    print("${numberOne / numberTwo}")
    print(" ")
    println(numberOne.div(numberTwo))

    print("${numberOne % numberTwo}")
    print(" ")
    println(numberOne.rem(numberTwo))

    println("-------------------------------------------------------------------------------------")

    println("Final notunuzu giriniz")
    val grade = readLine()!!.toInt()

    val charNote = if (grade == 100) {
        "$grade=AA"
    } else if (grade <= 99 && grade >= 80) {
        "$grade=BB"
    } else if (grade <= 79 && grade >= 50) {
        "$grade=CC"
    } else if (grade <= 49 && grade >= 20) {
        "$grade=DD"
    } else if (grade <= 19 && grade >= 0) {
        "$grade=FF"
    } else {
        "Geçersiz not"
    }

    println("-----------------------------------------------------------------------------------------------------------------------------------------------")
    val num1 = 12
    val num2 = 25
    println(num1.compareTo(num2)) // compareTo 1. sayi ikinci sayidan kucukse -1, esitse 0, buyukse 1 , dondurur


    /*
        a > b   a.compareTo(b) > 0
        a < b   a.compareTo(b) < 0
        a >= b   a.compareTo(b) >= 0
        a > b   a.compareTo(b) > 0
     */

    println(charNote)

    println("-----------------------------------------------------------------------------------------------------------------------------------------------")


    var a = 20
    val b = 5

    //once islemi yap sonra cikan sonucu soldaki degiskene ata
    a += b     //a = 25   a=a+b
    a -= b     //a = 20   a=a-b
    a *= b     //a = 100  a=a*b
    a /= b     //a = 20   a=a/b
    a %= b     //a = 0    a=a%b

    println("-----------------------------------------------------------------------------------------------------------------------------------------------")


    var numbOne = 10
    var numbTwo = 5
    var flag = true

    println("+numbOne :" + +numbOne) // tek + pozitiflik verdi
    println("-numbOne :" + -numbOne) // tek - negatiflik verdi
    println("++numbOne :" + ++numbOne)
    println("numbOne++ :" + numbOne++)
    println("numbOne :" + numbOne)
    println("--numbTwo :" + --numbTwo)
    println("!flag : " + !flag)


    /**
     *  === ifadesi isaret edilen referanslarini karsilastirir. yani memory adreslerini karsilastirir.
     *  == ifadesi degeri karsilastirir. if case lerde bu kullanilir cunku karsilastirma yapariz
     *  = ifadesi deger atamasi yapar
     */



}