package com.otavro.lista_de_contato

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Contact (
    var name: String,
    var phone : String,
    var photography : String
) : Parcelable