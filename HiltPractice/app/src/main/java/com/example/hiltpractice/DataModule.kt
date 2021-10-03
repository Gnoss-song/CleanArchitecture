package com.example.hiltpractice

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@InstallIn(ApplicationComponent::class)
@Module
object DataModule {
    @Provides
    fun provideMemoDB(@ApplicationContext context : Context)=
        Room.databaseBuilder(context,MemoDatabase::class.java,"Memo.db").build()
}