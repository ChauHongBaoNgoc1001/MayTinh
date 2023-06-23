package com.example.maytinh

import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView.CheckedIconGravity

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)


        var  A:EditText = findViewById(R.id.soA)
        var  B:EditText =  findViewById(R.id.soB)
        val  Cong:Button = findViewById(R.id.Cong)
        val  Tru:Button = findViewById(R.id.Tru)
        val  Nhan:Button = findViewById(R.id.Nhan)
        val  Chia:Button = findViewById(R.id.Chia)
        val  KQ:TextView = findViewById(R.id.KetQua)




        // Chỉ cho phép nhập số và số thập phân
        A.inputType = InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_FLAG_DECIMAL
        B.inputType = InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_FLAG_DECIMAL




        Cong.setOnClickListener{
             // Lấy giá trị số A và số B từ EditText
             val A = A.text.toString()
             val B = B.text.toString()

             val Cong = A.toFloat() +B.toFloat()
             KQ.text="$Cong"
         }


        Tru.setOnClickListener{
            // Lấy giá trị số A và số B từ EditText
            val A = A.text.toString()
            val B = B.text.toString()

            val Tru = A.toFloat() - B.toFloat()
            KQ.text="$Tru"
        }


        Chia.setOnClickListener{
            // Lấy giá trị số A và số B từ EditText
            val A = A.text.toString()
            val B = B.text.toString()

            val Chia = A.toFloat() / B.toFloat()
            KQ.text="$Chia"
        }


        Nhan.setOnClickListener{
            // Lấy giá trị số A và số B từ EditText
            val A = A.text.toString()
            val B = B.text.toString()

            val Nhan = A.toFloat() * B.toFloat()
            KQ.text="$Nhan"
        }
    }



    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}