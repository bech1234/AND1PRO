package com.example.andreasbech.and1pro;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {
    private BookViewModel bookViewModel;
    private EditText editText;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText3);
        textView = findViewById(R.id.textView6);
        bookViewModel = ViewModelProviders.of(this).get(BookViewModel.class);
        bookViewModel.getAllBooks().observe(this, new Observer<List<Book>>() {

            @Override
            public void onChanged(List<Book> books) {

            }
        });
    }
    public void saveBook(View v) {
        bookViewModel.insert(new Book(editText.getText().toString(), "Date"));
    }


}
