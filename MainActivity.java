package com.example.yourage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText et1;
    public EditText et2;
    public EditText et3;
    public EditText et4;
    public EditText et5;
    public EditText et6;
    public Button but;
    public TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = findViewById(R.id.t1);
        et2 = findViewById(R.id.t2);
        et3 = findViewById(R.id.t3);
        et4 = findViewById(R.id.t4);
        et5 = findViewById(R.id.t5);
        et6 = findViewById(R.id.t6);
        but = findViewById(R.id.button);
        txt = findViewById(R.id.txt);
        but.setOnClickListener(view -> {
            if (et1.getText().toString().trim().equals("") || et2.getText().toString().trim().equals("") || et3.getText().toString().trim().equals("") || et4.getText().toString().trim().equals("") || et5.getText().toString().trim().equals("") || et6.getText().toString().trim().equals("")) {
                Toast.makeText(MainActivity.this, R.string.hui, Toast.LENGTH_LONG).show();
            } else {
                int a = Integer.parseInt(et1.getText().toString());
                int b = Integer.parseInt(et2.getText().toString());
                int c = Integer.parseInt(et3.getText().toString());
                int d = Integer.parseInt(et4.getText().toString());
                int e = Integer.parseInt(et5.getText().toString());
                int f = Integer.parseInt(et6.getText().toString());
                int g, h, z, k, m, x;
                if (a >= 1 && a <= 31 && b >= 1 && b <= 12 && c > 0 && d >= 1 && d <= 31 && e >= 1 && e <= 12 && f > 0 && f >= c) {
                    z = e - 1;
                    g = f - c - 1;
                    h = 12 - b;
                    if (b != 2) {
                        if (b % 2 == 0) {
                            k = 30 - a;
                            m = k + d;
                            if (m >= 30) {
                                h += 1;
                                m = m - 30;
                            }
                        } else {
                            k = 31 - a;
                            m = k + d;
                            if (m >= 31) {
                                h += 1;
                                m = m - 31;
                            }
                        }
                    } else {
                        if (c % 4 == 0) {
                            k = 29 - a;
                            m = k + d;
                            if (m >= 19) {
                                h += 1;
                                m = m - 29;
                            }
                        } else {
                            k = 28 - a;
                            m = k + d;
                            if (m >= 28) {
                                h += 1;
                                m = m - 28;
                            }
                        }
                    }
                    x = h + z;
                    if (x >= 12) {
                        g += 1;
                        x = x - 12;
                    }
                    if (z % 2 == 0) {
                        m += 1;
                    }
                    m=m-1;
                    String g1 = Integer.toString(g);
                    String x1 = Integer.toString(x);
                    String m1 = Integer.toString(m);
                    String all = g1 + " л. " + x1 + " мес. " + m1 + " дн.";
                    txt.setText(all);
                } else {
                    Toast.makeText(MainActivity.this, R.string.hua, Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
