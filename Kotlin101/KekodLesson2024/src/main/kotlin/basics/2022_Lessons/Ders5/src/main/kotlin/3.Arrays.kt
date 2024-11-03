fun main() {

    /**
     * Dizi tanımlamaları için kullanılır.
     * arrayOf(aynı tip değerler) şeklinde tanımlanabilir.
     * arrayOf<Any> (farklı tip değerler) şeklinde tanımlanabilir.
     * arrayOfNulls<Type>(size) şeklinde ise verilen boyut kadar null değer içeren dizi tanımlanabilir.
     */

    val studentNumbers = arrayOf(13, 45, 53, 54, 25, 10)
    val studentNames = arrayOf("Ahmet", "Ayşe", "Veli", "Derya")
    val firstCharOfNames = arrayOf('A', 'B', 'C', 'D')
    val mixedArray = arrayOf<Any>(13, "Ahmet", 'V', true)
    val arrayOfNulls = arrayOfNulls<String>(4)


    /**
     * Array<Type>(size) {higher order function} şeklinde de tanımlanabilir.
     * Bu durumda higher order function içerisinde son satıra dnek gelen değerler diziyi oluşturur.
     * Higher order function, içerisi dizinin boyutu kadar index'i (it) bir artırarak çalışır.
     */

    // 5 elemanlı,tüm elemanları 3.14 x indexDeğeri olan bir dizi oluşturur.
    val carNamesMini = Array<Double>(5) {

        //      pseudo Codes
        //      pseudo Codes
        //      pseudo Codes
        3.14 * it
    }

    carNamesMini.forEach { println(it) }

    //10 Elemanlı,0-9 arasındaki index değerlerinin karesini alan bir dizi oluşturur.
    //{0,1,2,4,16,25,36,49,64,81}
    val carNames = Array<Unit>(10) {
        println(it * it).toString()
    }

//----------------------------------------------------------------------------------------------------------------


    /**
     *     ByteArray,ShortArray,IntArray,LongArray,DoubleArray,FloatArray gibi ya da bunların Unsigned halleri gibi
     *     primitive array tanımlamaları da yapılabilir.
     *     Bu tarz tanımlamalarda ilgili index değerine atama için set(index,value) ya da [index]=value kullanılır.
     *     Bu tarz tanımlamalarla ilgili index değerindeki değişken değerine get(index) ya da [index] şeklinde ulaşılabilir.
     */

    val firstCharOfCountries = CharArray(4)
    firstCharOfCountries[0] = 'T'
    firstCharOfCountries.set(1, 'B')
    firstCharOfCountries.set(3, 'C')

    firstCharOfCountries[2] = 'Z'


    /**
     *      val ile tanımlanmış bir array'in herhangi bir index'inde ki değer değiştirilebilir.
     *      val indexte ki değerlerin değişmesine karışmaz.
     *      Ancak ilgili diziyi başka bir dizi ile eşitlemenize izin verilmez.
     *      Bunun için tanımlamayı var ile değiştirmeniz gerekir.
     */

    val awesomeArray = arrayOfNulls<String>(5)
    awesomeArray[2] = "Burak"

    //  awesomeArray= arrayOf("foo","too","goo","loo") Çalışmaz comment'i kaldır kontrol et.

    /**
     *      Array'in size' i dışına çıkarıyorsanız,IndexOutOfBound hatasını alırız.
     */

  //  awesomeArray[5] = "Yusuf"  Çalışmaz comment'i kaldır kontrol et.



}