package com.bgu.laba3_calculator

interface MainScreenPresenter {

    fun setView(view : MainScreenView)

    fun reset()

    fun addEvent(action: Event)


}