/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarlogikajava.java;

/**
 *
 * @author rpl
 */
public class MethodParameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) //Muhammad Arif Wicaksono X-PPLG
    {
        hitung(10,10);//dia akan pindah ke hitung bagian int
        hitung(80.5,90.5);//dia akan pindah ke bagian double
    }
    
    public static void hitung(int x,int y)
    {
        System.out.println(x+y);
    }
    
    public static void hitung(double x,double y)
    {
        System.out.println(x-y);
    }
}
