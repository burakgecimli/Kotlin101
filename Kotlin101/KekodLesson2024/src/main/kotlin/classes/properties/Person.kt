package classes.properties

class Person {
    /**
     * Field: Bir sınıfın private üyeleridir.
     * Property: Private field'lere erişmeye izin veren getter ve setter metotlardır.
     * Kotlin'de değişken oluşturduğumuzda aslında bir property oluşturmuş oluyoruz.
     * Kotlin'de değişken yerine property vardır.
     */

    var firstName: String = "Burak"
    val lastName: String = "Geçimli"

    /**
     * Yukarıdaki kodu Show Kotlin Bytecode ile inceleyecek olursak;
     * Field'lerin private (backing field), bunlara ulaşan get/set propertylerinin ise public olduğu görülüyor.
     * Backing field memory de yer kaplayan gerçek değişkendir.Biz değiştiremeyeğiz şekilde private dır.
     * Bu şekilde Kotlin'de Encapsulation sağlanmış olur.
     * "firstName" var ile tanımlandığı için get/set oluştu.
     * "lastName" val ile tanımlandığı için (read-only) sadece set metodu oluştu.
     */


    /*
    @NotNull
    private String firstName = "Burak";
    @NotNull
    private final String lastName = "Geçimli";

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    public final void setFirstName(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.firstName = var1;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }
         */


    /**
     * Oluşturduğumuz değişkenlerin başına private,internal... gibi erişim belirteçleri koyarak;
     * get ve set propertylerinin görünürlüğünü değiştirmiş oluruz.
     * Yani private val number=123 yaparak get/set properyleri oluşmaz.
     */

    private val number: Int = 123
    //  private final int number = 123; -> Show Kotlin Bytecode'da oluşan kod.


    /**
     * Aşağıdaki kodlarda "field" gerçek değişkenimiz yani backing field dir.
     * Buna get ve set dışından erişemiyoruz.
     * Ve public vs. yapamıyoruz böylece Encapsulation'u delememiş oluyoruz.
     */
    var adress: String = ""
        set(value) {
            field = value
        }
        get() {
            return field
        }


    /**
     * Soru:Classların içinde oluşturulan değişkenler aslında bir property dedik;bu değişkenlerin property değil de
     * gerçekten field gibi nerede tanımlarız?
     * Cevap:Fonksiyon içinde tanımlanan değişkenler.Local değişkenlerdir.
     */

    fun getInfo() {
        val info: String = "Person Info"
    }

    //Görüldüğü gibi "info" değişkeninin get/set propertysi yok.
    /**
     *   public final void getInfo() {
     *       String info = "Person Info";
     *    }
     */
}

var Shape.type: String
    set(value) {
        type = value
    }
    get() = type


class Shape {
    var type: String = ""
}

fun main() {
}