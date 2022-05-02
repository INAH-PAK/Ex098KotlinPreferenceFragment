package com.wookie_soft.ex098kotlinpreferencefragment

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.preference.PreferenceManager

class MainActivity : AppCompatActivity() {

    //환경설정 페이지 만들기 예제 ~
    // 정적추가시 - ~~~.-> 동적으로 추가해야 함,
    // 안드로이드에서
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 방금만든 setting Fragment 동적으로 추가하기
        // 정적으로 xml에 붙이면 추가 삭제 수정이 안됨 ~

        // add :  중첩될 가능성이 있어서 개발사이트에선 replace 하라고 함,
        // replace
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container_view,SettingFragment()).commit()

        //인트로 화면에서 저장된 설정값들을 읽어오기
        loadPreference()



    }

    private fun loadPreference(){
        // 저장되어 있는 shered preference에 저장된 값들을 읽어오기 ( 사용자가 설정한 값들 ~~)
        val pref:SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        var isMessage:Boolean = pref.getBoolean("massege",false) // getBoolean( 식별자 , 디폴트값 )
        var isVibrate:Boolean = pref.getBoolean("vibration",false) // getBoolean( 식별자 , 디폴트값 )
        Toast.makeText(this, "sound msg : $isMessage \n vibration : $isVibrate", Toast.LENGTH_SHORT).show()
    }


}