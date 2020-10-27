package com.thoughtworks.workshop.kotlin.cmd.pizza.dsl

import com.thoughtworks.workshop.kotlin.pizza.Dough.Companion.cheeseBurst
import com.thoughtworks.workshop.kotlin.pizza.Dough.Companion.thinCrust
import com.thoughtworks.workshop.kotlin.pizza.FarmHouse
import com.thoughtworks.workshop.kotlin.pizza.Pizza
import com.thoughtworks.workshop.kotlin.pizza.Topping

fun pizza(init: ToppingBuilder.() -> Unit): ToppingBuilder {
    return ToppingBuilder().apply(init)
}

class ToppingBuilder {
    fun build(pizza: Pizza): Pizza {
        var finalPizza = pizza
        toppings.forEach {
            finalPizza = Topping(finalPizza, it)
        }
        toppings.clear()
        return finalPizza
    }

    companion object {
        var toppings = mutableListOf<String>()
        infix fun with(type: String) {
            toppings.add(type)
        }
    }
}

typealias topped = ToppingBuilder

object CheeseBurst : PizzaBase {
    override val type: Pizza
        get() = cheeseBurst(FarmHouse())
}

object Just : PizzaBase {
    override val type: Pizza
        get() = FarmHouse()
}

object ThinCrust : PizzaBase {
    override val type: Pizza
        get() = thinCrust(FarmHouse())
}