package com.example.ipalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etAngka1: EditText = findViewById(R.id.input_edit_angka1)
        val etAngka2: EditText = findViewById(R.id.input_edit_angka2)

        val tvResult: TextView = findViewById(R.id.tv_result)

        val btnMultiple: Button = findViewById(R.id.btn_multiple)
        btnMultiple.setOnClickListener{
            val angka1 = etAngka1.text.toString()
            val angka2 = etAngka2.text.toString()

            if(checkInput(angka1, angka2)){
                val plusResult = angka1.toInt().times(angka2.toInt())
                tvResult.visibility = View.VISIBLE
                tvResult.text = "$angka1 dikali dengan $angka2 adalah $plusResult"
            }
        }

        val btnDivide: Button = findViewById(R.id.btn_divide)
        btnDivide.setOnClickListener{
            val angka1 = etAngka1.text.toString()
            val angka2 = etAngka2.text.toString()

            if(checkInput(angka1, angka2)){
                val plusResult = angka1.toInt().div(angka2.toInt())
                tvResult.visibility = View.VISIBLE
                tvResult.text = "$angka1 dibagi dengan $angka2 adalah $plusResult"
            }
        }

        val btnPlus: Button = findViewById(R.id.btn_plus)
        btnPlus.setOnClickListener{
            val angka1 = etAngka1.text.toString()
            val angka2 = etAngka2.text.toString()

            if(checkInput(angka1, angka2)){
                val plusResult = angka1.toInt().plus(angka2.toInt())
                tvResult.visibility = View.VISIBLE
                tvResult.text = "$angka1 ditambah dengan $angka2 adalah $plusResult"
            }
        }

        val btnMinus: Button = findViewById(R.id.btn_minus)
        btnMinus.setOnClickListener{
            val angka1 = etAngka1.text.toString()
            val angka2 = etAngka2.text.toString()

            if(checkInput(angka1, angka2)){
                val plusResult = angka1.toInt().minus(angka2.toInt())
                tvResult.visibility = View.VISIBLE
                tvResult.text = "$angka1 dikurangi dengan $angka2 adalah $plusResult"
            }
        }

        val btnModulus: Button = findViewById(R.id.btn_modulus)
        btnModulus.setOnClickListener{
            val angka1 = etAngka1.text.toString()
            val angka2 = etAngka2.text.toString()

            if(checkInput(angka1, angka2)){
                val plusResult = angka1.toInt().mod(angka2.toInt())
                tvResult.visibility = View.VISIBLE
                tvResult.text = "$angka1 modulus $angka2 adalah $plusResult"
            }
        }

        val btnClear: Button = findViewById(R.id.btn_clear)
        btnClear.setOnClickListener{
            tvResult.visibility = View.INVISIBLE
            etAngka1.setText("")
            etAngka2.setText("")
        }

    }

    private fun checkInput(angka1: String, angka2: String): Boolean {
        return if (angka1.isEmpty() || angka2.isEmpty()) {
            Toast.makeText(this, "Angka tidak boleh kosong", Toast.LENGTH_SHORT).show()
            false
        }else{
            true
        }
    }


}