package com.thoughtworks.workshop.kotlin.pizza

interface Pizza {
    val name : String
    val dough: String
    val toppings : List<String>
    val price: Double
}