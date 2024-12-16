package com.example.kotlin_basics

import java.util.Scanner


//take input from user two number and show its division and remainder

fun main(){

    var s1 = Scanner(System.`in`)
    println("Enter first number")
    var x = s1.nextInt()
    println("Enter second number")
    var y = s1.nextInt()

    var division = x/y
    var remainder = x%y
    println("Division of $x and $y is $division")
    println("Remainder of $x and $y is $remainder")

}