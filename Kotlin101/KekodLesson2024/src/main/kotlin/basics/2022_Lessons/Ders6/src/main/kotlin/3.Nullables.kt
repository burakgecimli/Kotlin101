fun main() {

    /**
     * bir degiskene null deger atamasi yapabilmek icin degisken tipinin sonuna ? işareti konulur.
     * Eger degiskene tip verilmez ve direkt null deger atamasi yapilirsa ide tip cikarimi yaparken Nothing? diye isaretler.
     * hangi tipe karsilik geldigini bilemez. Nothing bos bir classdir.
     * eger degiskenin null gelip gelmeyecegi bilinmiyorsa nullable yapma cunku performans farki olacak.
     * bu fark null verilmis tip boxed oluyor yani referans tipli oluyor, primitive olmuyor yani performans farki ort cikiyor.
     */


    val name: String? = null
    val age: Int? = null


    val number = null //Nothing? tipi oldu

    var number1: Int? = null
    var number2: Int? = null

    /**
     * null degilse calissin demek icin tipin yanina ?. koyariz
     * Best practice olarak debug modda calisirken kodlarimiza !! seklinde yazmaliyiz
     */

    val result: Int? = null
    result!!.plus(325) // nullsa da degilse de bana birak gerekirse uygulama patlasin yinede ben bunu goze aliyorum
    result?.plus(325) // burada ise null gelirse uygulamayi patlatma o kod blogunu calistirma yani null degilse calissin diyorsak boyle kullaniriz.


//------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     *      Elimizde nullable bir degisken varsa, bu degiskenin methodlarindan birine ihtiyac duyacaksak ya da
     *      direkt olarak kullanacaksak bu durumda ideye ya bu degiskenin null olmayacaginin garantisini !! operatoru ile
     *      vermek gerekiyor ya da null degilse calissin demek icin ?. operatorunu kullanmak gerekiyor.
     *      Best Practice olarak debug modda calisirken kodlarimiza !! seklinde yazmamiz Kotlin Null Pointer Exception
     *      almamizi saglar. Bu sayede gozden kacan nullable degerleri bulabilmemizi saglar. Ancak canliya cikan kodlarimizda
     *      projemizin crash olmamasi icin ?. kullanmamiz daha dogru olacaktir.
     * **/

    number1 = readLine()!!.toInt()
    number2 = readLine()!!.toInt()

    // nullable kontrolunu boyle yapiyorsaniz halen keko bir yazilimcisinizdir.
    if (number1 != null && number2 != null) {
        val result = number1 + number2
    }


}