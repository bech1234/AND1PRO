package com.example.andreasbech.and1pro;

import java.sql.Date;
import java.util.ArrayList;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "book_table")
public class Book  {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String date;

    public Book(String title, String date) {

        this.title = title;
        this.date = date;

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

}
