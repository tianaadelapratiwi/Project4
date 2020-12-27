package com.tianaadelapratiwi.project_4.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User (
        val name : String,
        val email : String,
        val age : String
        ): Parcelable