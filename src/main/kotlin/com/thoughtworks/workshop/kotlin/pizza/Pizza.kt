package com.thoughtworks.workshop.kotlin.pizza

interface Pizza {
    val name : String
    val dough: String
    val toppings : List<String>
    val price: Double
}

fun Pizza.description() : String {
    val toppingsText = toppings.reduce { acc, topping ->
        "$acc, $topping"
    }

    return "A $name pizza with $dough base, topped with $toppingsText and priced at $price"
}