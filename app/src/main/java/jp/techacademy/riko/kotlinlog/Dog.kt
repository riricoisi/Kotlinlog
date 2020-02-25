package jp.techacademy.riko.kotlinlog

import android.util.Log

open class Dog : Animal,Mobable {
    //引数付きコントラクタ
    constructor(name: String, age: Int) :super(name,age){
    }

    //Animalクラスメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    //Movableインターフェースのメソッドをオーバーライド
    override fun move(){
        Log.d("kotlintest",this.name+"("+this.age+"歳)"+"は全力で走った。")
    }

}

