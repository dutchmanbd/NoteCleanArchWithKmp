package com.ticonsys.notecleanarchwithkmp.android.presentation.notes

import com.ticonsys.notecleanarchwithkmp.domain.note.Note

data class NoteListState(
    val notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false
)