package com.example.alensh.togglebutton;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    ToggleButton tb;
    ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (ConstraintLayout)findViewById(R.id.main);
        tb= (ToggleButton)findViewById(R.id.ToggleChanger);
            tb.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked){
           layout.setBackgroundColor(Color.BLACK);
        }
        else{
            layout.setBackgroundColor(Color.WHITE);
        }

    }
}
