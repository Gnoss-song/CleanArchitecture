package com.example.dipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val mymenu = DaggerBugerComponent.create().callBurgers()
//        mymenu.info()

        val bulgogiBurger = DaggerBugerComponent.create().CallBulgogi()
        val shirimpBurger = DaggerBugerComponent.create().CallShrimp()

        bulgogiBurger.info()
        shirimpBurger.info()
    }
}
