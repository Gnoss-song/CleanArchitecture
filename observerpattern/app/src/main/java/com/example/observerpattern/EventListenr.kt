package com.example.observerpattern

//이 이벤트를 상속받아, 이벤트가 발생할 때마다 호출할 메소드를 구현하면 됨.
//종의 역할
interface EventListenr {
    fun onEvent(count : Int)
}