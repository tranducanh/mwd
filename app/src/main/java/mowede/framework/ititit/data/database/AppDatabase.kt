package mowede.framework.ititit.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import mowede.framework.ititit.data.database.repository.options.Options
import mowede.framework.ititit.data.database.repository.options.OptionsDao
import mowede.framework.ititit.data.database.repository.questions.Question
import mowede.framework.ititit.data.database.repository.questions.QuestionsDao


@Database(entities = [(Question::class), (Options::class)], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun optionsDao(): OptionsDao

    abstract fun questionsDao(): QuestionsDao

}