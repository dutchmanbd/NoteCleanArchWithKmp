package com.ticonsys.notecleanarchwithkmp.data.local

import android.content.Context
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import com.ticonsys.notecleanarchwithkmp.database.NoteDatabase

actual class DatabaseDriverFactory(
    private val context: Context
) {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(
            schema = NoteDatabase.Schema,
            context = context,
            name = "note.db"
        )
    }
}