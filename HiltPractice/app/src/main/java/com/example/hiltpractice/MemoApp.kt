package com.example.hiltpractice

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//의존성 주입의 시작점
@HiltAndroidApp
class MemoApp : Application() {
}