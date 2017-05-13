package com.example.owner.animalium;

/**
 * Created by OWNER on 07/05/2017.
 */

public class BBQModel {

    String namaIndo, namaEng;
    int gambar;

    public BBQModel(String namaIndo, String namaEng, int gambar) {
        this.namaIndo = namaIndo;
        this.namaEng = namaEng;
        this.gambar = gambar;

    }

    public String getNamaIndo() {
        return namaIndo;
    }

    public String getNamaEng() {
        return namaEng;
    }


    public int getGambar() {
        return gambar;
    }

}
