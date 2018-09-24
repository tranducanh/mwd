package mowede.framework.ititit.data.network

import io.reactivex.Observable

interface ApiHelper {

    fun performServerLogin(request: LoginRequest.ServerLoginRequest): Observable<LoginResponse>

    fun performFBLogin(request: LoginRequest.FacebookLoginRequest): Observable<LoginResponse>

    fun performGoogleLogin(request: LoginRequest.GoogleLoginRequest): Observable<LoginResponse>

    fun performLogoutApiCall(): Observable<LogoutResponse>

    fun performServerRegister(request: LoginRequest.ServerRegisterRequest): Observable<LoginResponse>

    fun getListUserApiCall(): Observable<UserResponse>

}