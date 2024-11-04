package kotlin_docs

/**
 * Classes in Kotlin are declared using the keyword class:
 * The class declaration consists of the class name, the class header (specifying its basics.kekod2022.lesson10.getType parameters, the primary constructor, and some other things), and the class body surrounded by curly braces.
 * Both the header and the body are optional; if the class has no body, the curly braces can be omitted.
 * 	1. Sınıf İsmi (Class Name): Sınıf ismi, sınıfı tanımlayan adıdır ve büyük harfle başlamalıdır.Bu, Kotlin’de genel bir kuraldır.
 * 	2. Sınıf Başlığı (Class Header): Sınıf başlığı, sınıfın tür parametrelerini (örneğin, T gibi generic tipler), ana yapıcı (primary constructor) ve bazı diğer özellikleri belirtir.
 * Sınıf Gövdesi (Class Body): Sınıfın içinde yer alan özellikler (properties), fonksiyonlar (functions) ve sınıfın davranışını tanımlayan diğer üyeleri içerir. { } süslü parantezler ile sınırlandırılır.
 *
 *
 */

class Person {
}
/**
 * Eğer sınıfın bir gövdesi olmayacaksa, süslü parantezler bile kullanılmadan sadece sınıf ismini yazmak mümkündür:
 * Bu durumda, Empty sınıfı bir sınıf başlığı veya gövde olmaksızın tanımlanmış olur.
 * Bu tarz kullanım, bir sınıfın minimal bir tanıma ihtiyaç duyduğu, yani yalnızca sınıf yapısının tanımlandığı durumlarda kullanışlıdır.
 */
class Empty

/**
 * basics.kekod2022.lesson09.A class in Kotlin has a primary constructor and possibly one or more secondary constructors.
 * The primary constructor is declared in the class header, and it goes after the class name and optional basics.kekod2022.lesson10.getType parameters.
 *
 * Kotlin’de sınıfların yapıcıları (constructors) nesne oluşturulurken özellikleri (properties) ve sınıfın ilk durumunu belirler.
 * Sınıflarda iki tür yapıcı bulunur: Ana yapıcı (primary constructor) ve İkincil yapıcılar (secondary constructors).
 * Ana yapıcı, sınıf başlığında sınıf isminin hemen ardından tanımlanır ve sınıfın temel özelliklerini kurar.
 */
class Person1 constructor(firstName: String) { /*...*/ }

/**
 * If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted.
 * Ancak, eğer yapıcıda bir görünürlük belirleyicisi (public, private vb.) veya anotasyon yoksa constructor anahtar kelimesini yazmaya gerek yoktur:
 */

class Person2(firstName: String) {/*...*/ }

/**
 * The primary constructor initializes a class instance and its properties in the class header.
 * The class header can't contain any runnable code. If you want to run some code during object creation, use initializer blocks inside the class body.
 * Initializer blocks are declared with the init keyword followed by curly braces.
 * Write any code that you want to run within the curly braces.
 * During the initialization of an instance, the initializer blocks are executed in the same order as they appear in the class body, interleaved with the property initializers:
 *
 * Ana yapıcı, sınıf başlığında yalnızca değişkenleri ve özellikleri başlatmak için kullanılır; herhangi bir kod çalıştırılamaz.
 * Ancak, nesne oluşturulurken çalıştırmak istediğiniz kod varsa, bu kodu sınıf gövdesinde başlatıcı bloklar (initializer blocks) ile çalıştırabilirsiniz.
 * Başlatıcı Bloklar (Initializer Blocks):
 * Başlatıcı bloklar init anahtar kelimesiyle tanımlanır ve süslü parantezler {} içine yazılır.
 * Bir nesne oluşturulduğunda, başlatıcı bloklar tanımlandıkları sıraya göre çalıştırılır.
 */
class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}


/**
 * Primary constructor parameters can be used in the initializer blocks.
 * They can also be used in property initializers declared in the class body:
 *
 * Kotlin'de, ana yapıcı parametreleri sınıfın gövdesindeki başlatıcı bloklarda veya özellik başlatıcılarında (property initializers) kullanılabilir.
 * Bu, sınıfın başlatılması sırasında parametrelerin hemen işlenip özelliğe dönüştürülmesini sağlar.
 */

class Customer(name: String) {
    val customerKey = name.uppercase().also(::println)
}

/**
 * Kotlin has a concise syntax for declaring properties and initializing them from the primary constructor:
 * Kotlin'de özellik tanımlamak ve ana yapıcı üzerinden başlatmak için oldukça sade bir sözdizimi vardır.
 * Bu, sınıf başlığında özelliklerin hem tanımlanmasını hem de başlatılmasını sağlar.
 */
class Person3(val firstName: String, val lastName: String, var age: Int)


/**
 * Such declarations can also include default values of the class properties:
 * Much like regular properties, properties declared in the primary constructor can be mutable (var) or read-only (val).
 * Kotlin, sınıf özelliklerine varsayılan değerler atanmasına da olanak tanır:
 * Özelliklerin önünde kullanılan val veya var anahtar kelimeleri, özelliklerin salt okunur (read-only) veya değiştirilebilir (mutable) olduğunu belirtir
 */
class Person4(val firstName: String, val lastName: String, var isEmployed: Boolean = true)

