package com.bouchra.calcul_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SelectedFruitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_fruits);

        // Récupérer les fruits sélectionnés de l'intent
        Intent intent = getIntent();
        ArrayList<String> selectedFruits = intent.getStringArrayListExtra("selectedFruits");

        // Afficher les fruits sélectionnés dans un TextView
        TextView textView = findViewById(R.id.textViewSelectedFruits);
        if (selectedFruits != null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String fruit : selectedFruits) {
                stringBuilder.append(fruit).append("\n");
            }
            textView.setText(stringBuilder.toString());
        }
    }
}
