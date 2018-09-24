package mowede.framework.ititit.ui.splash.presenter

import mowede.framework.ititit.ui.base.presenter.MVPPresenter
import mowede.framework.ititit.ui.splash.interactor.SplashMVPInteractor
import mowede.framework.ititit.ui.splash.view.SplashMVPView

interface SplashMVPPresenter<V : SplashMVPView, I : SplashMVPInteractor> : MVPPresenter<V,I>