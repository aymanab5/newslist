package com.team1_abu_ghosh.myapplication_first_team1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void but3_next(View view ){

        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);


    }
    public void but4_next(View view ){

        Intent intent=new Intent(MainActivity.this,Main3Activity.class);
        startActivity(intent);


    }


    public void b_3(View view) {
        Intent intent=new Intent(MainActivity.this,Main4Activity.class);
        startActivity(intent);
    }
}
