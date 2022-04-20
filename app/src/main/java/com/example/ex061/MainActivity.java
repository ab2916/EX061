package com.example.ex061;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch switch1;
    ToggleButton tB;
    Button btn;
    LinearLayout LL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch1 = (Switch) findViewById(R.id.switch1);
        tB = (ToggleButton) findViewById(R.id.tB);
        btn = (Button) findViewById(R.id.btn);
        LL = (LinearLayout) findViewById(R.id.LL);
    }

    public void go(View view) {
        if(switch1.isChecked() == true && tB.isChecked() == true){
            LL.setBackgroundColor(Color.RED);
        }
        if(switch1.isChecked() == false && tB.isChecked() == false){
            LL.setBackgroundColor(Color.YELLOW);
        }
        if(switch1.isChecked() == true && tB.isChecked() == false){
            LL.setBackgroundColor(Color.GREEN);
        }
        if(switch1.isChecked() == false && tB.isChecked() == true){
            LL.setBackgroundColor(Color.BLUE);
        }
    }
}