package mowede.framework.ititit.ui.login.interactor

import mowede.framework.ititit.data.network.LoginResponse
import mowede.framework.ititit.ui.base.interactor.MVPInteractor
import mowede.framework.ititit.util.AppConstants
import io.reactivex.Observable

interface LoginMVPInteractor : MVPInteractor {

    fun doServerLoginApiCall(email: String, password: String): Observable<LoginResponse>

    fun doFBLoginApiCall(): Observable<LoginResponse>

    fun doGoogleLoginApiCall(): Observable<LoginResponse>

    fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode)

}