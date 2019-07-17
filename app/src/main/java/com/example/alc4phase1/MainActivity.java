package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alc4phase1.Main2Activityalc;
import com.example.alc4phase1.Main3ActivityPROFILE;
import com.example.alc4phase1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button  but1=(Button)findViewById(R.id.button2);
        Button but2=(Button)findViewById(R.id.button3);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(MainActivity.this, Main2Activityalc.class);
                startActivity(int1);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(MainActivity.this,Main3ActivityPROFILE.class);
                startActivity(int2);
            }
        });


    }
}