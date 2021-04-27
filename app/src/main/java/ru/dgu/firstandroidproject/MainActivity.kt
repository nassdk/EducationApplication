package ru.dgu.firstandroidproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.TaskStackBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var increaseBtn: Button
    private lateinit var nextBtn: Button
    private lateinit var counterText: TextView

    private val argumentCounter = "argumentCounter"

    private var counter = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        increaseBtn = findViewById(R.id.increaseButton)
        nextBtn = findViewById(R.id.nextScreenButton)
        counterText = findViewById(R.id.counterTextView)

        increaseBtn.setOnClickListener {
            counter++
            counterText.text = "$counter"
            Toast.makeText(this, "Значение счетчика $counter", Toast.LENGTH_LONG).show()
        }

        nextBtn.setOnClickListener {

            val intent = Intent(this, ActivitySecond::class.java)

            val taskStackBuilder = TaskStackBuilder.create(this)
                .addNextIntent(intent)
                .addNextIntent(intent)
                .addNextIntent(intent)

            taskStackBuilder.startActivities()
//            intent.putExtra(argumentCounter, counter)
//            startActivity(intent)
        }
//        startActivity(Intent(this, ActivitySecond::class.java))
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt(argumentCounter, counter)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        counter = savedInstanceState.getInt(argumentCounter)
        counterText.text = "$counter"
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

// nassdk
// пароль - nassdk17
