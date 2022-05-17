package com.example.textkalkul;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView t1;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        t1 = (TextView) findViewById(R.id.t1);
    }


    public void doSum(View v) {
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        if (s1.equals("") || s2.equals("")) {
            String result = "Данные не корректные";
            t1.setText(result);
            System.out.println(result);
        } else {
            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);



            int sum = num1 + num2;

            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("key1", num1);
            intent.putExtra("key2", num2);
            intent.putExtra("sum", sum);
            startActivity(intent);
        }
    }
}