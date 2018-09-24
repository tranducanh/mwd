package mowede.framework.ititit.ui.splash.view

import android.content.Intent
import android.os.Bundle
import mowede.framework.ititit.R
import mowede.framework.ititit.ui.base.view.BaseActivity
import mowede.framework.ititit.ui.login.view.LoginActivity
import mowede.framework.ititit.ui.splash.interactor.SplashMVPInteractor
import mowede.framework.ititit.ui.splash.presenter.SplashMVPPresenter
import mowede.framework.ititit.ui.wholesale.view.WholeSaleRegisterActivity

import javax.inject.Inject

class SplashMVPActivity : BaseActivity(), SplashMVPView {

    @Inject
    lateinit var presenter: SplashMVPPresenter<SplashMVPView, SplashMVPInteractor>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        presenter.onAttach(this)
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onFragmentDetached(tag: String) {
    }

    override fun onFragmentAttached() {
    }

    override fun showSuccessToast() {
    }

    override fun showErrorToast() {
    }

    override fun openMainActivity() {
    }

    override fun openLoginActivity() {
        val intent = Intent(this, WholeSaleRegisterActivity::class.java)
        startActivity(intent)
        finish()
    }
}
