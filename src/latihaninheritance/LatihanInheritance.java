/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance;

/**
 *
 * @author muhammad
 */
public class LatihanInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang a= new PersegiPanjang ();
        a.setPanjang (6); a.setLebar (5);
        System.out.println("");
        System.out.println("Contoh Program Pewarisan");
        System.out.println("");
        System.out.println("Superclass Persegi Panjang");
        System.out.println(" Panjang: "+a.getPanjang ());
        System.out.println(" Lebar: "+a.getLebar ());
        System.out.println(" Luas: "+a.Luas ());
        System.out.println("");
        Balok b= new Balok();
        b.setPanjang (4);
        b.setLebar (3);
        b.setTinggi (5) ;
        System.out.println("Subclass Balok");
        System.out.println(" Panjang "+b.getPanjang () );
        System.out.println(" Lebar "+b.getLebar());
        System.out.println(" Tinggi = "+b.getTinggi ()); System.out.println(" Volume "+b.Volume () );
    }
    
}
