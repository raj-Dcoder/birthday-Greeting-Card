package com.example.birthdaygreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class BirthdayCardActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA ="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card)

        val name=intent.getStringExtra(NAME_EXTRA)

        val birthdayGreeting= findViewById<TextView>(R.id.birthdayGreeting)
        birthdayGreeting.text = "Happy Birthday \n $name!"

    }


}