package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn = findViewById<View>(R.id.cal_button)
        btn.setOnClickListener(){
            //car loan
            val inputValue1 = car_price_edit.text.toString()
            val inputValue2 = dpa_edit.text.toString()
            val outputValue1:Double = inputValue1.toDouble() - inputValue2.toDouble()

            txtLoan.text = "RM %.2f".format(outputValue1)

            //interest
            val inputValue3 = interest_rate_edit.text.toString()
            val inputValue4 = load_period_edit.text.toString()
            val outputValue2:Double = outputValue1.toDouble()*(inputValue3.toDouble()/100.0.toDouble())*inputValue4.toDouble()
            txtInterest.text = "RM %.2f".format(outputValue2)
            //monthlyRepayment
            val outputValue3:Double = (outputValue1.toDouble()+outputValue2.toDouble())/inputValue4.toDouble()/12.0.toDouble()
            txtRepayment.text = "RM %.2f".format(outputValue3)


        }

    }

}
