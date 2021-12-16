fun main() {

    /*
    ******** Metinden Sayısala Dönüşüm ************
    •Dönüşüm olurken dikkatli olunmalıdır çünkü metin içinde her zaman sayı yer almaz hata ihtimali yüksektir .


     */
    //String to Int

    //Yöntem 1
    var rakam:String="345A"

    try {
        var donustur3:Int=rakam.toInt()
        println(donustur3)

    }catch (e:Exception){
        println("Hatalı Dönüştürme İşlemi")
    }


    //Yöntem 2
    var yazi2:String="764"
    var donustur=yazi2.toIntOrNull()

    if (donustur!=null){
        println(donustur)
    }else
        println("Hatalı Dönüştürme İşlemi")






}