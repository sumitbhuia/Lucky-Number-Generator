package com.example.luckynumber

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1:Button = findViewById(R.id.btn)
        val name:EditText = findViewById(R.id.name)
      //  val txt:TextView = findViewById(R.id.text)

        b1.setOnClickListener {
            val inputName = name.text.toString()
            //Explicit Intent
            val i = Intent(this , LuckyNumberActivity::class.java)
            //Passing Data
            i.putExtra("name",inputName)
            startActivity(i)
        }



    }
}