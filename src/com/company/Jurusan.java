package com.company;


import java.util.ArrayList;

public class Jurusan {
    private final String kode;
    private final String nama;
    private final ArrayList<Mahasiswa> mhs;

    public Jurusan(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.mhs  = new ArrayList<>();
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Mahasiswa> getMhs() {
        return mhs;
    }

    public void addMahasiswa(Mahasiswa m) {
        this.mhs.add(m);
    }
}
