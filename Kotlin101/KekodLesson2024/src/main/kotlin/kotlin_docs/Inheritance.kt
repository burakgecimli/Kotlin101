package kotlin_docs


/**
 * All classes in Kotlin have a common superclass, Any, which is the default superclass for a class with no supertypes declared:
 * Any has three methods: equals(), hashCode(), and toString(). Thus, these methods are defined for all Kotlin classes.
 * Tüm Kotlin sınıfları, açıkça belirtilen bir üst sınıf (supertype) olmadığında, varsayılan olarak Any sınıfından türetilir.
 * Any sınıfı, equals(), hashCode(), ve toString() gibi üç temel metoda sahiptir.
 * Bu nedenle, bu yöntemler tüm Kotlin sınıfları için geçerlidir.
 */

class Example // Implicitly inherits from Any


/**
 * By default, Kotlin classes are final – they can't be inherited. To make a class inheritable, mark it with the open keyword:
 * Kotlin'daki sınıflar varsayılan olarak finaldır, yani kalıtıma açılamazlar.
 * Bir sınıfın kalıtıma açık olmasını sağlamak için, o sınıfı open anahtar kelimesi ile işaretlemek gerekir:
 */

open class Base // Class is open for inheritance


/**
 * To declare an explicit supertype, place the type after a colon in the class header:
 * Kotlin'da açık bir üst tür (supertype) belirtmek için, sınıf başlığında iki nokta üst üste (:) kullanarak türü belirtirsiniz.
 */
open class Base1(p: Int)

class Derived(p: Int) : Base1(p)


/**
 * If the derived class has a primary constructor, the base class can (and must) be initialized in that primary constructor according to its parameters.
 * If the derived class has no primary constructor, then each secondary constructor has to initialize the base type using the super keyword
 * or it has to delegate to another constructor which does.
 * Note that in this case different secondary constructors can call different constructors of the base type:
 *
 * Eğer türetilmiş (derived) sınıfın bir birincil yapıcı (primary constructor) varsa, temel sınıf (base class) o birincil yapıcıda parametrelerine göre başlatılmalıdır.
 * Türetilmiş sınıfın bir birincil yapıcısı yoksa, her ikincil yapıcı (secondary constructor) temel türü super anahtar kelimesi kullanarak başlatmalı ya da bunu yapan başka bir yapıcıya yetki vermelidir.
 * Bu durumda, farklı ikincil yapıcılar, temel türün farklı yapıcılarını çağırabilir.
 */

/*
class MyView : View {
    /*
    constructor(ctx: Context) : super(ctx)

    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)

     */
}

 */

/**
 * Kotlin requires explicit modifiers for overridable members and overrides:
 * Kotlin, üst sınıftaki (superclass) yeniden yazılabilir (overridable) üyeler ve üst sınıftan (subclass) geçersiz kılmaları (overrides) için açıkça belirteçler (modifiers) gerektirir.
 * Shape sınıfında draw() metodu open olarak işaretlenmiştir, bu nedenle Circle sınıfında bu metodun geçersiz kılınması için override anahtar kelimesi gereklidir.
 * Eğer override ifadesi eksikse, derleyici hata verecektir.
 * Shape sınıfındaki fill() metodu open olarak işaretlenmemiş ise;
 * Bu metodun aynı imzaya sahip bir alt sınıf metoduyla tanımlanması mümkün değildir, ne override anahtar kelimesi ile ne de olmadan.

 */

open class Shape {
    open fun draw() { /*...*/
    }

    fun fill() { /*...*/
    }
}

class Circle() : Shape() {
    override fun draw() { /*...*/
    }

}

/**
 * A member marked override is itself open, so it may be overridden in subclasses. If you want to prohibit re-overriding, use final:
 * Bir üye override ile işaretlenmişse, kendisi de open olur ve alt sınıflarda yeniden geçersiz kılınabilir.
 * Ancak, yeniden geçersiz kılmayı yasaklamak isterseniz, final anahtar kelimesini kullanabilirsiniz:
 */
open class Rectangle() : Shape() {
    final override fun draw() {/*...*/
    }
}

/**
 * The overriding mechanism works on properties in the same way that it does on methods.
 * Properties declared on a superclass that are then redeclared on a derived class must be prefaced with override, and they must have a compatible type.
 * Each declared property can be overridden by a property with an initializer or by a property with a get method:
 *
 * Kotlin'da özelliklerin (properties) geçersiz kılma mekanizması, metodlarınkine benzer şekilde çalışır.
 * Bir üst sınıfta tanımlanan ve ardından bir alt sınıfta yeniden tanımlanan özellikler, override anahtar kelimesi ile belirtilmeli ve uyumlu bir tür (type) kullanmalıdır.
 */

open class Shape1 {
    open val vertexCount: Int = 0

}

class Rectangele1 : Shape1() {
    override val vertexCount = 4
}

