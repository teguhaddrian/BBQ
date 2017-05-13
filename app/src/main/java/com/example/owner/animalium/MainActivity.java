package com.example.owner.animalium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BBQModel BBQModel;
    BBQAdapter BBQAdapter;
    List<BBQModel> BBQModelList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        BBQAdapter = new BBQAdapter(getApplicationContext(), BBQModelList);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(BBQAdapter);

        persiapanData();


    }

    void persiapanData() {
        String[] namaIndo = {"Alif", "Ba", "Ta", "Tsa", "Jim", "Kha", "Kho", "Dal", "Dzal", "Ra", "Za", "Sin", "Syin", "Shod", "Dhod", "Tho", "Dhlo", "Ain", "Ghoin", "Fa", "Qof", "Kaf", "Lam", "Mim", "Nun", "Wawu", "Hamzah", "Ha", "Ya"};
        String[] namaEng = {"Alif", "Ba", "Ta", "Tsa", "Jim", "Kha", "Kho", "Dal", "Dzal", "Ra", "Za", "Sin", "Syin", "Shod", "Dhod", "Tho", "Dhlo", "Ain", "Ghoin", "Fa", "Qof", "Kaf", "Lam", "Mim", "Nun", "Wawu", "Hamzah", "Ha", "Ya"};
        int[] gambar = {R.drawable.alif, R.drawable.ba, R.drawable.ta, R.drawable.tsa, R.drawable.ja, R.drawable.haa, R.drawable.kho, R.drawable.da, R.drawable.dja, R.drawable.ro, R.drawable.djaa, R.drawable.sa, R.drawable.sya, R.drawable.so, R.drawable.dho, R.drawable.to, R.drawable.tjo, R.drawable.ain, R.drawable.ghoin, R.drawable.pa, R.drawable.ko, R.drawable.ka, R.drawable.la, R.drawable.mim, R.drawable.na, R.drawable.wa, R.drawable.hamzah, R.drawable.ha, R.drawable.ya};

        for (int i = 0; i < namaIndo.length; i++) {
            BBQModel = new BBQModel(namaIndo[i], namaEng[i], gambar[i]);
            BBQModelList.add(BBQModel);
        }

    }
}
