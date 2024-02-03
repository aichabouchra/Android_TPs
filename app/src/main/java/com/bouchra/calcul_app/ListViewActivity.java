package com.bouchra.calcul_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ListView lf;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lf=findViewById(R.id.ListFruits);
        submitButton = findViewById(R.id.valider);

        List<String> Fruits=new ArrayList<>();
        Fruits.add("Orange");
        Fruits.add("Banane");
        Fruits.add("Kiwi");
        Fruits.add("Papai");
        Fruits.add("Pomme");
        Fruits.add("Fraise");
        Fruits.add("Cerise");
        Fruits.add("Pastique");
        Fruits.add("Pêche");
        Fruits.add("Tomate");
        Fruits.add("Avocat");
        Fruits.add("Anans");
        Fruits.add("Mangue");
        Fruits.add("Abricot");
        Fruits.add("Limon");
        Fruits.add("BlueBerry");

        ArrayAdapter adapter = new ArrayAdapter(
                getApplicationContext(),
                android.R.layout.simple_list_item_multiple_choice,
                android.R.id.text1,
                Fruits
        );
        lf.setAdapter(adapter);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view) {
                // Récupérer les éléments sélectionnés
                SparseBooleanArray checked = lf.getCheckedItemPositions();
                ArrayList<String> selectedFruits = new ArrayList<>();
                for (int i = 0; i < checked.size(); i++) {
                    int position = checked.keyAt(i);
                    if (checked.valueAt(i)) {
                        selectedFruits.add(Fruits.get(position));
                    }
                }

                // Passer les données à la nouvelle activité
                Intent intent = new Intent(ListViewActivity.this, SelectedFruitsActivity.class);
                intent.putStringArrayListExtra("selectedFruits", selectedFruits);
                startActivity(intent);
            }
        });
    }
}
