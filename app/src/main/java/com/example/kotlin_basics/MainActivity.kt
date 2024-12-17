package com.example.kotlin_basics

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var myTextView: TextView
    lateinit var myEditText: EditText
    lateinit var myButton: Button
    lateinit var myImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //set the content view to the activity_main.xml layout file
        setContentView(R.layout.activity_main)

        //Initialising Views
        myTextView = findViewById(R.id.textView6)
        myTextView.setText("Welcome to Android")
        myEditText = findViewById(R.id.editText6)
        myButton = findViewById(R.id.button)
        myImageView = findViewById(R.id.imageView)

        myButton.setOnClickListener {
            Toast.makeText(this,"Button Clicked",Toast.LENGTH_LONG).show()

            myImageView.setImageResource(R.drawable.highs6)
        }


    }
}