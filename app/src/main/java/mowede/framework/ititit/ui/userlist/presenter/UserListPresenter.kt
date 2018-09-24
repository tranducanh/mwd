package mowede.framework.ititit.ui.userlist.presenter

import io.reactivex.disposables.CompositeDisposable
import mowede.framework.ititit.ui.base.presenter.BasePresenter
import mowede.framework.ititit.ui.userlist.interactor.UserListIInteractor
import mowede.framework.ititit.ui.userlist.view.UserListView
import mowede.framework.ititit.util.SchedulerProvider
import javax.inject.Inject

class UserListPresenter<V: UserListView, I:UserListIInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), UserListIPresenter<V, I> {
    override fun doShowListUser() {
        getView()?.showProgress()
        interactor?.let {
            compositeDisposable.add(it.getUserList()
                    .compose(schedulerProvider.ioToMainObservableScheduler())
                    .subscribe { users ->
                        getView()?.let {
                            it.hideProgress()
                            it.displayUserList(users.data)
                        }
                    })
        }
    }
}