/**
 * You can use a trailing comma when you declare class properties:
 *
 * Trailing comma (sondaki virgül), bir özellik veya öğe listesinin sonuna fazladan bir virgül eklemek anlamına gelir. Kotlin'de trailing comma kullanımı tamamen isteğe bağlıdır, fakat bazı avantajlar sağlar:
 *
 * Trailing Comma Kullanımının Avantajları
 * Sürüm Kontrolü: Kodda bir özellik veya öğe eklendiğinde ya da çıkarıldığında yalnızca o özellik veya öğe değişir. Bu da sürüm kontrol araçlarında (örneğin Git) daha temiz bir değişiklik geçmişi sağlar.
 * Kodun Düzenlenmesi ve Yeniden Sıralanması: Yeni özellikler eklenirken ya da var olanlar yeniden sıralanırken, ek bir virgül eklemek veya kaldırmak gerekmez.
 * Otomatik Kod Üretiminde Kolaylık: Özellikle nesne başlatıcıları için kod otomatik olarak üretilirken listeye virgül eklemek daha basit hale gelir.
 */
class Person5(
    val firstName: String,
    val lastName: String,
    var age: Int, // trailing comma
) { /*...*/ }


/**
 * If the constructor has annotations or visibility modifiers, the constructor keyword is required and the modifiers go before it:
 * Kotlin'de bir sınıfın constructor (yapıcı) metoduna ek açıklamalar veya görünürlük belirteçleri eklenmesi gerekiyorsa, bu durumda constructor anahtar kelimesi zorunlu hale gelir.
 * constructor anahtar kelimesi, görünürlük belirteçlerinin veya ek açıklamaların (örneğin @Inject) doğrudan başlatıcıya uygulanabilmesini sağlar.
 */

class Customer1 public constructor(name: String) { /*...*/ }


/**
 * Secondary constructors:
 * basics.kekod2022.lesson09.A class can also declare secondary constructors, which are prefixed with constructor:
 * Kotlin'de bir sınıf, bir primary constructor (ana yapıcı) yanı sıra bir veya daha fazla secondary constructor (ikincil yapıcı) da tanımlayabilir.
 * Secondary constructor, sınıfa farklı yollardan nesne oluşturabilme esnekliği kazandırır.
 * Bu yapıcılar, constructor anahtar kelimesi ile tanımlanır.
 */

class Person6(val pets: MutableList<Pet> = mutableListOf())
class Pet {
    constructor(owner: Person6) {
        owner.pets.add(this) // adds this pet to the list of its owner's pets
    }
}


/**
 * If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor,
 * either directly or indirectly through another secondary constructor(s).
 * Delegation to another constructor of the same class is done using the this keyword:
 *
 * Kotlin'de bir sınıf, bir ana yapıcıya (primary constructor) sahip olabilir ve buna ek olarak ikincil yapıcılar (secondary constructors) tanımlayabilir.
 * İkincil yapıcılar, sınıfın farklı şekillerde başlatılmasını sağlar.
 * Ancak, eğer bir sınıfın ana yapıcısı varsa, tüm ikincil yapıcıların ana yapıcıya delegasyon yapması gerekir.
 * Bu delegasyon, aynı sınıfın başka bir yapıcısına this anahtar kelimesi kullanılarak gerçekleştirilir.
 */

class Person7(val name: String) {
    val children: MutableList<Person7> = mutableListOf()
    constructor(name: String, parent: Person7) : this(name) {
        parent.children.add(this)
    }
}


/**
 * Code in initializer blocks effectively becomes part of the primary constructor.
 * Delegation to the primary constructor happens at the moment of access to the first statement of a secondary constructor,
 * so the code in all initializer blocks and property initializers is executed before the body of the secondary constructor.
 * Even if the class has no primary constructor, the delegation still happens implicitly, and the initializer blocks are still executed:
 *
 * Kotlin’de init blokları, başlatıcı bloklar (initializer blocks) olarak adlandırılır ve sınıfın ana yapıcısının (primary constructor) bir parçası gibi çalışır.
 * Bu bloklarda tanımlanan kod, sınıf başlatıldığında hemen çalıştırılır ve bu, ana yapıcı ya da herhangi bir ikincil yapıcı (secondary constructor) çağrıldığında da geçerlidir.
 *
 * init blokları ve sınıf gövdesinde başlatılan özellikler, tüm yapıcıların (hem ana hem de ikincil yapıcılar) çalışmasından önce otomatik olarak başlatılır.
 * Bu, sınıf başlatıldığında gerekli tüm işlemlerin önceden yapılmasını sağlar.
 * Eğer sınıfın bir ana yapıcısı yoksa, Kotlin yine de parametresiz bir primary constructor oluşturur.
 * Bu durumda init blokları ve özellik başlatıcıları yine otomatik olarak çalışır, böylece ikincil yapıcıların başlatma mantığıyla uyum sağlanır.
 */
class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor $i")
    }
}

/**
 * If a non-abstract class does not declare any constructors (primary or secondary), it will have a generated primary constructor with no arguments.
 * The visibility of the constructor will be public.If you don't want your class to have a public constructor, declare an empty primary constructor with non-default visibility:
 *
 * Kotlin’de bir sınıfın herhangi bir yapıcı (constructor) tanımlamaması durumunda dil otomatik olarak parametresiz bir ana yapıcı (primary constructor) oluşturur.
 * Bu yapıcı, sınıfın varsayılan erişim belirleyicisi olan public erişime sahip olur.
 * Yani, dışarıdan bu sınıfın bir örneği oluşturulabilir.
 * Ancak bazı durumlarda sınıfın dışarıdan örneklenmesini istemiyorsak, yapıcının erişimini sınırlandırabiliriz.
 */

class DontCreateMe private constructor() { /*...*/ }

/**
 *
 * Classes can contain:
 *
 * Constructors and initializer blocks
 *
 * Functions
 *
 * Properties
 *
 * Nested and inner classes
 *
 * Object declarations
 */

fun main() {
    InitOrderDemo("hello")
    Customer("burak")
    Person4("Burak", "Geçimli")
    Person4("Burak", "Geçimli", false)
    Constructors(5)
}


