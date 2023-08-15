package com.example.luckynumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import kotlin.random.Random

class LuckyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)

        val luckyNum: TextView = findViewById(R.id.luckynumtxt)
        val txt2: TextView = findViewById(R.id.text2)
        val shareBtn: Button = findViewById(R.id.btnshare)
        val user_name = receiveUserName()
        val random_num = generateRandomNum()
        luckyNum.text = " "+random_num

        shareBtn.setOnClickListener(){
            shareData(user_name,random_num)
        }

    }
    fun receiveUserName(): String {
        var bundle: Bundle? = intent.extras
        var username = bundle?.get("name").toString()
        return username
    }
    //Generate random number
    fun generateRandomNum():Int{
        var randomNum = Random.nextInt(1000)
        return randomNum
    }
    fun shareData(name_para:String ,num_para:Int){
        val i =Intent(Intent.ACTION_SEND)
        i.setType("text/plain")
        i.putExtra(Intent.EXTRA_TEXT,"$name_para is lucky today.The luck number is "+num_para )
        startActivity(i)
    }
}
