package mowede.framework.ititit.models

data class RegistedUser(override val Id: Int, override val fullName: String, override val email: String, override val isRegister: Boolean,val username: String, val password: String ) : User {
    override fun hasRegister(): Boolean = true
}