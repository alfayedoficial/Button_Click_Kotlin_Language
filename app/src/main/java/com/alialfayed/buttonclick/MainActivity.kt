package com.alialfayed.buttonclick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnChageText.setOnClickListener {
            textView.text= "AndroidX Code"
            btnChageText.visibility = View.GONE
            btnGoToActivity.visibility = View.VISIBLE
        }
        btnGoToActivity.setOnClickListener {
            val intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
