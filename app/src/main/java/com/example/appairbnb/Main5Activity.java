package com.example.appairbnb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {
    public void main6click(View view) {
        Intent intent = new Intent(this, Main6Activity.class);
        startActivity(intent);
    }
    public void main9click(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void main14click(View view) {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
}
