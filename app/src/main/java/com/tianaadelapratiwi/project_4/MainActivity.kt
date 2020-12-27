package com.tianaadelapratiwi.project_4

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.tianaadelapratiwi.project_4.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val REQUEST_CODE = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btn_simple_intent.setOnClickListener {
            val simpleIntent = Intent(this@MainActivity, SimpleActivity::class.java)
            startActivity(simpleIntent)
        }
        btn_intent_with_data.setOnClickListener {
            val dataIntent = Intent(this@MainActivity, ExplicitIntentActivity::class.java)

            dataIntent.putExtra(ExplicitIntentActivity.EXTRA_NAME, "HELM RSV black dof Visor smoke spoiler GPR-R")
            dataIntent.putExtra(ExplicitIntentActivity.EXTRA_EMAIL, "40 Stok")
            dataIntent.putExtra(ExplicitIntentActivity.EXTRA_AGE, "1.260.000")

            startActivity(dataIntent)
        }
        btn_intent_parcelable.setOnClickListener {
            val parcelIntent = Intent(this@MainActivity, ParcelableActivity::class.java)
            val user = User("HELM RSV black dof Visor smoke spoiler GPR-R", "40 Stok", "1.260.0000")
            parcelIntent.putExtra(ParcelableActivity.EXTRA_USER, user)
            startActivity(parcelIntent)
        }
        btn_implicit_intent.setOnClickListener {
            val phoneNumber = "085349466908"
            val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:$phoneNumber"))
            intent.putExtra("sms_body", "Congratulations")
            startActivity(intent)
        }
        btn_intent_result.setOnClickListener {
            val intent = Intent(this@MainActivity, ResultActivity::class.java)
            startActivityForResult(intent, REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(resultCode, resultCode, data)
        if(resultCode == 200){
            val color = data?.getStringExtra(ResultActivity.EXTRA_COLOR)
            Log.d("Color",color.toString())
            view_result.setBackgroundColor(Color.parseColor(color.toString()))
        }
    }
}