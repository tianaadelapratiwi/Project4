package com.tianaadelapratiwi.project_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tianaadelapratiwi.project_4.model.User
import kotlinx.android.synthetic.main.activity_explicit_intent.*

class ParcelableActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_USER = "extra_user"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable)

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User

        txt_nama.text = user.name
        txt_email.text = user.email
        txt_age.text = user.age

        btn_back.setOnClickListener {
            val backIntent = Intent(this@ParcelableActivity, MainActivity::class.java)
            startActivity(backIntent)
        }
    }
}