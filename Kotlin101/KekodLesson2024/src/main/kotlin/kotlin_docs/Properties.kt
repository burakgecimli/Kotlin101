package kotlin_docs

/**
 * Properties in Kotlin classes can be declared either as mutable, using the var keyword, or as read-only, using the val keyword.
 */

class Address {

    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"

    fun copyAddress(address: Address): Address {
        val result = Address() // there's no 'new' keyword in Kotlin
        result.name = address.name // accessors are called
        result.street = address.street
        // ...
        return result
    }
}

/**
 * Bir özelliği bildirmek için tam sözdizimi aşağıdaki gibidir:
 * var <propertyName>[: <PropertyType>] [= <property_initializer>]
 * [<getter>]
 * [<setter>]
 *
 * propertyName: Özelliğin adı.
 * PropertyType: Özelliğin türü. İsteğe bağlıdır, eğer başlatıcıdan veya getter’ın dönüş türünden çıkarılabiliyorsa.
 * property_initializer: Özelliğin varsayılan değeri.
 * getter: Özelliğe erişim için kullanılan özelleştirilmiş erişimci.
 * setter: Özelliğe değer atamak için kullanılan özelleştirilmiş atayıcı.
 */

/**
 * The initializer, getter, and setter are optional.
 * The property type is optional if it can be inferred from the initializer or the getter's return type, as shown below:
 */

var initialized = 1 // has type Int, default getter and setter
// var allByDefault // ERROR: explicit initializer required, default getter and setter implied.

/**
 * The full syntax of a read-only property declaration differs from a mutable one in two ways:
 * it starts with val instead of var and does not allow a setter:
 */
fun main(){
    val simple: Int? // has type Int, default getter, must be initialized in constructor
    val inferredType = 1 // has type Int and a default getter
    var num:Int

}

/**
 * var bir değişkeni val kullanmadan nasıl değiştirilemez yaparız."setter ini private yaparak"
 */



