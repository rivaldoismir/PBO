package uts;

import java.util.Scanner;
import java.util.Stack;

public class Fungsi {
    Stack<Character> stackPoint = new Stack<>();
    Stack<Character> kiri = new Stack<>();
    Stack<Character> kanan = new Stack<>();
    public String In_Stack() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input data persamaan  : ");
        String inputan = input.next();
        return inputan;
    }
    public String conversiStringToStack(String inputan){
        String cekInputan = "y";
        int idx = inputan.indexOf("=");
        int idx2 = inputan.indexOf("1");
        if (idx == -1 || idx2 == -1){
            System.out.println("persamaan yang tidak valid");
            cekInputan = "x";
        }
        String z = "+";
        char plus = z.charAt(0);
        String k = "=1";
        char equal = k.charAt(0);
        char one = k.charAt(1);
        for (int i = 0; i < inputan.length(); i ++){
            if (inputan.charAt(i) != plus){
                this.stackPoint.push(inputan.charAt(i));
                if (inputan.charAt(i) != one && inputan.charAt(i) != equal){
                    System.out.println("Persamaan tidak valid karena karakter yang diijinkan hanya 1,+,dan =");
                    cekInputan = "x";
                }

            }
        }
        return cekInputan;
    }
    public void cekInput(Stack stack,String inputan){
        String k = "=1";
        char equal = k.charAt(0);
        char one = k.charAt(1);
        int counter = 0;
        Boolean cek = false;
        kiri = stackPoint;
        for (int j = 0; j < stackPoint.size();j++){
            if (kiri.peek() == one){
                kanan.push(kiri.pop());
            }
            if (kiri.peek() == equal){
                kiri.pop();
                counter ++;
                if (counter == 2) {
                    System.out.println("Persamaan tidak valid (Sama dengan hanya boleh satu)");
                    cek = true;
                    break;
                }
            }
        }
        if (!cek){
            if (kiri.size() == kanan.size()){
                System.out.println("Persamaan valid");
            }
            if (kiri.size() != kanan.size()){
                System.out.println("Persamaan tidak valid");
            }
        }
    }
}