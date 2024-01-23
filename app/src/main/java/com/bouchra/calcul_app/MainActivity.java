package com.bouchra.calcul_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button commencer;
    Button tpBtn;
    Button lvBtn;
    Button lvpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        commencer =findViewById(R.id.commencer);
        tpBtn =findViewById(R.id.tp);
        lvBtn =findViewById(R.id.lv);
        lvpBtn =findViewById(R.id.lvp);

        commencer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Créer une intention pour démarrer une nouvelle activité
                Intent intent = new Intent(MainActivity.this, ChoiceActivity.class);

                // Démarrer l'activité
                startActivity(intent);
            }
        });

        tpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Créer une intention pour démarrer une nouvelle activité
                Intent intent = new Intent(MainActivity.this, TPActivity.class);

                // Démarrer l'activité
                startActivity(intent);
            }
        });

        lvBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Créer une intention pour démarrer une nouvelle activité
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);

                // Démarrer l'activité
                startActivity(intent);
            }
        });

        lvpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Créer une intention pour démarrer une nouvelle activité
                Intent intent = new Intent(MainActivity.this, ListViewPersoActivity.class);

                // Démarrer l'activité
                startActivity(intent);
            }
        });
    }
}