/**
 * You can also override a val property with a var property, but not vice versa.
 * This is allowed because a val property essentially declares a get method, and overriding it as a var additionally declares a set method in the derived class.
 *
 *
 * val olarak tanımlanan bir özelliği, var olarak geçersiz kılmak mümkündür.
 * Bu, val özelliğinin aslında bir get metodu tanımlamasından kaynaklanmaktadır ve var ile geçersiz kıldığımızda ayrıca bir set metodu da tanımlamış oluruz.
 * Ancak, var olarak tanımlanan bir özelliği val olarak geçersiz kılmak mümkün değildir.
 */
open class Shape2 {
    open val area: Double = 0.0
}

class Circle2(val radius: Double) : Shape2() {
    override val area: Double
        get() = super.area
}

/**
 * Note that you can use the override keyword as part of the property declaration in a primary constructor:
 *
 * Kotlin'da, override anahtar kelimesini, birincil yapıcı (primary constructor) içindeki özellik tanımında kullanmak mümkündür.
 * Bu, özellikle arayüzlerden veya üst sınıflardan gelen özellikleri geçersiz kılmak için kullanışlıdır.
 */

interface Shape3 {
    val vertexCount: Int
}

class Rectangele3(override val vertexCount: Int = 4) : Shape3 /// Always has 4 vertices

class Polygon : Shape3 {
    override val vertexCount: Int = 0
}


/**
 * During the construction of a new instance of a derived class,
 * the base class initialization is done as the first step (preceded only by evaluation of the arguments for the base class constructor),
 * which means that it happens before the initialization logic of the derived class is run.
 *
 * Kotlin'de türetilmiş sınıfların başlatılma sırası oldukça önemlidir.
 * Yeni bir türetilmiş sınıfın örneği oluşturulurken, temel sınıfın başlatılması ilk adım olarak gerçekleştirilir.
 * Bu işlem, yalnızca temel sınıfın yapıcılarının argümanlarının değerlendirilmesinden sonra gelir.
 * Yani, türetilmiş sınıfın başlatma mantığı çalışmadan önce temel sınıfın başlatılması yapılır.
 */

open class Base2(val name: String) {
    init {
        println("Initializing size in the base class")
    }

    open val size: Int = name.length.also {
        println("Initializing size in the base class: $it")
    }
}

class Derived2(name: String, val lastName: String) :
    Base2(name.replaceFirstChar { it.uppercase().also { println("Argument for the base class: $it") } }) {

    init {
        println("Initializing a derived class")
    }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }

}

/**
 * Code in a derived class can call its superclass functions and property accessor implementations using the super keyword:
 * Türetilmiş sınıfta super anahtar kelimesiyle üst sınıfın işlevlerine ve özelliklerine erişim sağlanabilir.
 */

open class Rectangle1 {
    open fun draw() {
        println("Drawing a rectangle")
    }

    val borderColor: String get() = "black"
}

class FilledRectangle : Rectangle1() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }

    val fillColor: String = super.borderColor
}

/**
 * Inside an inner class, accessing the superclass of the outer class is done using the super keyword qualified with the outer class name: super@Outer:
 * Bir iç sınıfın içinde, dış sınıfın üst sınıfına erişim, dış sınıf adıyla nitelenen super anahtar sözcüğü kullanılarak yapılır:
 */
class FilledRectangle1 : Rectangle1() {
    override fun draw() {
        val filler = Filler()
        filler.drawAndFill()
    }

    inner class Filler {
        fun fill() {
            println("Filling")
        }

        fun drawAndFill() {
            super@FilledRectangle1.draw() // Calls Rectangle's implementation of draw()
            fill()
            println("Drawn a filled rectangle with color ${super@FilledRectangle1.borderColor}") // Uses Rectangle's implementation of borderColor's get()
        }
    }
}



/**
 * In Kotlin, implementation inheritance is regulated by the following rule: if a class inherits multiple implementations
 * of the same member from its immediate superclasses,
 * it must override this member and provide its own implementation (perhaps, using one of the inherited ones).
 *To denote the supertype from which the inherited implementation is taken, use super qualified by the supertype name in angle brackets, such as super<Base>:
 *
 * Kotlin'de, bir sınıf birden fazla üst sınıftan aynı üyeyi devraldığında, bu üyenin geçersiz kılınması ve kendi uygulamasının sağlanması gerekmektedir.
 * Bu, hangi üst sınıftan devralınan uygulamanın kullanılacağını belirtmek için super anahtar kelimesinin üst sınıf adıyla nitelendirilerek kullanılması gerektiği anlamına gelir.
 */


open class Rectangle2 {
    open fun draw() {

    }
}

interface Polygon2 {
    fun draw() { /* ... */
    } // interface members are 'open' by default
}

class Square() : Rectangle2(), Polygon2 {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<Rectangle2>.draw() // call to Rectangle.draw()
        super<Polygon2>.draw() // call to Polygon.draw()
    }
}


fun main() {
    val derived2 = Derived2("burak", "gecimli")
}


