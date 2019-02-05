package com.train

import java.util.*


fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("If you want to terminate this system , please enter -1.")

    while(true) {
        print("Please enter number of ticket : ")
        var numOfTicket = sc.nextInt()
        if(numOfTicket == -1) break
        print("Please enter number of round-ticket : ")
        var numOfRoundTicket = sc.nextInt()
        if(numOfRoundTicket == -1) break

        val tk = Ticket(numOfTicket,numOfRoundTicket)
        tk.print()
    }

}

class Ticket(var numOfTicket:Int,var numOfRoundTicket:Int){

    fun print(){
        var numOfNonRoundTicket = numOfTicket - numOfRoundTicket
        var sum = numOfNonRoundTicket * 1000 + numOfRoundTicket.toDouble() * 2000.0 * 0.9
        println("Your total price is $" + sum.toInt() +" By Kotlin")
    }
}