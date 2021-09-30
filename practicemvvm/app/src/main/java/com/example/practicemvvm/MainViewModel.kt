package com.example.practicemvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel(){
    val firstNum = MutableLiveData<String>()
    val secondNum = MutableLiveData<String>()
    val result = MutableLiveData<String>()
    fun calc(op: Char) {
        result.value = when (op) {
            '+' -> (firstNum.value!!.toInt() + secondNum.value!!.toInt()).toString()
            '-' -> (firstNum.value!!.toInt() - secondNum.value!!.toInt()).toString()
            '*' -> (firstNum.value!!.toInt() * secondNum.value!!.toInt()).toString()
            '/' -> (firstNum.value!!.toInt() / secondNum.value!!.toInt()).toString()
            else -> ""
        }
    }
}