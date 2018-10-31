package com.example.andreasbech.and1pro;

import android.app.Application;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class BookViewModel extends AndroidViewModel {
    private BookRepository repository;
    private LiveData<List<Book>> allBooks;
    public BookViewModel(@NonNull Application application) {
        super(application);
        repository = new BookRepository(application);
        allBooks = repository.getAllBooks();
    }
    public void insert(Book book) {
        repository.insert(book);
    }
    public void update(Book book) {
        repository.update(book);
    }
    //... plus delete and deleteAllNotes

    public void delete(Book book){
        repository.delete(book);
    }

    public LiveData<List<Book>> getAllBooks() {
        return allBooks;
    }
}