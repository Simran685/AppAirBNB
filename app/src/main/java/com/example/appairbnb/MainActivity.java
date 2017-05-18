package com.example.appairbnb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void mainclick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
        public void main2click(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
    public void main8click(View view) {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }
    public void main10click(View view) {
        Intent intent = new Intent(this, Main6Activity.class);
        startActivity(intent);
    }
    public void main11click(View view) {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }




    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
    }

