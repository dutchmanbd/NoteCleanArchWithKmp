package com.ticonsys.notecleanarchwithkmp.data

import com.ticonsys.notecleanarchwithkmp.domain.note.Note
import com.ticonsys.notecleanarchwithkmp.domain.time.DateTimeUtil
import database.NoteEntity
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun NoteEntity.toNote() = Note(
    id = id,
    title = title,
    content = content,
    colorHex = colorHex,
    created = Instant.fromEpochMilliseconds(created)
        .toLocalDateTime(TimeZone.currentSystemDefault())
)