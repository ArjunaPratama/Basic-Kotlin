fun main() {

    //readonly, not mutable and value cannot be changed
    val name = "Arjuna"

    //mutable and value can be changed
    var age = 18
    age = 26

    //print value
    println("My name is $name and I'm age $age years old")


    //Conditional
    if(age>=18){
        println("I'm an Adult")
    }else{
        println("I'm an Minor")
    }

    //loop
    for(i in 1..5){
        println("Count: $i")
    }

    var i = 1;
    while (i <= 100){
        println()
        println("Count: $i")
        i++
    }

    //function
    fun greeting(name: String){
        println("Hello, $name!")
    }

    greeting("Arjuna")

    //class
    class Person(val name: String, var ages: Int){
        fun speak(){
            println("My name is $name and I'm $age years old")
        }
    }

    val person = Person("Arjuna", 18)
    person.speak()
}