package mowede.framework.ititit.models

data class UnregisterUser(override val Id: Int, override val fullName: String, override val email: String, override val isRegister: Boolean ) : User {
    override fun hasRegister(): Boolean = false
}

//data class GitUser(override val Id: Int, override val fullName: String, override val email: String, override val isRegister: Boolean,
//                   val url:String, val home_url:String, val avatar_url:String,val following_url:String
//) : User {
//    override fun hasRegister(): Boolean = false
//}

data class GitUser(val url:String, val home_url:String, val avatar_url:String,val following_url:String)
