package com.alialfayed.buttonclick

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnRed.setOnClickListener(this)
        btnGreen.setOnClickListener(this)
        btnOrange.setOnClickListener(this)
        btnBlue.setOnClickListener(this)
        btnOrange2.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val itemView = view?.id
        when (itemView) {
            R.id.btnRed -> {
                val layout = findViewById<ConstraintLayout>(R.id.backgroundActivity)
                layout.setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))
                txtColor.setTextColor(resources.getColor(android.R.color.white))
                txtColor.text = "RED"
            }
            R.id.btnGreen -> {
                val layout = findViewById<ConstraintLayout>(R.id.backgroundActivity)
                layout.setBackgroundColor(resources.getColor(android.R.color.holo_green_light))
                txtColor.setTextColor(resources.getColor(android.R.color.white))
                txtColor.text = "Green"

            }
            R.id.btnOrange -> {
                val layout = findViewById<ConstraintLayout>(R.id.backgroundActivity)
                layout.setBackgroundColor(resources.getColor(android.R.color.holo_orange_light))
                txtColor.setTextColor(resources.getColor(android.R.color.white))
                txtColor.text = "Orange"

            }
            R.id.btnBlue -> {
                val layout = findViewById<ConstraintLayout>(R.id.backgroundActivity)
                layout.setBackgroundColor(resources.getColor(android.R.color.holo_blue_light))
                txtColor.setTextColor(resources.getColor(android.R.color.white))
                txtColor.text = "Blue"

            }
            R.id.btnOrange2 -> {
                val layout = findViewById<ConstraintLayout>(R.id.backgroundActivity)
                layout.setBackgroundColor(resources.getColor(android.R.color.holo_orange_dark))
                txtColor.setTextColor(resources.getColor(android.R.color.white))
                txtColor.text = "Orange2"
            }
        }

    }
}
