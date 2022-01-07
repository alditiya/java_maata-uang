package kurs_mata.uang;

import java.util.Scanner;


public class outputteks {
    
    public static void main(String[] args){
       int rptousd = 13500;
       int rptorm = 4000;
       int rptosgd = 10000;
       int rptoeuro = 20000;
       Scanner input = new Scanner(System.in);
       System.out.println("Konversi Kurs Mata Uang Rupiah");
       System.out.println("--->");
       System.out.println("USD/Dolar US,RM/Ringgit Malay,SGD/dolar singapura,EURO/Poundsterling");
       System.out.println("--------------------------------");
       System.out.println("Info Kurs");
       System.out.println("1 USD = Rp13.500");
       System.out.println("1 RM = Rp4.000");
       System.out.println("1 SGD = Rp10.000");
       System.out.println("1 EURO= Rp20.000");
       System.out.println("--------------------------------");
       System.out.println("Masukan Nilai Rupiah :");
        int rupiah = input.nextInt();
        //Perhitungan kurs rupiah to usd
        int konversi_rptousd = rupiah / rptousd;
        int konversi_rptosgd = rupiah / rptosgd;
        int konversi_rptorm = rupiah / rptorm;
        int konversi_rptoeuro = rupiah / rptoeuro;
       System.out.println("konversi Rp to Usd =" + konversi_rptousd);
       System.out.println("konversi Rp to Sgd =" + konversi_rptosgd);
       System.out.println("konversi Rp to RM =" + konversi_rptorm);
       System.out.println("konversi Rp to Euro =" + konversi_rptoeuro);
    }
}