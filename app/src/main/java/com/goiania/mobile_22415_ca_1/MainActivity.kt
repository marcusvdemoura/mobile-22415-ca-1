package com.goiania.mobile_22415_ca_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val number1 = findViewById(R.id.first_number) as EditText
        val number2 = findViewById(R.id.second_number) as EditText
        val result = findViewById(R.id.result) as EditText
        val button_add = findViewById(R.id.add_button) as Button


        button_add.setOnClickListener{

            val val1 = number1.text.toString().toInt()
            val val2 = number2.text.toString().toInt();
            val res = val1 + val2

            result.setText(res.toString())

        }





    }


}