package com.bgu.laba3_calculator

class EventActionToStringAdapter {

    fun toString(action: Event.Action) : String{
       return when(action){
            Event.Action.Plus -> "+"
            Event.Action.Minus -> "-"
            Event.Action.Divide -> "/"
            Event.Action.Multiply -> "*"
            Event.Action.Equals -> "="
           else -> "UNKNOWN ACTION"
       }
    }
}