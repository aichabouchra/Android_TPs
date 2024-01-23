package com.bouchra.calcul_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DivisionActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button btn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        num1 =findViewById(R.id.num1);
        num2 =findViewById(R.id.num2);
        btn =findViewById(R.id.btn);
        result =findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int value1 = Integer.parseInt(num1.getText().toString());
                    int value2 = Integer.parseInt(num2.getText().toString());

                    if (value2 != 0) {
                        result.setText(String.valueOf(value1 / value2));
                    } else {
                        result.setText("Impossible de diviser par zéro !");
                    }
                } catch (NumberFormatException e) {
                    result.setText("Veuillez entrer des nombres valides.");
                }
            }
        });
    }
}