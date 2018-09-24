package mowede.framework.ititit.di.builder

import mowede.framework.ititit.ui.login.LoginActivityModule
import mowede.framework.ititit.ui.login.view.LoginActivity
import mowede.framework.ititit.ui.splash.SplashActivityModule
import mowede.framework.ititit.ui.splash.view.SplashMVPActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import mowede.framework.ititit.ui.wholesale.WholeSaleRegisterModule
import mowede.framework.ititit.ui.wholesale.view.WholeSaleRegisterActivity

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(SplashActivityModule::class)])
    abstract fun bindSplashActivity(): SplashMVPActivity

    @ContributesAndroidInjector(modules = [(LoginActivityModule::class)])
    abstract fun bindLoginActivity(): LoginActivity

    @ContributesAndroidInjector(modules = [(WholeSaleRegisterModule::class)])
    abstract fun bindWholeSaleRegisterActivity(): WholeSaleRegisterActivity

}