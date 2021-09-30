package com.example.observerpattern

//5배수가 감지되면 지정된 이벤트를 발생시킵니다.
//종이 울리면 이벤트를 발생시킬건데, 종을 치는 조건을 적는 공간.
class Counter(var listenr: EventListenr) {
    //생성자로 이벤트리스너를 넘겨받습니다.
    fun count(){
        for (i in 1..100){
            if (i%5==0){
                //종친다.
                listenr.onEvent(i)
            }
        }
    }
}