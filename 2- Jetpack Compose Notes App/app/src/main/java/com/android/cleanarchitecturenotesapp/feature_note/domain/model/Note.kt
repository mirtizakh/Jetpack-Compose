package com.android.cleanarchitecturenotesapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.android.cleanarchitecturenotesapp.ui.theme.*


@Entity
data class Note(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {
        val notesColors = listOf(RedOrange, RedPink, BabyBlue, Violet, LightGreen)
    }
}
