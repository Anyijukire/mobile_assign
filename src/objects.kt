fun main() {
var Janet=Human("Anyijukire Janet",19,67.5)
    Janet.eat(1)
    println(Janet.weight)
    Janet.speak("I am very beautiful. I love Kotlin very much.")
    Janet.birthday()
    var Anyijukire=ClassUser("Anyijukire","Janet","janetanyijukire@gmail.com",78565484,"private")
    println(Anyijukire.firstName)
    println(Anyijukire.email)
}
class Human(var name: String,var age: Int,var weight: Double){
    fun eat(foodWeight: Int){
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak(speech: String){
        println("$speech")
    }
    fun birthday(){
        age+=1
        println(age)
    }
}
data class ClassUser(var firstName: String, var lastName: String, var email: String, var phoneNumber: Int, var passWord: String)