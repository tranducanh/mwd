package mowede.framework.ititit.ui.wholesale.interactor
import io.reactivex.Observable
import mowede.framework.ititit.data.network.LoginResponse
import mowede.framework.ititit.models.RegistedUser
import mowede.framework.ititit.ui.login.interactor.LoginMVPInteractor
import mowede.framework.ititit.models.User
interface WholeSaleMVPInteractor : LoginMVPInteractor {
    fun doRegisterApiCall(user: RegistedUser): Observable<LoginResponse>
}