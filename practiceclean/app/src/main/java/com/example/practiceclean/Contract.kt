package com.example.practiceclean

interface Contract {

    //View와 Presenter 에서 필요한 메소드들을 가지고있음 interface
    interface View  {
        fun setCalcResult(res: Int)
        fun getFirstNum(): Int
        fun getSecondNum(): Int
    }
    interface Presenter  {
        fun calc(x: Int, y: Int, type: Char)
    }
}