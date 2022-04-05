package com.android.cleanarchitecturenotesapp.di

import android.app.Application
import androidx.room.Room
import com.android.cleanarchitecturenotesapp.feature_note.data.data_source.NoteDatabase
import com.android.cleanarchitecturenotesapp.feature_note.data.data_source.NoteDatabase.Companion.DATABASE_NAME
import com.android.cleanarchitecturenotesapp.feature_note.data.repository.NoteRepositoryImp
import com.android.cleanarchitecturenotesapp.feature_note.domain.repository.NoteRepositoryInterface
import com.android.cleanarchitecturenotesapp.feature_note.domain.use_case.*
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
    fun providesNotesDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun providesNotesRepository(db: NoteDatabase): NoteRepositoryInterface {
        return NoteRepositoryImp(db.noteDao)
    }

    @Provides
    @Singleton
    fun providesNotesUseCases(repository: NoteRepositoryInterface): NotesUseCases {
        return NotesUseCases(
            getNotesUseCase = GetNotesUseCase(repository),
            deleteNoteUseCase = DeleteNoteUseCase(repository),
            addNoteUseCase = AddNoteUseCase(repository),
            getNoteByIdUseCase = GetNoteByIdUseCase(repository)
        )
    }
}