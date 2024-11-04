package basics.kekod2022.lesson05

fun main() {

    /**
     *      true ya da false değer ataması için kullanılır.
     *      0 ya da 1 Boolean olarak kullanılamaz.
     */

    val isStudent: Boolean = true
    val isTeacher: Boolean = false

    //  val isStudent2: Boolean = 1
    //  val isStudent2: Boolean = 0


    if (isStudent && isTeacher) {

    }

    if (isStudent and isTeacher) {

    }

    if (isStudent || isTeacher) {

    }

    if (isStudent or isTeacher) {

    }

    if (isStudent xor isTeacher) {

    }

    if (isStudent.or(isTeacher)) {

    }

    //-------------------------------------------------------------------------------------------------------

    /**
     * Boolean değerin true olmasını kontrol ettirmek için == true şeklinde kontrole gerek yoktur.
     * Zaten true ise süslü parantezler içerisine girecektir.
     */

    if (isStudent == true) {

    }

    if (isStudent) {

    }

    /**
     * Aynı şekilde false olmasını kontrol ettirmek için de == false şeklinde kontrole gerek yoktur.
     * Boolean değişkenin başına ! ifadesini koyarak tersini alabilirsiniz.
     * Bu durumda false ise süslü parantezlerin içine girecektir.
     */

    if (!isStudent == true) {

    }

    if (!isStudent) {

    }

    if (isStudent.not()) {

    }


}