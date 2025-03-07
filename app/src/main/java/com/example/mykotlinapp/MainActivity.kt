
package com.example.mykotlinapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMultiple: Button
    lateinit var btnDivison: Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var resultTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_sub)
        btnMultiple = findViewById(R.id.btn_multiple)
        btnDivison = findViewById(R.id.btn_divison)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.result_tv)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMultiple.setOnClickListener(this)
        btnDivison.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add -> {
                result = a+b
            }
            R.id.btn_sub -> {
                result = a-b
            }
            R.id.btn_multiple -> {
                result = a*b
            }
            R.id.btn_divison -> {
                result = a/b
            }
        }
        resultTv.text = "Result is: $result"
    }
}