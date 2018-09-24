package mowede.framework.ititit.di.component

import android.app.Application
import mowede.framework.ititit.ITITITApp
import mowede.framework.ititit.di.builder.ActivityBuilder
import mowede.framework.ititit.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidInjectionModule::class), (AppModule::class), (ActivityBuilder::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: ITITITApp)

}