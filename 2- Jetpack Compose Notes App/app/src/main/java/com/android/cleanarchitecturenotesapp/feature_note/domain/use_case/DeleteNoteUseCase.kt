package com.android.cleanarchitecturenotesapp.feature_note.domain.use_case

import com.android.cleanarchitecturenotesapp.feature_note.domain.model.Note
import com.android.cleanarchitecturenotesapp.feature_note.domain.repository.NoteRepositoryInterface

class DeleteNoteUseCase(
    private val repository: NoteRepositoryInterface
) {
    suspend operator fun invoke(note: Note) {

        repository.deleteNote(note = note)
    }
}