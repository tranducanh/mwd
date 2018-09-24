package mowede.framework.ititit.ui.wholesale.presenter

import android.util.Log
import io.reactivex.disposables.CompositeDisposable
import mowede.framework.ititit.models.RegistedUser
import mowede.framework.ititit.ui.base.presenter.BasePresenter
import mowede.framework.ititit.ui.wholesale.interactor.WholeSaleMVPInteractor
import mowede.framework.ititit.ui.wholesale.view.WholeSaleRegisterMVPView
import mowede.framework.ititit.util.SchedulerProvider
import javax.inject.Inject

class WholeSalePresenter<V : WholeSaleRegisterMVPView, I : WholeSaleMVPInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), WholeSaleMVPPresenter<V, I> {
    override fun doRegisterClick(user: RegistedUser) {
        var s = getView()?.getUser()
        Log.i("USER.NAME",user.username)
    }

}

