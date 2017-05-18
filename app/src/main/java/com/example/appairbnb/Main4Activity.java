package com.example.appairbnb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {
    public void main5click(View view) {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }
    public void main4click(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void main13click(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
}
