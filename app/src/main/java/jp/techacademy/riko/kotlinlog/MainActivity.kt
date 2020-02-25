package jp.techacademy.riko.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("aki",2,"遊び")
        human.say()
        Log.d("kotlintest","年は" + human.age + "歳です")
        human.think()

        val human2 = Human("aya",8,"")
        human.say()
        Log.d("kotlintest","年は" + human2.age + "歳です")
        human2.think()
    }
}