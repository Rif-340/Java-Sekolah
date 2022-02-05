/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siswa;

/**
 *
 * @author rpl
 */
public class Siswa {
String nama;
String kelas;
int umur;

    public static void main(String[] args) {
      
     Siswa siswa1 = new Siswa();
     
     siswa1.nama = "Udin";
     siswa1.kelas = "X-PPLG";
     siswa1.umur = 10;
     
        System.out.println("Nama :"+siswa1.nama);
        System.out.println("Kelas :"+siswa1.kelas);
        System.out.println("Umur :"+siswa1.umur);
    }
    
}
