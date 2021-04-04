package pratikum5;
import java.util.ArrayList;

public class Siswa {
    //Buat class Siswa dengan atribut nim, nama,nilai teori dan nilai praktek
//    Class Siswa memiliki method setNim, setNama, setTeori, setPraktek, getNim, getNama, getTeori, getPraktek, getRata
//    Buat class nilaiSiswa yang digunakan untuk memasukkan sejumlah data disimpan dalam array dan sekal
//        igus dapat menampilkan data yang sudah di masukkan.


    private ArrayList<String> nim = new ArrayList<String>();
    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<Integer> teori = new ArrayList<Integer>();
    private ArrayList<Integer> praktek = new ArrayList<Integer>();


    void setNim(String nim){
        this.nim.add(nim);
    }

    void setNama(String nama){
        this.nama.add(nama);
    }

    void setTeori(int teori){
        this.teori.add(teori);
    }

    void setPraktek(int praktek){
        this.praktek.add(praktek);
    }

    void getNim(int i){
        System.out.printf("Nim     : %s\n",this.nim.get(i));
    }

    void getNama(int i){
        System.out.printf("Nama    : %s\n",this.nama.get(i));
    }

    void getTeori(int i){
        System.out.printf("Teori   : %d\n",this.teori.get(i));
    }

    void getPraktek(int i){
        System.out.printf("Praktek : %d\n",this.praktek.get(i));
    }

    void getRata(int i){
        System.out.printf("Rata    : %d\n\n",((this.praktek.get(i)+this.teori.get(i))/2));
    }
}



