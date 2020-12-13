package com.tianaadelapratiwi.project_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ResultActivity : AppCompatActivity() {
    companion object{
        const val RESULT_CODE = 200
        const val EXTRA_COLOR = "extra_color"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        btn_result.setOnClickListener {
            if(rg_colors.checkedRadioButtonId !=0){
                var value = "#ffffff"
                when (rg_colors.checkedRadioButtonId){
                    R.id.rad_black -> value = "#000000"
                    R.id.rad_blue -> value = "#0000ff"
                    R.id.rad_green -> value ="#00ff00"
                    R.id.rad_red -> value = "#ff0000"
                }
                Log.d("selected Color",value.toString())
                val resultIntent = Intent()
                resultIntent.putExtra(EXTRA_COLOR, value)
                setResult(200, resultIntent)
                finish()
            }

        }
    }
}