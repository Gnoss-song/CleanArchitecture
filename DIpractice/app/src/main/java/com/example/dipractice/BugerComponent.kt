package com.example.dipractice

import dagger.Component
import javax.inject.Named

@Component(modules = [BurgerModule::class])
interface BugerComponent {
//    fun callBurgers(): Burgers

    @Named("BulgogiBurger")
    fun CallBulgogi() : Burgers

    @Named("ShirimpBurger")
    fun CallShrimp() : Burgers
}