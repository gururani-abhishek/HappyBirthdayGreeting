package org.example.happybirthdaywisher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NameKey = "NameKey"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NameKey)
        val Wish = findViewById<TextView>(R.id.Wish)
        Wish.text = "Happy Birthday\n $name!"
    }
}