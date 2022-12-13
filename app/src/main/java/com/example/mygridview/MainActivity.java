package com.example.mygridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<String> text = new ArrayList<>();
    ArrayList<Integer> image = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        fillArray();
        GridAdapter adapter = new GridAdapter(this, text, image);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Snackbar.make(view, text.get(i), Snackbar.LENGTH_INDEFINITE).setAction("Close", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {}
                }).show();
            }
        });
    }

    private void fillArray() {
        text.add("Baguio's Night Market");
        text.add("Batanes Island");
        text.add("Magellan's Cross, Cebu");
        text.add("Chocolate Hills, Bohol");
        text.add("Manila Cathedral, Manila");
        text.add("Mayon Volcano, Albay");
        text.add("Island in Coron, Palawan");
        text.add("Mt. Pinatubo, Zambales");
        text.add("Banaue Rice Terraces, Ifugao");
        text.add("Taal Volcano, Batangas");
        text.add("U.P. Diliman, Quezon City");
        text.add("Vigan's old houses");

//        Images
        image.add(R.drawable.baguio);
        image.add(R.drawable.batanes);
        image.add(R.drawable.cebu);
        image.add(R.drawable.chocohills);
        image.add(R.drawable.intramuros);
        image.add(R.drawable.mayon);
        image.add(R.drawable.palawan);
        image.add(R.drawable.pinatubo);
        image.add(R.drawable.riceterraces);
        image.add(R.drawable.taal);
        image.add(R.drawable.upd);
        image.add(R.drawable.vigan);
    }
}