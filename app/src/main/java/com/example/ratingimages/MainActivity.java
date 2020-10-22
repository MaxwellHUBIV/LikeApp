package com.example.ratingimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView cnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Button(View view){
    }
    public void imageButton(View view) {
        Toast.makeText(this, "Нравится", Toast.LENGTH_SHORT).show();
    }
    public void imageButton2(View view) {
        Toast.makeText(this, "Не нравится", Toast.LENGTH_SHORT).show();
    }

}
