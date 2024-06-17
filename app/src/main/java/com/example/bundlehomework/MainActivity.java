package com.example.bundlehomework;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView idTVHeading;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idTVHeading = findViewById(R.id.idTVHeading);
        //time & date
        Time();

        tv = (TextView) this.findViewById(R.id.mywidget);
        tv.setSelected(true);


    }
    //==============================
    private void Time(){

        SimpleDateFormat sdf = new SimpleDateFormat("'Date 'dd-MM-yyyy ");

        String currentDateAndTime = sdf.format(new Date());

        idTVHeading.setText(currentDateAndTime);

    }
}