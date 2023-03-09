package com.bgu.laba3_calculator

sealed interface Event {


    class Number(val number: Int) : Event


    interface Action : Event {
        object Plus : Action
        object Minus : Action
        object Divide : Action
        object Multiply : Action
        object Equals : Action
    }


}


