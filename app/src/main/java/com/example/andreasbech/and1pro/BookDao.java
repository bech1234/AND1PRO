package com.example.andreasbech.and1pro;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface BookDao {

        @Insert
        void insert(Book book);

        @Update
        void update(Book book);

        @Delete
        void delete(Book book);

//        @Query("DELETE FROM book_table")
//        void deleteAllBooks();

        @Query("SELECT * FROM book_table ORDER BY ID DESC")
        LiveData<List<Book>> getAllBooks();

    }

