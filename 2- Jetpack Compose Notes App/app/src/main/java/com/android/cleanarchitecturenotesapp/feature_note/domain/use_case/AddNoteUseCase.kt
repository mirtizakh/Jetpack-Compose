package com.android.cleanarchitecturenotesapp.feature_note.domain.use_case

import com.android.cleanarchitecturenotesapp.feature_note.domain.model.InvalidNoteException
import com.android.cleanarchitecturenotesapp.feature_note.domain.model.Note
import com.android.cleanarchitecturenotesapp.feature_note.domain.repository.NoteRepositoryInterface

class AddNoteUseCase(
    private val repository: NoteRepositoryInterface
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of note can't be empty")
        } else if (note.content.isBlank()) {
            throw InvalidNoteException("The content of note can't be empty")
        } else {
            repository.insertNote(note = note)
        }
    }
}