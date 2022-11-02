package com.ticonsys.notecleanarchwithkmp.data.local

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver
import com.ticonsys.notecleanarchwithkmp.database.NoteDatabase

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(
            NoteDatabase.Schema,
            "note.db"
        )
    }
}