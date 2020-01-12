package com.thoughtworks.workshop.kotlin.pizza

class Dough(
    val pizza: Pizza,
    override val dough: String,
    cost: Double

) : Pizza by pizza {
    override val price = pizza.price + cost


    companion object {
        fun cheeseBurst(pizza: Pizza) = Dough(pizza = pizza, dough = "Cheese Burst", cost = 75.0)
        fun thinCrust(pizza: Pizza) = Dough(pizza, "Thin Crust", 50.0)
    }
}
