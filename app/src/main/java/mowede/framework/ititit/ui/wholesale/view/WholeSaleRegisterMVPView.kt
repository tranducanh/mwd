package mowede.framework.ititit.ui.wholesale.view

import mowede.framework.ititit.models.RegistedUser
import mowede.framework.ititit.ui.base.view.MVPView

interface WholeSaleRegisterMVPView: MVPView {
    fun showValidationMessage(errorCode: Int)
    fun openMainActivity()
    fun getUser():RegistedUser
}