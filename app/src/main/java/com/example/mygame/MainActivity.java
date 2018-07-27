package com.example.mygame;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private int btime = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.b1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        btime++;
                        switch (btime) {
                            case 1:
                                TextView textView2 = (TextView) findViewById(R.id.t2);
                                textView2.setVisibility(View.VISIBLE);
                                break;
                            case 2:
                                TextView textView3 = (TextView) findViewById(R.id.t3);
                                textView3.setVisibility(View.VISIBLE);
                                break;
                            case 3:
                                TextView textView4 = (TextView) findViewById(R.id.t4);
                                textView4.setVisibility(View.VISIBLE);
                                break;
                            case 5:
                                Button button2 = (Button) findViewById(R.id.b2);
                                button2.setVisibility(View.VISIBLE);
                                btime = 0;
                                break;
                            case 4:
                                TextView textView5 = (TextView) findViewById(R.id.t5);
                                textView5.setVisibility(View.VISIBLE);
                            default:
                                break;
                        }

            }
        });
    }
}
