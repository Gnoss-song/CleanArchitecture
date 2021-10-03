package com.example.dipractice

interface Patty {
    fun getPatty(): String
}

interface Bun {
    fun getBun(): String
}

interface Market {
    fun getMarket(): String
}

class BulgogiPatty : Patty {
    override fun getPatty() = "불고기"
}

class HomilBun : Bun {
    override fun getBun() = "호밀"
}

class Lottelia : Market {
    override fun getMarket() = "롯데리아"
}

class ShirimpPatty : Patty {
    override fun getPatty() = "새우"
}

class MealBun : Bun {
    override fun getBun() = "통밀"
}
