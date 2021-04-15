package pratikum6;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        // Perulangan untuk menambahkan laptop
        while (true) {
            String merkLaptop = laptop.tambahLaptop();
            if(merkLaptop.equals("")) {
                break;
            }
        }

        // Cek Jumlah Laptop [EMPTY]
        if(!laptop.cekLaptop()){
            return;
        }

        // Cek Data Teratas [PEEK]
        laptop.peekLaptop();

        // hapus laptop [DELETE]
        laptop.hapusLaptop();

        // Perulangan untuk mencari laptop [SEARCH]
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukan merk laptop yang akan dicari (jika selesai input, kosongkan!!) [*SEARCH]= ");
            String namaLaptop = scanner.nextLine();
            if(namaLaptop.equals("")) {
                break;
            }
            laptop.cariLaptop(namaLaptop);
        }
    }
}
