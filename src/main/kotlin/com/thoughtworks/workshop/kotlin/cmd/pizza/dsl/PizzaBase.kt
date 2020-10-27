package com.thoughtworks.workshop.kotlin.cmd.pizza.dsl

import com.thoughtworks.workshop.kotlin.pizza.Pizza

interface PizzaBase {
    val type: Pizza
    infix fun FarmHouse(builder: ToppingBuilder): Pizza = builder.build(type)
}