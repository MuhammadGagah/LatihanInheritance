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
public class Balok extends PersegiPanjang {
    private int tinggi;
    public void setTinggi(int t) {
        tinggi = t;
    }
    public int getTinggi() {
        return tinggi;
    }
    public int Volume() {
        int v = getPanjang() * getLebar() * tinggi;
        return v;
    }
    }