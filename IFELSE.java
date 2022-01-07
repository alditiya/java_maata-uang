package kurs_mata.uang;


import java.util.Scanner;

public class IFELSE{
    
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai Rupiah :");
        int rupiah = input.nextInt();
        double konversi_rptousd = rupiah * rptousd;
        if(rupiah >=13500) {
            DecimalFormat digit = new DecimalFormat("0.00");
            System.out.println("Rp------>USD");
            String dcikon = digit.format(konversi_rptousd);
            System.out.println("Rp"+rupiah+"="+dcikon+"USD");
        }
        else if (rupiah  <= 13500) {
            DecimalFormat digit = new DecimalFormat("0.000000000");
            System.out.println("Rp------>USD");
            String dcikon = digit.format(konversi_rptousd);
            System.out.println("Rp"+rupiah+"="+dcikon+"USD");
        }
  }
}