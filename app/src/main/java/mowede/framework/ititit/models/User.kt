package mowede.framework.ititit.models

import android.os.Parcelable

interface  User {
    val Id: Int
    val fullName: String
    val email: String
    val isRegister: Boolean
    fun hasRegister() : Boolean
}

