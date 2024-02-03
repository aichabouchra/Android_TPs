package com.bouchra.calcul_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListViewPersoActivity extends AppCompatActivity {

    private ListeAdapter listeAdapter;
    private List<HashMap<String, Object>> listContact;
    private HashMap<String, Object> contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_perso);

        listContact = new ArrayList<HashMap<String, Object>>();
        ListView listViewContact = (ListView) findViewById(R.id.ListContact);

        contact = new HashMap<String, Object>();
        contact.put("ln", "Nom : ");
        contact.put("vn", "BOUCHRA");
        contact.put("lp", "Prenom : ");
        contact.put("vp", "Aicha");
        contact.put("lt", "Téléphone : ");
        contact.put("vt", "0657743770");
        listContact.add(contact);

        contact = new HashMap<String, Object>();
        contact.put("ln", "Nom : ");
        contact.put("vn", "BOUCHRA");
        contact.put("lp", "Prenom : ");
        contact.put("vp", "Mohammed");
        contact.put("lt", "Téléphone : ");
        contact.put("vt", "0661745770");
        listContact.add(contact);

        contact = new HashMap<String, Object>();
        contact.put("ln", "Nom : ");
        contact.put("vn", "BOUCHRA");
        contact.put("lp", "Prenom : ");
        contact.put("vp", "Omar");
        contact.put("lt", "Téléphone : ");
        contact.put("vt", "0660000000");
        listContact.add(contact);

        contact = new HashMap<String, Object>();
        contact.put("ln", "Nom : ");
        contact.put("vn", "BOUCHRA");
        contact.put("lp", "Prenom : ");
        contact.put("vp", "Brahim");
        contact.put("lt", "Téléphone : ");
        contact.put("vt", "0660166687");
        listContact.add(contact);

        contact = new HashMap<String, Object>();
        contact.put("ln", "Nom : ");
        contact.put("vn", "BOUSTTA");
        contact.put("lp", "Prenom : ");
        contact.put("vp", "Kaoutar");
        contact.put("lt", "Téléphone : ");
        contact.put("vt", "0600000000");
        listContact.add(contact);

        contact = new HashMap<String, Object>();
        contact.put("ln", "Nom : ");
        contact.put("vn", "CHANAK");
        contact.put("lp", "Prenom : ");
        contact.put("vp", "Romayssae");
        contact.put("lt", "Téléphone : ");
        contact.put("vt", "0600000000");
        listContact.add(contact);

        listeAdapter = new ListeAdapter(getApplicationContext(), listContact);
        listViewContact.setAdapter(listeAdapter);

    }
}