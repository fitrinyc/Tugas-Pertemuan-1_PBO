/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan1_PBO;

/**
 *
 * @author lenovo
 */
public class DemoNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilaiAkhir = new Nilai();

        nilaiAkhir.nim = "2210631170021";
        nilaiAkhir.nama = "Fitria Novyanti Taufik";
        nilaiAkhir.absen = 100;
        nilaiAkhir.tugas = 95;
        nilaiAkhir.uts = 88;
        nilaiAkhir.uas = 92;

        nilaiAkhir.CetakNilai();


    }
    
}
