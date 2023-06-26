package com.ampliar.listadecompras03

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Ar = findViewById<CheckBox>(R.id.checkBox)
        val Fe = findViewById<CheckBox>(R.id.checkBox2)
        val Ac = findViewById<CheckBox>(R.id.checkBox3)
        val Ma = findViewById<CheckBox>(R.id.checkBox4)
        val Le = findViewById<CheckBox>(R.id.checkBox5)
        val Bi = findViewById<CheckBox>(R.id.checkBox6)
        val Fa = findViewById<CheckBox>(R.id.checkBox7)

        val Tot = findViewById<Button>(R.id.button)


        Tot.setOnClickListener {
            var valorTotal: Double = 0.0

            if (Ar.isChecked) {
                valorTotal += 18.00
            }
            if (Fe.isChecked) {
                valorTotal += 12.00
            }
            if (Ac.isChecked) {
                valorTotal += 6.50
            }
            if (Ma.isChecked) {
                valorTotal += 4.50
            }
            if (Le.isChecked) {
                valorTotal += 5.50
            }
            if (Bi.isChecked) {
                valorTotal += 2.50
            }
            if (Fa.isChecked) {
                valorTotal += 3.20
            }
            Tot.setText(valorTotal.toString())
        }
    }
}