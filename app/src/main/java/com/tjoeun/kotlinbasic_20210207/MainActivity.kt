package com.tjoeun.kotlinbasic_20210207

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendBtn.setOnClickListener {

//            Ctrl + ㅣ로 이줄을 주석으로.
//            sendBtn이 눌리면 싱행해준 코드

            Log.d("메인 화면" , "전송버튼이 눌림")

        }

    }
}