package com.bgu.laba3_calculator

class ResultActionManager {
    fun processAction(fistValue: Int, secondValue: Int, action: Event.Action): Int {
        return when (action) {
            Event.Action.Minus -> fistValue - secondValue
            Event.Action.Plus -> fistValue + secondValue
            Event.Action.Divide -> fistValue / secondValue
            Event.Action.Multiply -> fistValue * secondValue
            else -> {0}
        }
    }
}