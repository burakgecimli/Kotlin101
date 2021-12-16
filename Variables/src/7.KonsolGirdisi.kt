import java.util.*

fun main(){
    println("Enter your name")
    val InputName= Scanner(System.`in`)
    val name=InputName.next()

    println("Enter your age")
    val inputAge=Scanner(System.`in`)
    val age=inputAge.nextInt()

    println("Enter your number")
    val inputNumber=Scanner(System.`in`)
    val number=inputNumber.nextInt()

    println("Name:$name \nAge:$age \nNumber:$number")
}