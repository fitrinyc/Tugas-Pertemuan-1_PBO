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
        Nilai nilaiMahasiswa = new Nilai("2210631170021", "Fitria Novyanti T", 80, 90, 70, 85);

        // Memanggil method CetakNilai()
        System.out.println("Nilai Mahasiswa :");
        nilaiMahasiswa.CetakNilai();

    }
    
}
