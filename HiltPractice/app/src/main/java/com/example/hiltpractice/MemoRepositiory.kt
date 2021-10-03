package com.example.hiltpractice

import javax.inject.Inject


class MemoRepositiory @Inject constructor(
    private val db : MemoDatabase
) {
    fun load(id:String){

    }
}