package com.bouchra.calcul_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MultiplicationActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button btn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication);

        num1 =findViewById(R.id.num1);
        num2 =findViewById(R.id.num2);
        btn =findViewById(R.id.btn);
        result =findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.valueOf(
                        Integer.parseInt(num1.getText().toString())
                                * Integer.parseInt(num2.getText().toString())
                ));
            }
        });
    }
}