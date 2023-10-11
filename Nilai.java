/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan1_PBO;

/**
 *
 * @author lenovo
 */
public class Nilai {
     String nim;
    String nama;
    int absen;
    int tugas;
    int uts;
    int uas;
    
    // Method untuk mencetak nilai
    public void CetakNilai() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Absen: " + absen);
        System.out.println("Tugas: " + tugas);
        System.out.println("UTS: " + uts);
        System.out.println("UAS: " + uas);
        System.out.println("Nilai Akhir: " + HitungNilaiAkhir());
    }

    // Method untuk menghitung nilai akhir
    public double HitungNilaiAkhir() {
        // Anda dapat mengatur bobot masing-masing komponen nilai sesuai kebijakan Anda
        double bobotAbsen = 0.10;
        double bobotTugas = 0.20;
        double bobotUTS = 0.30;
        double bobotUAS = 0.40;

        // Menghitung nilai akhir
        double nilaiAkhir = (absen * bobotAbsen) + (tugas * bobotTugas) + (uts * bobotUTS) + (uas * bobotUAS);
        return nilaiAkhir;
    }
}
