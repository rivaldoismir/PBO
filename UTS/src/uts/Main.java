package uts;

public class Main {

    public static void main (String [] args){
        Fungsi arr = new Fungsi();
        String in = arr.Input_Stack();

        if (arr.conversiStringToStack(in) != "x"){
            arr.cekInput(arr.stackPoint,in);
        }
    }
}