package com.tianaadelapratiwi.project_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_simple_intent.setOnClickListener { it:View!
            val sompleIntent = Intent (packageContext: this@MainActivity, SimpleActivity ::class.java)
            startAcitivity(simpleIntent)

        }
    }
}