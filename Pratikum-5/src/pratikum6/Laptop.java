package pratikum6;
import java.util.Scanner;
import java.util.Stack;

public class Laptop {
    Stack<String> daftarLaptop;
    Laptop(){
        daftarLaptop = new Stack<String>();
    }

    public String tambahLaptop() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan merk laptop (jika selesai input, kosongkan!!) [*PUSH]= ");
        String merkLaptop = scanner.nextLine();
        if(merkLaptop.equals("")) {
            return merkLaptop;
        }
        this.daftarLaptop.push(merkLaptop);
        return  merkLaptop;
    }

    public void hapusLaptop() {
        String mantanLaptop = this.daftarLaptop.pop();
        System.out.println(mantanLaptop + " baru saja dihapus dari Daftar Laptop [*POP]");
    }

    public boolean cekLaptop() {
        if(this.daftarLaptop.empty()) {
            System.out.println("Daftar Laptop Kosong !!! [*EMPTY]");
            return false;
        }
        System.out.println("Daftar Laptop ada " + this.daftarLaptop.size() + " laptop [*EMPTY]");
        return true;
    }

    public void peekLaptop() {
        String newLaptop = this.daftarLaptop.peek();
        System.out.println(newLaptop + " adalah laptop yang paling terbaru (PEEK)");
    }

    public void cariLaptop(String namaLaptop) {
        Integer pos = (Integer) daftarLaptop.search(namaLaptop);
        if(pos == -1) {
            System.out.println(namaLaptop + " tidak tersedia [*SEARCH]");
            return;
        }
        System.out.println(namaLaptop + " ditemukan [*SEARCH]");
    }

}
