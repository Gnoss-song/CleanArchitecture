package com.example.dipractice

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class BurgerModule {

    @Provides
    @Named("Bulgogi")
    fun provideBun(): Bun = HomilBun()

    @Provides
    @Named("Bulgogi")
    fun providePatty(): Patty = BulgogiPatty()

    @Provides
    @Named("Bulgogi")
    fun provideMarkekt() : Market = Lottelia()

    @Provides
    @Named("Shirimp")
    fun provideNewBun() : Bun = MealBun()

    @Provides
    @Named("Shirimp")
    fun provideShrimpPatty() : Patty = ShirimpPatty()

//    @Provides
//    fun provideBurger(bun :Bun, patty : Patty,market: Market) = Burgers(bun,patty,market)

    @Provides
    @Named("BulgogiBurger")
    fun provideBulgogiBurger(@Named("Bulgogi")bun :Bun, @Named("Bulgogi")patty : Patty,@Named("Bulgogi")market: Market) = Burgers(bun,patty,market)

    @Provides
    @Named("ShirimpBurger")
    fun provideShirimpBurger(@Named("Shirimp")bun :Bun, @Named("Shirimp")patty : Patty,@Named("Bulgogi")market: Market) = Burgers(bun,patty,market)

}