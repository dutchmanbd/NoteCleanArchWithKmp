package com.ticonsys.notecleanarchwithkmp.android.di

import android.app.Application
import com.squareup.sqldelight.db.SqlDriver
import com.ticonsys.notecleanarchwithkmp.data.SqlDelightNoteDataSource
import com.ticonsys.notecleanarchwithkmp.data.local.DatabaseDriverFactory
import com.ticonsys.notecleanarchwithkmp.database.NoteDatabase
import com.ticonsys.notecleanarchwithkmp.domain.note.NoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSqlDriver(
        app: Application
    ): SqlDriver {
        return DatabaseDriverFactory(app).createDriver()
    }

    @Provides
    @Singleton
    fun provideNoteDataSource(driver: SqlDriver): NoteDataSource {
        return SqlDelightNoteDataSource(
            NoteDatabase(driver)
        )
    }
}