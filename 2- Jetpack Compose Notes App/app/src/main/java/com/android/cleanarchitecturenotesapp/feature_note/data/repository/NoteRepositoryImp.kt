package com.android.cleanarchitecturenotesapp.feature_note.data.repository

import com.android.cleanarchitecturenotesapp.feature_note.data.data_source.NoteDao
import com.android.cleanarchitecturenotesapp.feature_note.domain.model.Note
import com.android.cleanarchitecturenotesapp.feature_note.domain.repository.NoteRepositoryInterface
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImp(
    private val noteDao: NoteDao
) : NoteRepositoryInterface {
    override fun getNotes(): Flow<List<Note>> {
        noteDao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        noteDao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        noteDao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }
}