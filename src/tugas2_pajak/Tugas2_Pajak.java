/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2_pajak;

import java.util.Scanner;
/**
 *
 * @author arrai
 */
public class Tugas2_Pajak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tugas2_Pajak baca = new Tugas2_Pajak();
        Scanner input = new Scanner(System.in);
        //Input Penghasilan
        System.out.println("Penghasilan : ");
        Long Penghasilan = input.nextLong();
        //Input status
        System.out.println("Status : ketik false jika Belum Menikah, true jika Sudah Menikah: ");
        boolean Status = input.nextBoolean();
        
        if(Status == false){
            int[] nilaiPTKP = {36000000, 39000000, 42000000, 45000000 };
            System.out.println("tk : ");
            int tk = input.nextInt();
                System.out.println("PTKP : " + nilaiPTKP[tk]);
                Penghasilan -= nilaiPTKP[tk];
        }
        else{
            int[] nilaiPTKP = {39000000, 42000000, 45000000, 48000000 };
            System.out.println("tk : ");
            int tk = input.nextInt();
                System.out.println("PTKP : " + nilaiPTKP[tk]);
                Long x = Penghasilan - nilaiPTKP[tk];
                
    }
        
        System.out.println("Penghasilan : " + Penghasilan);
        Long pajak ;
        if (Penghasilan > 500000000){
            pajak = (Penghasilan - 500000000)*30/100;
            //System.out.println("Pajak = " + pajak);
            pajak = pajak+(500000000*25/100);
            //System.out.println("Pajak = " + pajak);
            pajak = pajak+ (250000000*15/100);
            //System.out.println("Pajak = " + pajak);
            pajak = pajak+ (50000000*5/100);
            System.out.println("Pajak = " + pajak);}
        
        else if (Penghasilan > 250000000 && Penghasilan <= 500000000){
            pajak = (Penghasilan - 250000000)*25/100;
            //System.out.println("Pajak = " + pajak);
            pajak = pajak+ (250000000*15/100);
            //System.out.println("Pajak = " + pajak);
            pajak = pajak+ (50000000*5/100);
            System.out.println("Pajak = " + pajak);}
    
        else if (Penghasilan>50000000 && Penghasilan <= 250000000){
            pajak = (Penghasilan - 50000000)*15/100;
            pajak = pajak + (50000000*5/100);
            System.out.println("Pajak = " + pajak);}
        
        else {if (Penghasilan>0 && Penghasilan <= 50000000){
            pajak = Penghasilan*5/100;
            System.out.println("Pajak = " + pajak);
        } 
        
        
        }}}