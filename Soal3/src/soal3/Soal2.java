package soal3;
import soal3.Model.MataKuliah;

public class Soal2 {
    public static void main(String[] args) {
        MataKuliah pbo1 = new MataKuliah();
        pbo1.kodeMataKuliah = 1;
        pbo1.namaMataKuliah = "Pemrograman Berbasis Objek 1";
        pbo1.jumlahSks = 3;
        
        System.out.println("Kode Mata Kuliah: "+pbo1.kodeMataKuliah);
        System.out.println("Nama Mata Kuliah: "+pbo1.namaMataKuliah);
        System.out.println("Jumlah SKS: "+pbo1.jumlahSks);
        
        pbo1.index();
        pbo1.store();
        pbo1.update();
        pbo1.destroy();
        pbo1.show(1);
    }
}
