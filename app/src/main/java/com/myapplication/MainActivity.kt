package com.myapplication

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the widgets
        val textView = findViewById<TextView>(R.id.text_view)
        val button = findViewById<Button>(R.id.button);
        val button2 = findViewById<Button>(R.id.button2);
        val button3 = findViewById<Button>(R.id.button3);
        val button4 = findViewById<Button>(R.id.button4);

        // Counter to count button click
        var counter: Int = 0;

        // Set a click listener for button widget
        button.setOnClickListener{
            counter++
            textView.text = "Click counter : $counter"
        }

        // Another way to set button click listener
        button2.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                counter++
                textView.text = "Click counter : $counter"
                v?.setBackgroundColor(Color.MAGENTA)
            }
        })

        // Another way to set button click listener
        button3.setOnClickListener({
                v->
            counter++
            textView.text = "Click counter : $counter"
            v.setBackgroundColor(Color.RED)

        })

        // Another way to set button click listener
        button4.setOnClickListener{
            counter++;
            textView.text = "Click counter : $counter"
            it.setBackgroundColor(Color.YELLOW)
        }
    }
}