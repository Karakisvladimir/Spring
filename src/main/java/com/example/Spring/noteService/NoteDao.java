package com.example.Spring.noteService;

import com.example.Spring.entity.Note;

import java.util.List;
import java.util.UUID;

public interface NoteDao {
    Note add(Note note);
    void update(Note note);
    Note getById(UUID id);
    List<Note> listAll();
    void deleteById(UUID id);
}
