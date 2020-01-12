package com.thoughtworks.workshop.kotlin.pizza

class Topping(
    val pizza: Pizza,
    type: String
) : Pizza by pizza {
    override val price = pizza.price + 20
    override val toppings: List<String> = pizza.toppings + type
}