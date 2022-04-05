package com.android.cleanarchitecturenotesapp.feature_note.domain.use_case

import com.android.cleanarchitecturenotesapp.feature_note.domain.model.Note
import com.android.cleanarchitecturenotesapp.feature_note.domain.repository.NoteRepositoryInterface
import com.android.cleanarchitecturenotesapp.feature_note.domain.util.NoteOrder
import com.android.cleanarchitecturenotesapp.feature_note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNoteByIdUseCase(
    private val repository: NoteRepositoryInterface
) {

    operator fun invoke(
        noteId:Int
    ): Note? {

        return repository.getNoteById(noteId).map { notes ->
            when (noteOrder.orderType) {
                is OrderType.Ascending -> {
                    when (noteOrder) {
                        is NoteOrder.Title -> notes.sortedBy { it.title.lowercase() }
                        is NoteOrder.Color -> notes.sortedBy { it.color }
                        is NoteOrder.Date -> notes.sortedBy { it.timestamp }
                    }
                }
                is OrderType.Descending ->
                    when (noteOrder) {
                        is NoteOrder.Title -> notes.sortedByDescending { it.title.lowercase() }
                        is NoteOrder.Color -> notes.sortedByDescending { it.color }
                        is NoteOrder.Date -> notes.sortedByDescending { it.timestamp }
                    }
            }
        }
    }
}