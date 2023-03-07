package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
Button btnInc;
Button btnDec;

    Integer count = 0;


    public int IncreaseCount(){
        ++count;
        return count;
    }

    public  int DecreaseCount(){
        --count;
        return count;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.countVar);
        btnInc = findViewById(R.id.increaseBtn);
        btnDec = findViewById(R.id.decreaseBtn);
        btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(""+IncreaseCount());
            }
        });
        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(""+DecreaseCount());
            }
        });


    }


}