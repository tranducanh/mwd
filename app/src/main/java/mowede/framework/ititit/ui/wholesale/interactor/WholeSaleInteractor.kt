package mowede.framework.ititit.ui.wholesale.interactor

import io.reactivex.Observable
import mowede.framework.ititit.data.network.ApiHelper
import mowede.framework.ititit.data.network.LoginRequest
import mowede.framework.ititit.data.network.LoginResponse
import mowede.framework.ititit.data.preferences.PreferenceHelper
import mowede.framework.ititit.models.RegistedUser
import mowede.framework.ititit.models.User
import mowede.framework.ititit.ui.base.interactor.BaseInteractor
import mowede.framework.ititit.ui.login.interactor.LoginMVPInteractor
import mowede.framework.ititit.util.AppConstants
import javax.inject.Inject

class WholeSaleInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), WholeSaleMVPInteractor {

    override fun doGoogleLoginApiCall() =
            apiHelper.performGoogleLogin(LoginRequest.GoogleLoginRequest("test1", "test1"))

    override fun doFBLoginApiCall() =
            apiHelper.performFBLogin(LoginRequest.FacebookLoginRequest("test3", "test4"))


    override fun doServerLoginApiCall(email: String, password: String) =
            apiHelper.performServerLogin(LoginRequest.ServerLoginRequest(email = email, password = password))


    override fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode) =
            preferenceHelper.let {
                it.setCurrentUserId(loginResponse.userId)
                it.setAccessToken(loginResponse.accessToken)
                it.setCurrentUserLoggedInMode(loggedInMode)
            }

    override fun doRegisterApiCall(user: RegistedUser): Observable<LoginResponse> =
        apiHelper.performServerRegister(LoginRequest.ServerRegisterRequest(fullName = user.fullName, email = user.email, password = user.password,Id = user.Id))

}