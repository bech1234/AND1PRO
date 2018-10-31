package com.example.andreasbech.and1pro;

import android.media.Image;

import java.sql.Date;
import java.util.ArrayList;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")

public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String bookTitle;
    private String title;
    private String date;
    private String text;



    public Note(String title, String date, String text, String bookTitle) {

        this.bookTitle = bookTitle;
        this.title = title;
        this.date = date;
        this.text = text;

    }
    //Id
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    //Title
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    //Date
    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {

        return date;

    }

    //Text
    public void setText(String text) {
        this.text = text;

    }

    public String getText() {

        return text;

    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;

    }

    public String getBookTitle() {

        return bookTitle;

    }

}
