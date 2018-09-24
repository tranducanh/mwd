package mowede.framework.ititit.ui.login.view

import mowede.framework.ititit.ui.base.view.MVPView

interface LoginMVPView : MVPView {

    fun showValidationMessage(errorCode: Int)
    fun openMainActivity()
}