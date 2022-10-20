package kz.sabyrzhan.peoplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.myButton)
        val textView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        myButton.setOnClickListener {
            timesClicked++
            textView.text = timesClicked.toString()
            Toast.makeText(this, "this is the toast!", Toast.LENGTH_SHORT).show()
        }
    }
}