package com.example.practiceclean

class MainPresenter(val view: Contract.View) : Contract.Presenter {

    //View에서 보여줄 값들을계산함.
    override fun calc(x: Int, y: Int, type: Char) {
        val res = when (type) {
            '+' -> x + y
            '-' -> x - y
            '*' -> x * y
            '/' -> x / y
            else -> 0
        }
        view.setCalcResult(res)
    }
}