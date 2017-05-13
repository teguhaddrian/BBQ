package com.example.owner.animalium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText mNama;
    Button mMasuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mNama = (EditText) findViewById(R.id.Nama);
        mMasuk = (Button) findViewById(R.id.Tombol);

        mMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(Main2Activity.this, ListLayouts.class);
                i.putExtra("NAMA", mNama.getText().toString());

                startActivity(i);
                finish();
            }
        });
    }
}
