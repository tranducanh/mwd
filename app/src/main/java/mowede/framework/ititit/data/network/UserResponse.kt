package mowede.framework.ititit.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserResponse internal constructor(@Expose
                                                 @SerializedName("login")
                                                 private var userName: String? = null,
                                                 @Expose
                                                 @SerializedName("url")
                                                 private var url: String? = null,
                                                 @Expose
                                                 @SerializedName("avatar_url")
                                                 private var avatar_url: String? = null,
                                                 @Expose
                                                 @SerializedName("followers_url")
                                                 private var followers_url: String? = null,
                                                 @Expose
                                                 @SerializedName ("following_url")
                                                 private var following_url: String? = null
                                                 )