package com.thoughtworks.workshop.kotlin.cmd.pizza

import com.thoughtworks.workshop.kotlin.cmd.pizza.dsl.*
import com.thoughtworks.workshop.kotlin.pizza.Pizza
import com.thoughtworks.workshop.kotlin.pizza.description

fun main() {
    val pizza: Pizza = CheeseBurst FarmHouse pizza {
        topped with "Golden corn"
    }

    println(pizza.description())

    val farmHousePizza: Pizza = CheeseBurst FarmHouse pizza {
        topped with "Golden corn"
        topped with "Honey"
    }

    val pizzaPlain = Just FarmHouse pizza {
        topped with "extra cheese"
        topped with "Olives"
    }

    val thinPizza = ThinCrust FarmHouse pizza {
        topped with "Spinach"
        topped with "Baby Corn"
        topped with "Extra Olives"
    }
    println(farmHousePizza.description())
    println(pizzaPlain.description())
    println(thinPizza.description())
}
