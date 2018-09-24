package mowede.framework.ititit.ui.userlist.interactor

import io.reactivex.Observable
import mowede.framework.ititit.data.network.UserResponse
import mowede.framework.ititit.ui.base.interactor.MVPInteractor

interface UserListIInteractor:MVPInteractor {
    fun getUserList(): Observable<UserResponse>
}