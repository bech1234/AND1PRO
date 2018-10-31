package com.example.andreasbech.and1pro;

import android.app.Application;
import android.os.AsyncTask;

import java.util.List;

import androidx.lifecycle.LiveData;

public class BookRepository {
    private BookDao bookDao;
    private LiveData<List<Book>> allBooks;

    public BookRepository(Application application){
        BookDatabase database = BookDatabase.getInstance(application);
        bookDao = database.bookDao();
        allBooks = bookDao.getAllBooks();
    }

    public void insert(Book book) {

        new InsertBookAsyncTask(bookDao).execute(book);
    }

    private static class InsertBookAsyncTask extends
            AsyncTask<Book,Void,Void> {
        private BookDao bookDao;
        private InsertBookAsyncTask(BookDao bookDao) {
            this.bookDao = bookDao;
        }

        @Override
        protected Void doInBackground(Book... books) {
            bookDao.insert(books[0]);

            return null;
        }
    }


    public void update(Book book){

        new UpdateBookAsyncTask(bookDao).execute(book);
    }

    private static class UpdateBookAsyncTask extends
            AsyncTask<Book,Void,Void> {
        private BookDao bookDao;
        private UpdateBookAsyncTask(BookDao bookDao) {
            this.bookDao = bookDao;
        }

        @Override
        protected Void doInBackground(Book... books) {
            bookDao.update(books[0]);

            return null;
        }
    }

    public void delete(Book book) {

        new DeleteBookAsyncTask(bookDao).execute(book);

    }

    private static class DeleteBookAsyncTask extends
            AsyncTask<Book,Void,Void> {
        private BookDao bookDao;
        private DeleteBookAsyncTask(BookDao bookDao) {
            this.bookDao = bookDao;
        }

        @Override
        protected Void doInBackground(Book... books) {
            bookDao.delete(books[0]);

            return null;
        }
    }

    public LiveData<List<Book>> getAllBooks() {

        return allBooks;

    }



}
