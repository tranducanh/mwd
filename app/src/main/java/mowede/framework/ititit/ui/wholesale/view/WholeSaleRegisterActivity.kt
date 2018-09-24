package mowede.framework.ititit.ui.wholesale.view

import android.os.Bundle
import mowede.framework.ititit.R
import mowede.framework.ititit.ui.base.view.BaseActivity
import mowede.framework.ititit.ui.wholesale.interactor.WholeSaleMVPInteractor
import mowede.framework.ititit.ui.wholesale.presenter.WholeSaleMVPPresenter
import kotlinx.android.synthetic.main.activity_register.*
import mowede.framework.ititit.models.RegistedUser
import javax.inject.Inject

class WholeSaleRegisterActivity: BaseActivity(),WholeSaleRegisterMVPView {
    override fun getUser(): RegistedUser {
        var user = RegistedUser(123,et_full_name.text.toString(),et_email.text.toString(),true,et_username.text.toString(),et_password.text.toString())
        return user
    }

    @Inject
    internal lateinit var presenter: WholeSaleMVPPresenter<WholeSaleRegisterMVPView, WholeSaleMVPInteractor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        presenter.onAttach(this)
        setOnClickListeners()
    }

    override fun onFragmentDetached(tag: String) {
    }
    override fun onFragmentAttached() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showValidationMessage(errorCode: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }
    override fun openMainActivity() {
        finish()
    }
    private fun setOnClickListeners() {
        var user = RegistedUser(123,et_full_name.text.toString(),et_email.text.toString(),true,et_username.text.toString(),et_password.text.toString())
        btnRegister.setOnClickListener { presenter.doRegisterClick(user) }
    }
}