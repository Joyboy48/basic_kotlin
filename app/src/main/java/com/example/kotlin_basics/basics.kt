package com.example.kotlin_basics


class Robot(val name:String){

    fun walk(){
        println("The robot is walking")
    }
    fun speak(message:String){
        println("$name says: $message")
    }

}

///inheritance========


open class GeneralRobot(val name:String){

    fun walk(){
        println("The robot is walking")
    }
    fun speak(message:String){
        println("$name says: $message")
    }

}


class FiringRobot( name:String):GeneralRobot(name){

    fun fire(){
        println("Firing .. .. .. .. ")
    }
}

class SuperRobot(name:String):GeneralRobot(name){

    fun turnOnLight(){
        println("Turning on Light")
    }
}

class OrdinarRobot( name:String):GeneralRobot(name){

    fun cleanHouse(){
        println("cleanig house")
    }
}


 fun main(){

     val robot1 = Robot("Lala")
     robot1.walk()
     robot1.speak("Hello!")

     //inheritance
     val ordinarRobot = OrdinarRobot("Robot1")
     ordinarRobot.cleanHouse()
     ordinarRobot.walk()

     val firingRobot = FiringRobot("Robot2")
     firingRobot.fire()
     firingRobot.speak("Yo")

     val superRobot = SuperRobot("Robot3")
     superRobot.turnOnLight()
     superRobot.walk()

     println("Hello")

     //var : mutable variable
     //val : immutable variable

    //Mutable
    var myAge:Int = 20
    //Immutable
    val pi:Double = 3.14

    println("My age is :"+myAge)

  //byte = -128 to 127
  //short = -32768 to 32767
  //int = -2 billion to 2 billion
  //long = -9 quintillion to 9 quintillion
  //float decimal
  var q = 23.45f
  //double
  //boolean
     //String
     val name = "Astitva"
     val info ="Hello my name is $name and my age is $myAge"
     println(info)

     val x=5
     val y=6
     val result = "The sum of $x and $y is ${x+y}"
     println(result)

     val text = "Hello World"
     val array = arrayOf(1,2,3,4,5,6)
     println(array[2])
     array[1] = 10
     println(array[1])

     //range
     //1..5 1 and 5 included
     //1 until 5 5 not included

//     fun functionName(): ReturnType {
//         // Body of the function
//         return value
//     }

     fun greet() {
         println("Hello, Kotlin!")
     }
    greet()

     fun add(a:Int,b:Int):Int{
        return a+b
     }
     val sum = add(2,3)
     println(sum)




 }