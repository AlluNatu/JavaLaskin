package com.example.javatehtava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float f1, f2;
    private EditText luku1, luku2;
    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        luku1 = findViewById(R.id.editFirstNumber);
        luku2 = findViewById(R.id.editSecondNumber);
        textOutput = findViewById(R.id.textView2);

    }

    public void inputToNumber(){
        StringBuilder sb = new StringBuilder(luku1.getText());
        StringBuilder sb2 = new StringBuilder(luku2.getText());
        String s1 = sb.toString();
        String s2 = sb2.toString();
        if (s1 == ""){
            s1 = "0";
        }

        if (s2 == ""){
            s2 = "0";
        }
        f1 = Float.parseFloat(s1);
        f2 = Float.parseFloat(s2);
    }

    public void division(View view) {
        inputToNumber();
        float answer = f1 / f2;
        textOutput.setText(String.valueOf(answer));
    }

    public void plus(View view) {
        inputToNumber();
        float answer = f1 + f2;
        textOutput.setText(String.valueOf(answer));
    }

    public void minus(View view) {
        inputToNumber();
        float answer = f1 - f2;
        textOutput.setText(String.valueOf(answer));
    }

    public void factorial (View view) {
        inputToNumber();
        float answer = f1 * f2;
        textOutput.setText(String.valueOf(answer));
    }
}