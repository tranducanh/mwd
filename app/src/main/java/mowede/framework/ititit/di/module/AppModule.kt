package mowede.framework.ititit.di.module

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import mowede.framework.ititit.BuildConfig
import mowede.framework.ititit.data.database.AppDatabase
import mowede.framework.ititit.data.database.repository.options.OptionsRepo
import mowede.framework.ititit.data.database.repository.options.OptionsRepository
import mowede.framework.ititit.data.database.repository.questions.QuestionRepo
import mowede.framework.ititit.data.database.repository.questions.QuestionRepository
import mowede.framework.ititit.data.network.ApiHeader
import mowede.framework.ititit.data.network.ApiHelper
import mowede.framework.ititit.data.network.AppApiHelper
import mowede.framework.ititit.data.preferences.AppPreferenceHelper
import mowede.framework.ititit.data.preferences.PreferenceHelper
import mowede.framework.ititit.di.ApiKeyInfo
import mowede.framework.ititit.di.PreferenceInfo
import mowede.framework.ititit.util.AppConstants
import mowede.framework.ititit.util.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    internal fun provideAppDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, AppConstants.APP_DB_NAME).build()

    @Provides
    @ApiKeyInfo
    internal fun provideApiKey(): String = BuildConfig.API_KEY

    @Provides
    @PreferenceInfo
    internal fun provideprefFileName(): String = AppConstants.PREF_NAME

    @Provides
    @Singleton
    internal fun providePrefHelper(appPreferenceHelper: AppPreferenceHelper): PreferenceHelper = appPreferenceHelper

    @Provides
    @Singleton
    internal fun provideProtectedApiHeader(@ApiKeyInfo apiKey: String, preferenceHelper: PreferenceHelper)
            : ApiHeader.ProtectedApiHeader = ApiHeader.ProtectedApiHeader(apiKey = apiKey,
            userId = preferenceHelper.getCurrentUserId(),
            accessToken = preferenceHelper.getAccessToken())

    @Provides
    @Singleton
    internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper = appApiHelper

    @Provides
    @Singleton
    internal fun provideQuestionRepoHelper(appDatabase: AppDatabase): QuestionRepo = QuestionRepository(appDatabase.questionsDao())

    @Provides
    @Singleton
    internal fun provideOptionsRepoHelper(appDatabase: AppDatabase): OptionsRepo = OptionsRepository(appDatabase.optionsDao())

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider = SchedulerProvider()


}