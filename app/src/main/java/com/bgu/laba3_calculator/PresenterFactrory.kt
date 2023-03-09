package com.bgu.laba3_calculator

class PresenterFactrory {

    fun createPresenter(time:Long): MainScreenPresenter{
      return  if(time>100000){
            MainScreenPresenterImpl()
        }else{
            FunnyMainScreenPresenter()
        }
    }
}