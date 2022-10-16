package com.company;

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private ArrayList<Mahasiswa> mhs;


    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.mhs   = new ArrayList<>();
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }
}
