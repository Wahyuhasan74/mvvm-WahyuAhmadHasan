package com.wahyu.mvvmwahyuahmadhasan.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.wahyu.mvvmwahyuahmadhasan.db.note.Note
import com.wahyu.mvvmwahyuahmadhasan.db.note.NoteRepository

class NoteViewModel(application: Application) : AndroidViewModel(application) {

    private var noteRepository = NoteRepository(application)
    private var notes: LiveData<List<Note>>? = noteRepository.getNotes()

    fun insertNote(note: Note) {
        noteRepository.insert(note)
    }

    fun getNotes(): LiveData<List<Note>>? {
        return notes
    }

    fun deleteNote(note: Note) {
        noteRepository.delete(note)
    }

    fun updateNote(note: Note) {
        noteRepository.update(note)
    }

}