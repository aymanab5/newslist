package com.team1_abu_ghosh.myapplication_first_team1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {


    ImageView img ;
    int ph [] = new int []{R.drawable.aa1,R.drawable.aa2,R.drawable.aa3,R.drawable.aa4,R.drawable.aa5  } ;
    int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        img=(ImageView)(findViewById(R.id.imageView3));
    }

    public void bu_back(View view) {
        img.setImageResource(ph[index]);
        if(index>0)
            index--;
        else
            index=4;
    }

    public void bu_next(View view) {
        img.setImageResource(ph[index]);
        if(index<4)
            index++;
        else
            index=0;
    }
}
