package com.vsnap.vgn.application.Modal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class LoginResponse {

    @SerializedName("status")
    @Expose
    var status = 0

    @SerializedName("message")
    @Expose
    var message: String? = null

    @SerializedName("data")
    var data: List<LoginData>? = null

}