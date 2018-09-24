package mowede.framework.ititit.ui.splash.interactor

import mowede.framework.ititit.data.database.repository.questions.Question
import mowede.framework.ititit.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

interface SplashMVPInteractor : MVPInteractor {

    fun seedQuestions(): Observable<Boolean>
    fun seedOptions(): Observable<Boolean>
    fun getQuestion() : Observable<List<Question>>
}