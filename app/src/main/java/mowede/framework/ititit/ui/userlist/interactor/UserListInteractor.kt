package mowede.framework.ititit.ui.userlist.interactor

import io.reactivex.Observable
import mowede.framework.ititit.data.network.ApiHelper
import mowede.framework.ititit.data.network.UserResponse
import mowede.framework.ititit.data.preferences.PreferenceHelper
import mowede.framework.ititit.ui.base.interactor.BaseInteractor
import javax.inject.Inject

class UserListInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), UserListIInteractor {
    override fun getUserList(): Observable<UserResponse> {
        val users :Observable<UserResponse> = apiHelper.getListUserApiCall()
        return users
    }
}