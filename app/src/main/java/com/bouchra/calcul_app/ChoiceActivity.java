package com.bouchra.calcul_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class ChoiceActivity extends AppCompatActivity {
    androidx.cardview.widget.CardView plus;
    androidx.cardview.widget.CardView moins;
    androidx.cardview.widget.CardView fois;
    androidx.cardview.widget.CardView devise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        plus =findViewById(R.id.plus);
        moins =findViewById(R.id.moins);
        fois =findViewById(R.id.fois);
        devise =findViewById(R.id.devise);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Créer une intention pour démarrer une nouvelle activité
                Intent intent = new Intent(ChoiceActivity.this, AddActivity.class);

                // Démarrer l'activité
                startActivity(intent);
            }
        });

        moins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Créer une intention pour démarrer une nouvelle activité
                Intent intent = new Intent(ChoiceActivity.this, MoinsActivity.class);

                // Démarrer l'activité
                startActivity(intent);
            }
        });

        fois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Créer une intention pour démarrer une nouvelle activité
                Intent intent = new Intent(ChoiceActivity.this, MultiplicationActivity.class);

                // Démarrer l'activité
                startActivity(intent);
            }
        });

        devise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Créer une intention pour démarrer une nouvelle activité
                //Intent intent = new Intent(ChoiceActivity.this, DivisionActivity.class);
                Intent intent = new Intent(getApplicationContext(), DivisionActivity.class);

                // Démarrer l'activité
                startActivity(intent);
            }
        });
    }
}
