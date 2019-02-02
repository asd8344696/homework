package com.train

import java.util.*


fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    print("Please enter number of ticket : ")
    var numOfTicket = sc.nextInt()
    print("Please enter number of round-ticket : ")
    var numOfRoundTicket = sc.nextInt()

    val tk = Ticket(numOfTicket,numOfRoundTicket)
    tk.print()
}

class Ticket(var numOfTicket:Int,var numOfRoundTicket:Int){

    fun print(){
        var numOfNonRoundTicket = numOfTicket - numOfRoundTicket
        var sum = numOfNonRoundTicket * 1000 + numOfRoundTicket.toDouble() * 2000.0 * 0.9
        print("Your total price is $" + sum.toInt() +" By Kotlin")
    }
}