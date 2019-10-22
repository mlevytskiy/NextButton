package com.onboarding.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.onboarding.nextbutton.CircularProgressButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextButton = findViewById<CircularProgressButton>(R.id.next_button)
        nextButton.setOnClickListener {
            if (nextButton.progress == 0) {
                nextButton.isIndeterminateProgressMode = true
                nextButton.progress = 50
                it.postDelayed({
                    nextButton.progress = 100
                    it.postDelayed({
                        nextButton.progress = 0
                    }, 1500)
                }, 5000)
            }
        }
    }

}
