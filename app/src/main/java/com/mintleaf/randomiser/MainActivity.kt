package com.mintleaf.randomiser

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mintleaf.randomiser.ui.theme.RandomiserTheme
import java.util.Random

class MainActivity : ComponentActivity() {
    lateinit var minValue: EditText
    lateinit var maxValue: EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var buttonClick = findViewById<Button>(R.id.button)
        buttonClick.setOnClickListener {
            var resultsTextView = findViewById<TextView>(R.id.finalValue)
            minValue = findViewById(R.id.editMinNumber)
            maxValue = findViewById(R.id.editMaxNumber)
            val intMinValue = Integer.parseInt((minValue.text).toString())
            val intMaxValue = Integer.parseInt((maxValue.text).toString())
            if (intMinValue < intMaxValue) {
                val finalValue = (intMinValue..intMaxValue).random()
                resultsTextView.text = "Random Number: " + finalValue.toString()
            }
            else {
                resultsTextView.text = "Invalid Input, try again"
            }
            }
        }
    }
