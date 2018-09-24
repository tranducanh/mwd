package mowede.framework.ititit.ui.base.presenter

import mowede.framework.ititit.ui.base.interactor.MVPInteractor
import mowede.framework.ititit.ui.base.view.MVPView

interface MVPPresenter<V : MVPView, I : MVPInteractor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?

}