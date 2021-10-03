package com.example.dipractice

import android.util.Log
import javax.inject.Inject


class Burgers @Inject constructor( private val bun: Bun,private val patty: Patty,private val market: Market){
    fun info(){
        Log.d("test","Bun:${bun.getBun()}  patty : ${patty.getPatty()} market : ${market.getMarket()}")
    }
}

