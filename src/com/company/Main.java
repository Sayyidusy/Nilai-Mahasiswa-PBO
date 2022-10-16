package com.company;

public class Main {

    public static void main(String[] args) {

        Jurusan jurusan1 = new Jurusan("D3RPLA", "D3 Rekayasa Prangkat Lunak Aplikasi");
        Jurusan jurusan2 = new Jurusan("D3SI", "D3 Sistem Informasi");

        Mahasiswa m1 = new Mahasiswa("6706213149", "Sayyidusy Syauqi AL GHiffari");
        Mahasiswa m2 = new Mahasiswa("6706213155", "Faiz Najmuddin");

        jurusan1.addMahasiswa(m1);
        jurusan2.addMahasiswa(m2);

        Mahasiswa m3 = new Mahasiswa("6706213143", "Ratu Yuri Meissy");
        Mahasiswa m4 = new Mahasiswa("6706213145", "Ridwan Kamil");
        Mahasiswa m5 = new Mahasiswa("6706313451", "Irham Tri Ahmadi");

        jurusan2.addMahasiswa(m3);
        jurusan2.addMahasiswa(m4);
        jurusan1.addMahasiswa(m5);

        int no = 1;
        System.out.println(
                "Kode : " + jurusan1.getKode() + "\n" +
                        "Nama : " + jurusan1.getNama() + "\n" +
                        "Daftar Mahasiswa : "
        );

        for (Mahasiswa m : jurusan1.getMhs()) {
            System.out.println(no + ". " + m.getNim() + " - " + m.getNama());
            no++;
        }

        System.out.println();

        no = 2;
        System.out.println(
                "Kode : " + jurusan2.getKode() + "\n" +
                        "Nama : " + jurusan2.getNama() + "\n" +
                        "Daftar Mahasiswa : "
        );

        for (Mahasiswa m : jurusan2.getMhs()) {
            System.out.println(no + ". " + m.getNim() + " - " + m.getNama());
            no++;
        }
    }
}
