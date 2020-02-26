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
        human.think()

        val human2 = Human("aya",8,"友達")
        human2.say()
        human2.think()
    }
}