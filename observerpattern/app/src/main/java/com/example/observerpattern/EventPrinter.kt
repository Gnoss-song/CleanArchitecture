package com.example.observerpattern


//이벤트를 수신받았을 때 5배수를 출력.
//종은 쳤다. 무엇을 할래?
class EventPrinter : EventListenr {
    fun start(){
        //this를 통해 EventListener 구현부를 넘겨줌
        Counter(this).count()
    }
    //리스너를 상속받아 콜백 메소드를 구현(5배수를 프린트하는것)
    override fun onEvent(count: Int) {
        print("${count}-")
    }
}