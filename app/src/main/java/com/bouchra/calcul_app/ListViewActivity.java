package com.bouchra.calcul_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    ListView lf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lf=findViewById(R.id.ListFruits);

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
    }
}