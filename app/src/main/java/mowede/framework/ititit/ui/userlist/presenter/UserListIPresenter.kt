package mowede.framework.ititit.ui.userlist.presenter

import mowede.framework.ititit.ui.base.presenter.MVPPresenter
import mowede.framework.ititit.ui.userlist.interactor.UserListIInteractor
import mowede.framework.ititit.ui.userlist.view.UserListView

interface UserListIPresenter <V: UserListView,I: UserListIInteractor>:MVPPresenter<V, I>{
    fun doShowListUser()
}