package playground.kotlin

data class Person(val name: String, val age: Int)

class Greeter {
    fun greet(person: Person): String = ("Hello ${person.name}!")
}