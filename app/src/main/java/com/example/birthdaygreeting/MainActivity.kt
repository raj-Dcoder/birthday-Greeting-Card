package com.example.birthdaygreeting

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.birthdaygreeting.ui.theme.BirthdayGreetingTheme

class MainActivity() : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.createButton)

        val editTextName=findViewById<EditText>(R.id.text_input)


        myButton.setOnClickListener {

            val name=editTextName.text.toString()
            Toast.makeText(this, "Name is $name", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, BirthdayCardActivity::class.java)
            intent.putExtra(BirthdayCardActivity.NAME_EXTRA,name)
            startActivity(intent)
        }

    }
}
