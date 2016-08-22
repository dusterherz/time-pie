package com.dusterherz.timepie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberPicker hours = (NumberPicker) findViewById(R.id.numberPickerHours);
        NumberPicker minutes = (NumberPicker) findViewById(R.id.numberPickerMinutes);
        NumberPicker seconds = (NumberPicker) findViewById(R.id.numberPickerSeconds);

        hours.setMaxValue(24);
        hours.setMinValue(0);
        minutes.setMaxValue(60);
        hours.setMinValue(0);
        seconds.setMaxValue(60);
        seconds.setMinValue(0);
    }

    public void startChronometer(View view) {
        TextView textView = new TextView(this);
        textView.setText("Yay !");

        ViewGroup layout = (ViewGroup) findViewById(R.id.relativeLayoutMainActivity);
        layout.addView(textView);
    }
}
