package mowede.framework.ititit.ui.wholesale

import dagger.Module
import dagger.Provides
import mowede.framework.ititit.ui.wholesale.interactor.WholeSaleInteractor
import mowede.framework.ititit.ui.wholesale.interactor.WholeSaleMVPInteractor
import mowede.framework.ititit.ui.wholesale.presenter.WholeSaleMVPPresenter
import mowede.framework.ititit.ui.wholesale.presenter.WholeSalePresenter
import mowede.framework.ititit.ui.wholesale.view.WholeSaleRegisterMVPView

@Module
class WholeSaleRegisterModule {
    @Provides
    internal fun provideWholeSaleInteractor(wholesaleInteractor: WholeSaleInteractor): WholeSaleMVPInteractor = wholesaleInteractor

    @Provides
    internal fun provideWholeSalePresenter(wholesalePresenter: WholeSalePresenter<WholeSaleRegisterMVPView, WholeSaleMVPInteractor>)
            : WholeSaleMVPPresenter<WholeSaleRegisterMVPView, WholeSaleMVPInteractor> = wholesalePresenter
}