package com.example.ratingimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView cnt;
    public int like;
    public int dislike;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Button(View view){
    }
    public void imageButton(View view) {
        like= like+1;
        Toast.makeText(this, "Нравится "+like+" раз", Toast.LENGTH_SHORT).show();
    }
    public void imageButton2(View view) {
        dislike= dislike+1;
        Toast.makeText(this, "Не нравится "+dislike+" раз", Toast.LENGTH_SHORT).show();
    }

}
