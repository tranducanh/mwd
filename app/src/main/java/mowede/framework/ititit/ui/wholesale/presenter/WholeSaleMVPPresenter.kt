package mowede.framework.ititit.ui.wholesale.presenter
import mowede.framework.ititit.models.RegistedUser
import mowede.framework.ititit.ui.base.presenter.MVPPresenter
import mowede.framework.ititit.ui.wholesale.interactor.WholeSaleMVPInteractor
import mowede.framework.ititit.ui.wholesale.view.WholeSaleRegisterMVPView

interface WholeSaleMVPPresenter<V: WholeSaleRegisterMVPView, I : WholeSaleMVPInteractor>: MVPPresenter<V, I> {
    fun doRegisterClick(user: RegistedUser)
}