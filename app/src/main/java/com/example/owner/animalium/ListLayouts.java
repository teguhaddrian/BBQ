package com.example.owner.animalium;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class ListLayouts extends AppCompatActivity {

    TextView bHijaiyah;
    TextView bHijriyah;
    TextView bHari;
    TextView bKeluarga;
    ImageView gHijaiyah;
    ImageView gHijriyah;
    ImageView gHari;
    ImageView gKeluarga;
    TextView mNama;
     /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_layouts);

        bHijaiyah = (TextView) findViewById(R.id.textView4);
        bHijriyah = (TextView) findViewById(R.id.textView5);
        bHari = (TextView) findViewById(R.id.textView7);
        bKeluarga = (TextView) findViewById(R.id.textView8);

        gHijaiyah = (ImageView) findViewById(R.id.hijaiyah);
        gHijriyah = (ImageView) findViewById(R.id.bulan);
        gHari = (ImageView) findViewById(R.id.imageView3);
        gKeluarga = (ImageView) findViewById(R.id.imageView4);



        mNama = (TextView) findViewById(R.id.mTextNama);
        String namadarifront = getIntent().getStringExtra("NAMA");
        mNama.setText("Assalamualaikum " + namadarifront);



        gHijaiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(ListLayouts.this, MainActivity.class);

                startActivity(i);
            }
        });


        gHijriyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(ListLayouts.this, BulanActivity.class);

                startActivity(i);

            }
        });


        gHari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(ListLayouts.this, HariActivity.class);

                startActivity(i);

            }
        });


        gKeluarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(ListLayouts.this, KeluargaActivity.class);

                startActivity(i);

            }
        });


        bHijaiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(ListLayouts.this, MainActivity.class);

                startActivity(i);
            }
        });


        bHijriyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(ListLayouts.this, BulanActivity.class);

                startActivity(i);

            }
        });


        bHari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(ListLayouts.this, HariActivity.class);

                startActivity(i);

            }
        });


        bKeluarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(ListLayouts.this, KeluargaActivity.class);

                startActivity(i);

            }
        });

    }
}